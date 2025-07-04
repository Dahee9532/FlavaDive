package com.example.flavadive.ui.find

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class FindViewModel : ViewModel() {
    var phoneNumber by mutableStateOf("")
}