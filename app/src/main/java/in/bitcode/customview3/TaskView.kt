package `in`.bitcode.customview3

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.TextView

@SuppressLint("AppCompatCustomView")
class TaskView(context: Context, attributeSet: AttributeSet?) : TextView(context, attributeSet) {

    private var paint = Paint()

    init {
        paint.color = Color.RED
    }

    constructor(context: Context) : this(context, null)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawLine(100F, 0F, 100F, height.toFloat(), paint)
        canvas?.drawLine(140F, 0F, 140F, height.toFloat(), paint)
    }
}