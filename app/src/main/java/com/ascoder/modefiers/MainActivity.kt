package com.ascoder.modefiers

import com.ascoder.modefiers.ui.theme.ModefiersTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
                    .border(5.dp, Color.Magenta)
                    .padding(5.dp)
                    .border(5.dp, Color.Cyan)
                    .padding(5.dp)
                    .border(10.dp, Color.LightGray)
                    .padding(10.dp)
            ) {
                Text(text = "Hello")
                Spacer(modifier = Modifier.height(50.dp))
                Text(text = "World!")
            }
        }
    }
}

@Composable
fun Columns(name: String) {
    Column(
        modifier = Modifier
            .background(Color.Green)
            .fillMaxHeight(0.5f)
            .width(300.dp)
            .requiredWidth(300.dp)
    ) {
        Text(text = "Hello")
        Text(text = "World $name!")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ModefiersTheme {
        Columns("Android")
    }
}