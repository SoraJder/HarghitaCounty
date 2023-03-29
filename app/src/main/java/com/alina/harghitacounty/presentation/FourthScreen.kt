package com.alina.harghitacounty.presentation

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import com.alina.harghitacounty.model.objectives_list

@Composable
fun FourthScreen(placeIndex: Int?) {
    val place = placeIndex?.let { index ->
        objectives_list[index]
    }

    place?.link?.let { link ->
        AndroidView(factory = { context ->
            WebView(context).apply {
                webViewClient = WebViewClient()
                loadUrl(link)
            }
        })
    }
}