package com.estoniaTech.damasApp

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.damasapp.R

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the WebView from the layout
        val webView = findViewById<WebView>(R.id.webview)

        // Enable JavaScript (if needed)
        webView.settings.javaScriptEnabled = true
        // Enable JavaScript and other settings
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.settings.cacheMode = android.webkit.WebSettings.LOAD_DEFAULT  // Enable cache

        // Set a WebViewClient to load URLs in the WebView itself
        webView.webViewClient = WebViewClient()
        // Load the website
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://damasdeferro.com.br/traduzindo-a-liberdade-app/")
    }
}