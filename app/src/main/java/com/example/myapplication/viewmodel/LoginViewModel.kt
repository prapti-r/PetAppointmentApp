package com.example.myapplication.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.myapplication.model.LoginState

class LoginViewModel : ViewModel() {

    private val _uiState = mutableStateOf(LoginState())
    val uiState: State<LoginState> = _uiState

    // 1. Data (State) - Private so only this class can change it
    private val _email = mutableStateOf("")
    val email: State<String> = _email

    private val _password = mutableStateOf("")
    val password: State<String> = _password

    // 2. Logic (Functions) - Called by the UI
    fun onEmailChange(newEmail: String) {
        _email.value = newEmail
    }

    fun onPasswordChange(newPassword: String) {
        _password.value = newPassword
    }

    fun performLogin() {
        // Here you would check if credentials are correct
        println("Login attempt with: ${_email.value}")
    }

    fun login() {
        if (_email.value.isEmpty()) {
            _uiState.value = LoginState(errorMessage = "Email cannot be empty")
        } else {
            _uiState.value = LoginState(isSuccess = true)
        }
    }
}

