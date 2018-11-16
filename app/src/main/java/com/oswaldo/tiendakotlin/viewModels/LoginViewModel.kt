package com.oswaldo.tiendakotlin.viewModels

import android.app.Activity
import android.view.View
import com.oswaldo.tiendakotlin.databinding.ActivityVerificarEmailBinding
import com.oswaldo.tiendakotlin.interfaces.IonClick
import com.oswaldo.tiendakotlin.models.LoginModel

class LoginViewModel(activity: Activity, bindingEmail: ActivityVerificarEmailBinding): LoginModel(), IonClick {

    private var _activity: Activity? = null
    private var _bindingEmail: ActivityVerificarEmailBinding? = null

    init {
        _activity = activity
        _bindingEmail = bindingEmail
    }

    override fun onClick(view: View) {
        verificarEmail()
    }

    private fun verificarEmail(){

    }

}