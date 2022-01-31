package `in`.bitcode.customview3

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

@SuppressLint("AppCompatCustomView")
class TaskView(context: Context, attributeSet: AttributeSet?) :
    LinearLayout(context, attributeSet) {

    private var paint = Paint()
    private var imgTaskType : ImageView
    private var txtTaskTitle : TextView

    init {
        paint.color = Color.RED
        var view = LayoutInflater.from(context).inflate(R.layout.task_layout, this)
        //this.addView(view)

        imgTaskType = view.findViewById(R.id.imgTaskType)
        txtTaskTitle = view.findViewById(R.id.txtTaskTitle)
    }


    var task: Task? = null
        set(value) {
            field = value
            txtTaskTitle.text = value?.title
            if(value?.state == true) {
                txtTaskTitle.setTextColor(Color.GREEN)
            }
            else {
                txtTaskTitle.setTextColor(Color.BLACK)
            }
            when( value?.type) {
                Task.TYPE_HOME ->
                    imgTaskType.setImageResource(R.drawable.icon_home)
                Task.TYPE_PERSONAL ->
                    imgTaskType.setImageResource(R.drawable.icon_heart)
                Task.TYPE_OFFICE ->
                    imgTaskType.setImageResource(R.drawable.icon_schedule)
            }
        }


    constructor(context: Context) : this(context, null)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawLine(100F, 0F, 100F, height.toFloat(), paint)
        canvas?.drawLine(140F, 0F, 140F, height.toFloat(), paint)
    }
}