package com.gema.latihan_8

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_image)

        val imageView = findViewById<ImageView>(R.id.detailImageView)

        // Ambil data gambar dari Intent
        val imageResId = intent.getIntExtra("imageResId", 0)

        // Set gambar di ImageView
        if (imageResId != 0) {
            imageView.setImageResource(imageResId)
        }
    }
}