package com.example.flavadive.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.flavadive.R

// Set of Material typography styles to start with
val notosanskr = FontFamily(
    Font(R.font.notosans_kr_thin, FontWeight.Thin, FontStyle.Normal),
    Font(R.font.notosans_kr_extra_light, FontWeight.ExtraLight, FontStyle.Normal),
    Font(R.font.notosans_kr_light, FontWeight.Light, FontStyle.Normal),
    Font(R.font.notosans_kr_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.notosans_kr_medium, FontWeight.Medium, FontStyle.Normal),
    Font(R.font.notosans_kr_semi_bold, FontWeight.SemiBold, FontStyle.Normal),
    Font(R.font.notosans_kr_bold, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.notosans_kr_extra_bold, FontWeight.ExtraBold, FontStyle.Normal),
    Font(R.font.notosans_kr_black, FontWeight.Black, FontStyle.Normal),
)
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)