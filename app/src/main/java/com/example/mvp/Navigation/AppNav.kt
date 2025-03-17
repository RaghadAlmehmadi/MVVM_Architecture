package com.example.mvp.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mvp.View.SignInScreen
import com.example.mvp.View.SignUpScreen

@Composable
fun AppNav(navController: NavHostController) {
    NavHost(navController, startDestination = "signIn") {
        composable("signIn") { SignInScreen(navController) }
        composable("signUp") { SignUpScreen(navController) }
    }
}