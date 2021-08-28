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
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }
        if (existingUsers.contains(username)) {
            return false
        }
        if (password != confirmPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 2) {
            return false
        }
        return true
    }
}