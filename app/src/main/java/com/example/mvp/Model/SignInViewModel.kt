package com.example.mvp.Model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvp.utils.Validation

class SignInViewModel : ViewModel() {

    private val _email = MutableLiveData("")
    val email: LiveData<String> = _email

    private val _password = MutableLiveData("")
    val password: LiveData<String> = _password

    private val _errorMessage = MutableLiveData<String?>()
    val errorMessage: LiveData<String?> = _errorMessage

    private val _signInMessage = MutableLiveData<String?>()
    val signInMessage: LiveData<String?> = _signInMessage


    fun updateEmail(newEmail: String) {
        _email.value = newEmail
    }

    fun updatePassword(newPassword: String) {
        _password.value = newPassword
    }

    fun signIn() {
        val validationError =
            Validation.validateFormsignin(_email.value ?: "", _password.value ?: "")
        if (validationError != null) {
            _errorMessage.value = validationError
        } else {
            _errorMessage.value = " " // No error
            _signInMessage.value = "Successfully signed in with ${email.value} \n password ${password.value}"
        }
    }
}

