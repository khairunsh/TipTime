package com.shii.tiptime

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.shii.tiptime.ui.theme.TipTimeTheme
import org.junit.Rule
import org.junit.Test

class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip() {
        composeTestRule.setContent {
            TipTimeTheme {
                TipTimeScreen()
            }
        }

        composeTestRule.onNodeWithText("Bill Amount")
            .performTextInput("10000")
        composeTestRule.onNodeWithText("Tip (%)")
            .performTextInput("20")

        composeTestRule.onNodeWithText("Tip amount: Rp2.000,00").assertExists()
    }
}
