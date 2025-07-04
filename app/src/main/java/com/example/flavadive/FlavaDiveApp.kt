package com.example.flavadive

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.flavadive.ui.Login.LoginScreen
import com.example.flavadive.ui.Register.RegisterId
import com.example.flavadive.ui.Register.RegisterName
import com.example.flavadive.ui.Register.RegisterPassword
import com.example.flavadive.ui.Register.RegisterPasswordAgain
import com.example.flavadive.ui.Register.RegisterPhoneNumber
import com.example.flavadive.ui.Register.RegisterRole
import com.example.flavadive.ui.Register.RegisterViewModel
import com.example.flavadive.ui.find.FindIdScreen
import com.example.flavadive.ui.find.FindPwdScreen
import com.example.flavadive.ui.find.FindViewModel

@Composable
fun FlavaDiveApp() {
    val navController = rememberNavController()

    val registerViewModel: RegisterViewModel = viewModel()
    val findViewModel: FindViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable("login") { LoginScreen(navController) }
        composable("name") { RegisterName(navController, registerViewModel) }
        composable("phoneNumber") { RegisterPhoneNumber(navController, registerViewModel) }
        composable("id") { RegisterId(navController, registerViewModel) }
        composable("password") { RegisterPassword(navController, registerViewModel) }
        composable("passwordAgain") { RegisterPasswordAgain(navController, registerViewModel) }
        composable("role") { RegisterRole(navController, registerViewModel) }
        composable("findId") { FindIdScreen(navController, findViewModel) }
        composable("findPwd") { FindPwdScreen(navController, findViewModel) }
    }
}