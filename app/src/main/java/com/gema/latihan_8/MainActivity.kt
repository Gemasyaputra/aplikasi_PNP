package com.gema.latihan_8

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btn_mi : Button
    private lateinit var btn_tm : Button
    private lateinit var btn_glr : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btn_mi = findViewById(R.id.button_mi)
        btn_tm = findViewById(R.id.button_tm)
        btn_glr = findViewById(R.id.button3)

        btn_mi.setOnClickListener(){
            val intent = Intent(this, TI ::class.java)
            startActivity(intent)

        }

        btn_tm.setOnClickListener(){
            val intent = Intent(this, TM ::class.java)
            startActivity(intent)
        }

        btn_glr.setOnClickListener(){
            val intent = Intent(this, RecycleCardJurusan ::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}