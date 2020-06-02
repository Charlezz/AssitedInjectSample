package com.charlezz.assitedinjectsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import javax.inject.Inject

class RobotActivity : AppCompatActivity() {

    @Inject
    lateinit var robotFactory: Robot.Factory

    private lateinit var message: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerRobotComponent.create().inject(this)
        setContentView(R.layout.activity_robot)
        message = findViewById(R.id.message)

        val name = intent.getStringExtra("name")
        val robot = robotFactory.create(name)
        message.text = robot.say()
    }
}