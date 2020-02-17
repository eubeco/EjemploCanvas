package com.example.ejemplocanvas

import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dibujo = MyDraw(this)
        dibujo.setBackgroundColor(Color.WHITE)
        setContentView(dibujo)
    }
}
