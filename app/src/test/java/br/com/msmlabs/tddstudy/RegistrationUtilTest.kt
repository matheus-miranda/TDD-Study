package br.com.msmlabs.tddstudy

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Jack",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Peter",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password is empty returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Peter",
            password = "",
            confirmPassword = ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password is not the same as confirmation returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Peter",
            password = "123",
            confirmPassword = "456"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password has less than two digits returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Peter",
            password = "abcd1",
            confirmPassword = "abcd1"
        )
        assertThat(result).isFalse()
    }
}