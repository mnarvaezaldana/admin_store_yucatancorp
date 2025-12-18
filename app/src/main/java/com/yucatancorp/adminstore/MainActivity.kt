package com.yucatancorp.adminstore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.yucatancorp.adminstore.login.presentation.composables.LoginScreen
import com.yucatancorp.adminstore.ui.theme.AdminStoreYucatanCorpTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AdminStoreYucatanCorpTheme {
                LoginScreen()
            }
        }
    }
}