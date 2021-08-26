package com.codingtroops.profilecardlayout.ui

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val shapes = Shapes(
        small = RoundedCornerShape(4.dp),
        medium = CutCornerShape(topEnd = 24.dp),
        large = RoundedCornerShape(0.dp)
)