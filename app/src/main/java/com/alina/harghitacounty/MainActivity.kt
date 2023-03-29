package com.alina.harghitacounty

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.rememberNavController
import com.alina.harghitacounty.navigation.HarghitaCountyNavHost
import com.alina.harghitacounty.ui.theme.HarghitaCountyTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HarghitaCountyTheme {
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    HarghitaCountyNavHost(navController = navController)
                }
            }
        }
    }
}