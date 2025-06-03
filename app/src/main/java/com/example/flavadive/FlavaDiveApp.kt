package com.example.flavadive

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.flavadive.Login.LoginScreen
import com.example.flavadive.Register.RegisterName
import com.example.flavadive.Register.RegisterNickName
import com.example.flavadive.Register.RegisterPassword
import com.example.flavadive.Register.RegisterPasswordAgain
import com.example.flavadive.Register.RegisterPhoneNumber
import com.example.flavadive.Register.RegisterRole

@Composable
fun FlavaDiveApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable("login") {
            LoginScreen(navController)
        }
        composable("name") {
            RegisterName(navController)
        }
        composable("phoneNumber/{name}") { backStackEntry ->
            RegisterPhoneNumber(
                navController = navController,
                name = backStackEntry.arguments?.getString("name") ?: "",
            )
        }
        composable("nickName/{name}/{phoneNumber}") { backStackEntry ->
            RegisterNickName(
                navController = navController,
                name = backStackEntry.arguments?.getString("name") ?: "",
                phoneNumber = backStackEntry.arguments?.getString("phoneNumber") ?: "",
            )
        }
        composable("password/{name}/{phoneNumber}/{nickName}") { backStackEntry ->
            RegisterPassword(
                navController = navController,
                name = backStackEntry.arguments?.getString("name") ?: "",
                phoneNumber = backStackEntry.arguments?.getString("phoneNumber") ?: "",
                nickName = backStackEntry.arguments?.getString("nickName") ?: "",
            )
        }
        composable("passwordAgain/{name}/{phoneNumber}/{nickName}/{password}") { backStackEntry ->
            RegisterPasswordAgain(
                navController = navController,
                name = backStackEntry.arguments?.getString("name") ?: "",
                phoneNumber = backStackEntry.arguments?.getString("phoneNumber") ?: "",
                nickName = backStackEntry.arguments?.getString("nickName") ?: "",
                passWord = backStackEntry.arguments?.getString("password") ?: "",
            )
        }
        composable("role/{name}/{phoneNumber}/{nickName}/{password}/{passwordAgain}") { backStackEntry ->
            RegisterRole(
                navController = navController,
                name = backStackEntry.arguments?.getString("name") ?: "",
                phoneNumber = backStackEntry.arguments?.getString("phoneNumber") ?: "",
                nickName = backStackEntry.arguments?.getString("nickName") ?: "",
                passWord = backStackEntry.arguments?.getString("password") ?: "",
                passWordAgain = backStackEntry.arguments?.getString("passwordAgain") ?: "",
            )
        }
    }
}