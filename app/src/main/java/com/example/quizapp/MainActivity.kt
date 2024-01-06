package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.quizapp.ui.QuestionActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonStart: Button = findViewById(R.id.nameInput)
        val editTextName: EditText = findViewById(R.id.name)

        buttonStart.setOnClickListener {
            if(!editTextName.text.isEmpty()){
                Intent(this@MainActivity,QuestionActivity::class.java).also {
                    startActivity(it)
                    finish()
                }
            }else{
                Toast.makeText(this@MainActivity, "Please enter the name", Toast.LENGTH_LONG).show()
            }
        }
    }
}