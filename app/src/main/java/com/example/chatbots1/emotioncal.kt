package com.example.chatbots1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_emotioncal.*
import kotlinx.android.synthetic.main.activity_main.*

class emotioncal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emotioncal)

        teabtn.setOnClickListener{
            val intent = Intent(this, todayemotionAdd::class.java)
            startActivity(intent)
        }


    }
}