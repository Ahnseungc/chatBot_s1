package com.example.chatbots1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dignoseresult.*

class dignoseresult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dignoseresult)



        backbtn3.setOnClickListener{
            val intent = Intent(this,diagnosis2::class.java)
            startActivity(intent)
        }
    }
}