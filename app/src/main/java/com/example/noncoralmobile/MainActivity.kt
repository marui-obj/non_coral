package com.example.noncoralmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_debug_page)

        val loginBtnClick: Button = findViewById(R.id.button2)
        val selectModeBtnClick: Button = findViewById(R.id.button4)
        val connectBtnClick: Button = findViewById(R.id.button3)

        loginBtnClick.setOnClickListener{
            val loginPage = Intent(this, LoginActivity::class.java)
            startActivity(loginPage)
        }
        selectModeBtnClick.setOnClickListener{
            val selectModePage = Intent(this, SelectModeActivity::class.java)
            startActivity(selectModePage)
        }
        connectBtnClick.setOnClickListener {
            val connectPage = Intent(this, ConnectActivity::class.java)
            startActivity(connectPage)
        }


    }
}