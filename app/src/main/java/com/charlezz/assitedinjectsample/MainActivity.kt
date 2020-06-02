package com.charlezz.assitedinjectsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var input: EditText
    private lateinit var createBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        input = findViewById(R.id.input)
        createBtn = findViewById(R.id.btn)
        createBtn.setOnClickListener {

            val name = input.text.toString()
            if (name.isNotEmpty()) {
                startActivity(Intent(this, RobotActivity::class.java).apply {
                    putExtra("name", name)
                })
            } else {
                Toast.makeText(this, "Please Input robot name", Toast.LENGTH_SHORT).show()
            }

        }


    }
}