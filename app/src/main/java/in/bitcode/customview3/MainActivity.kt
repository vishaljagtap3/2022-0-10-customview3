package `in`.bitcode.customview3

import `in`.bitcode.customview3.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private var tasksList = ArrayList<String>()
    private lateinit var tasksAdapter : TasksAdapter

    init {
        tasksList.add("Pay bills")
        tasksList.add("Watch movies")
        tasksList.add("Do not work on android")
        tasksList.add("Do not work hard")
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