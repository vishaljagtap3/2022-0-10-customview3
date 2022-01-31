package `in`.bitcode.customview3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TasksAdapter(private var tasksList: ArrayList<String>) :
    RecyclerView.Adapter<TasksAdapter.TaskViewHolder>() {


    class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var taskView : TaskView

        init {
            taskView = itemView as TaskView
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
        holder.taskView.text = tasksList[position]
    }

}