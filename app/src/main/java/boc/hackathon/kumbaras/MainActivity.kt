@file:OptIn(ExperimentalMaterial3Api::class)

package boc.hackathon.kumbaras

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import boc.hackathon.kumbaras.ui.theme.AppTheme

@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                MainScreen({},{})
            }
        }
    }
}
