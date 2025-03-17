package com.example.mvp.utils

import android.util.Patterns

object Validation {

    fun validateForm(
        name: String,
        email: String,
        password: String,
        confirmPassword: String
    ): String? {
        if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            return "Fields cannot be empty"
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return "Invalid email format"
        }

        if (password != confirmPassword) {
            return "Passwords do not match"
        }

        return null
    }

    fun validateFormsignin(email: String, password: String): String? {
        if (email.isEmpty() || password.isEmpty()) {
            return "Fields cannot be empty"
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return "Invalid email format"
        }

        return null
    }
}
