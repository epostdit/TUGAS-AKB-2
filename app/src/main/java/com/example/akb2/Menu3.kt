package com.example.akb2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu3.*

class Menu3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu3)

        button4.setOnClickListener {
            val intent = Intent(this,Menu4::class.java)
            startActivity(intent)
        }
    }
}
