package com.example.mvp

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mvp.vm.SignInScreen
import com.example.mvp.vm.SignUpScreen

@Composable
fun AppNav(navController: NavHostController) {
    NavHost(navController, startDestination = "signIn") {
        composable("signIn") { SignInScreen(navController) }
        composable("signUp") { SignUpScreen(navController) }
    }
}