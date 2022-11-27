package com.example.noncoralmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog

class SelectModeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_mode)

        val dialogBtnClick: ImageButton = findViewById(R.id.imageButton)

        dialogBtnClick.setOnClickListener{
            val view = LayoutInflater.from(this).inflate(R.layout.dialog_popup, null)

            val alert = AlertDialog.Builder(this)
            alert.setView(view)
            val dialog = alert.create()

            dialog.show()
        }
    }
}