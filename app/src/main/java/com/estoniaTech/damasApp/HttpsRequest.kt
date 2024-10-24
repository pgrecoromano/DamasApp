package com.estoniaTech.damasApp
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

class HttpsRequest {
    companion object {
        fun fetchWebsiteContent(url: String): String? {
            val client = OkHttpClient()

            val request = Request.Builder()
                .url(url)
                .build()

            return try {
                val response: Response = client.newCall(request).execute()
                response.body?.string()
            } catch (e: IOException) {
                e.printStackTrace()
                null
            }
        }
    }
}