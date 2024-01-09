package com.example.quizapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.quizapp.R
import com.example.quizapp.utils.Constants

class QuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        val questionsList = Constants.getQuestions()
//        checking the log if we get all the list of questions
        Log.d("QuestionSize", "${questionsList.size}")
    }
}