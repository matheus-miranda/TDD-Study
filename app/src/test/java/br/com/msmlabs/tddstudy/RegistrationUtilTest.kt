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
}