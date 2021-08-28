package br.com.msmlabs.tddstudy

object RegistrationUtil {

    // Mock user database
    private val existingUsers = listOf("Peter", "Carl")

    /**
     * Input is not valid if:
     * username/password is empty
     * username is already taken
     * confirmed password is not the same as password
     * password contains less than 2 digits
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        return true
    }
}