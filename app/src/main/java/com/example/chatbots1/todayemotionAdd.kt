package com.example.chatbots1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_todayemotion_add.*


class todayemotionAdd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todayemotion_add)

        backbtn1.setOnClickListener{
            val intent = Intent(this, emotioncal::class.java)
            startActivity(intent)
        }
    }


}