package com.example.akb2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu3.*
import kotlinx.android.synthetic.main.activity_menu4.*

class Menu4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu4)

        button5.setOnClickListener {
            val intent = Intent(this,Menu5::class.java)
            startActivity(intent)
        }
    }
}
