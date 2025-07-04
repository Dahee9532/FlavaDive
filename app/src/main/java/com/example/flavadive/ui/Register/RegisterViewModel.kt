package com.example.flavadive.ui.Register

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class RegisterViewModel : ViewModel() {
    var name by mutableStateOf("")
    var phoneNumber by mutableStateOf("")
    var id by mutableStateOf("")
    var password by mutableStateOf("")
    var passwordAgain by mutableStateOf("")
    var isHost by mutableStateOf(false)
}