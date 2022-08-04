package com.example.chatbots1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_diagnosis2.*

class diagnosis2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diagnosis2)

        backbtn2.setOnClickListener{
            val intent = Intent(this, diagnosis::class.java)
            startActivity(intent)
        }
    }
}