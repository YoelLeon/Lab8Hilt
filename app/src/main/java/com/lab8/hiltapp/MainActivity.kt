package com.lab8.hiltapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.lab8.hiltapp.ui.ProductScreen
import com.lab8.hiltapp.ui.theme.Lab8HiltTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab8HiltTheme {
                ProductScreen()
            }
        }
    }
}
