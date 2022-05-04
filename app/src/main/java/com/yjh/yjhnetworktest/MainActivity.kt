package com.yjh.yjhnetworktest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.webViewBtn).setOnClickListener {
            myStartActivity<WebViewActivity>()
        }

        findViewById<Button>(R.id.httpBtn).setOnClickListener {
            myStartActivity<HttpURLConnectionActivity>()
        }
    }

    private inline fun <reified T> myStartActivity(){
        startActivity(Intent(MyApplication.context, T::class.java))
    }
}