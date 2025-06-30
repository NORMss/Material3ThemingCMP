package ru.normno.material3themingcmp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Material3ThemingCMP",
    ) {
        App()
    }
}