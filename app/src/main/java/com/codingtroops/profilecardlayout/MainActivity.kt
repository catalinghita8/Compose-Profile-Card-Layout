package com.codingtroops.profilecardlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codingtroops.profilecardlayout.ui.ProfileCardLayoutTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.LightGray
    ) {
        ProfileCard()
    }
}

@Composable
fun ProfileCard() {
    Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = 8.dp) {
        Row(modifier = Modifier.wrapContentSize()) {
            ProfilePicture()
            ProfileContent()
        }

    }
}

@Composable
fun ProfilePicture() {

}

@Composable
fun ProfileContent() {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}