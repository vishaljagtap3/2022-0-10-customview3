package `in`.bitcode.customview3

import `in`.bitcode.customview3.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private var tasksList = ArrayList<Task>()
    private lateinit var tasksAdapter : TasksAdapter

    init {
        for(i in 0 until 30) {
            tasksList.add(Task("Sample Task number $i", (i%2) == 0, i % 3 ))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(
            layoutInflater,
            null,
            false
        )
        setContentView(binding.root)

        tasksAdapter = TasksAdapter(tasksList)
        binding.recyclerTasks.adapter = tasksAdapter

        binding.recyclerTasks.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )
    }
}