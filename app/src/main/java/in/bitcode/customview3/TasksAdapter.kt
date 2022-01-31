package `in`.bitcode.customview3

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TasksAdapter(private var tasksList: ArrayList<Task>) :
    RecyclerView.Adapter<TasksAdapter.TaskViewHolder>() {


    inner class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var taskView : TaskView

        init {
            taskView = itemView as TaskView

            taskView.setOnClickListener {
                tasksList[adapterPosition].state = !tasksList[adapterPosition].state
                notifyItemChanged(adapterPosition)
            }
        }
    }

    override fun getItemCount(): Int {
        if (tasksList == null) {
            return 0
        }
        return tasksList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        return TaskViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.task_layout, null)
        )
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.taskView.text = tasksList[position].title
        if(tasksList[position].state) {
            holder.taskView.setTextColor(Color.GREEN)
        }
        else {
            holder.taskView.setTextColor(Color.BLACK)
        }
    }

}