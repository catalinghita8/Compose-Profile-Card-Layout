package com.codingtroops.profilecardlayout.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = teal200,
    primaryVariant = purple700,
    secondary = purple500,
    surface = veryLightGrey,
)

private val LightColorPalette = lightColors(
    primary = teal200,
    primaryVariant = purple700,
    secondary = purple500,
    surface = veryLightGrey,
    /* Other default colors to override
background = Color.White,

onPrimary = Color.White,
onSecondary = Color.Black,
onBackground = Color.Black,
onSurface = Color.Black,
*/
)

@Composable
fun MyTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}