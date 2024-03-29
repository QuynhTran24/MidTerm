package com.example.midtermtest

sealed class Screen(val rout:String){
    object Login : Screen("login")
    object SignUp : Screen("signup")
}
