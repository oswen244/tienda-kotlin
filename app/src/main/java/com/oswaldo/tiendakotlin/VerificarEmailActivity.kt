package com.oswaldo.tiendakotlin

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import com.oswaldo.tiendakotlin.databinding.ActivityVerificarEmailBinding
import com.oswaldo.tiendakotlin.viewModels.LoginViewModel

/**
 * A login screen that offers login via email/password.
 */
class VerificarEmailActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityVerificarEmailBinding>(this, R.layout.activity_verificar_email)

        binding.emailModel = LoginViewModel(this, binding)

        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = this.resources.getColor(R.color.colorPrimaryDark, null)
    }

}
