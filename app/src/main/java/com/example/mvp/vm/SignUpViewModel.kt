package com.example.mvp.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvp.utils.Validation

class SignUpViewModel : ViewModel() {

    private val _name = MutableLiveData("")
    val name: LiveData<String> = _name

    private val _email = MutableLiveData("")
    val email: LiveData<String> = _email

    private val _password = MutableLiveData("")
    val password: LiveData<String> = _password

    private val _confirmPassword = MutableLiveData("")
    val confirmPassword: LiveData<String> = _confirmPassword

    private val _errorMessage = MutableLiveData("")
    val errorMessage: LiveData<String> = _errorMessage

    fun updateName(newName: String) {
        _name.value = newName
    }
    fun updateEmail(newEmail: String) {
        _email.value = newEmail
    }

    fun updatePassword(newPassword: String) {
        _password.value = newPassword
    }

    fun updateConfirmPassword(newConfirmPassword: String) {
        _confirmPassword.value = newConfirmPassword
    }

    fun signUp() {
        val validationError = Validation.validateForm(_name.value ?: "",_email.value ?: "", _password.value ?: "", _confirmPassword.value ?: "")
        if (validationError != null) {
            _errorMessage.value = validationError
        } else {
            _errorMessage.value = ""
            println("Signing up with Email: ${_email.value} and Password: ${_password.value}")
        }
    }
}
