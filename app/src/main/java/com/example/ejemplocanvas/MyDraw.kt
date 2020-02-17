package com.example.ejemplocanvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.widget.AppCompatButton

class MyDraw(context: Context?) : AppCompatButton(context) {
    var paint: Paint = Paint()

    override fun onDraw(canvas: Canvas) {
        paint.color = Color.RED
        canvas.drawRect(50F, 50F, 150F, 150F, paint)
        paint.color = Color.BLUE
        canvas.drawRect(900F, 50F, 1000F, 150F, paint)
        paint.color = Color.GREEN
        canvas.drawRect(50F, 800F, 150F, 900F, paint)
        paint.color = Color.YELLOW
        canvas.drawRect(900F, 800F, 1000F, 900F, paint)


        paint.color= Color.MAGENTA
        paint.setStrokeWidth(30F)
        paint.setStyle(Paint.Style.STROKE)
        paint.setAntiAlias(true)
        paint.setDither(true)
        canvas.drawCircle (525F,  450F,  300F, paint)

        paint.color = Color.CYAN
        canvas.drawPoint(525F, 450F,  paint)

    }
}