package com.hustle.razorpaydemo

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavGraph(){
    val navController = rememberNavController()
    val start="main"
    NavHost(navController = navController, startDestination = start){
        composable("main"){
            MainPage(vm = PaymentViewModel(),context=LocalContext.current)
        }
    }
}