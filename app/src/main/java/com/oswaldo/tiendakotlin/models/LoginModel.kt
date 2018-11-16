package com.oswaldo.tiendakotlin.models

import com.oswaldo.tiendakotlin.library.BindEditText

open class LoginModel: BindEditText() {

    var emailUi = BindableString()
    var passwordUi = BindableString()
}