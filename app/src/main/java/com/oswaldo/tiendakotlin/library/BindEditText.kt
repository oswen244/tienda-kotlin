package com.oswaldo.tiendakotlin.library

import android.databinding.BindingAdapter
import android.widget.EditText
import com.oswaldo.tiendakotlin.R
import android.util.Pair
import com.oswaldo.tiendakotlin.models.BindableString

open class BindEditText {

    companion object {
        @BindingAdapter("app:binding")
        @JvmStatic
        fun bindEditText(view: EditText, bindableString: BindableString) {
            val pair: Pair<BindableString, TextWatcherAdapter> = view.getTag(R.id.bound_observable) as Pair<BindableString, TextWatcherAdapter>
            if(pair.first != bindableString){
                view.removeTextChangedListener(pair.second)

                val watcher = object : TextWatcherAdapter() {
                    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                        bindableString.setValue(s.toString())
                    }
                }

                view.setTag(R.id.bound_observable, Pair<BindableString, TextWatcherAdapter>(bindableString, watcher))
                view.addTextChangedListener(watcher)
            }

            val newValue: String = bindableString.getValue()
            if(view.text.toString() != newValue){
                view.setText(newValue)
            }
        }
    }

}