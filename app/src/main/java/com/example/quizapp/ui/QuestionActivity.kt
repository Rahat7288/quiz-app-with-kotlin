package com.example.quizapp.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import com.example.quizapp.R
import com.example.quizapp.model.Questions
import com.example.quizapp.utils.Constants

class QuestionActivity : AppCompatActivity() {
    private lateinit var progressBar: ProgressBar
    private  lateinit var textViewProgress: TextView
    private  lateinit var textViewQuestion: TextView
    private lateinit var flagImage: ImageView


    private lateinit var textViewOptionOne: TextView
    private lateinit var textViewOptionTow: TextView
    private lateinit var textViewOptionThree: TextView
    private lateinit var textViewOptionFour: TextView
    private val currentPosition = 1
    private  lateinit var questionsList: MutableList<Questions>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        progressBar = findViewById(R.id.progress_bar)
        textViewProgress = findViewById(R.id.textview_Progress)
        textViewQuestion = findViewById(R.id.question_text_view)
        textViewOptionOne = findViewById(R.id.text_view_option_one)
        textViewOptionTow = findViewById(R.id.text_view_option_two)
        textViewOptionThree = findViewById(R.id.text_view_option_three)
        textViewOptionFour = findViewById(R.id.text_view_option_four)



        val questionsList = Constants.getQuestions()
//        checking the log if we get all the list of questions
        Log.d("QuestionSize", "${questionsList.size}")
        seQuestion()
    }
    @SuppressLint("SetTextI18n")
    private  fun seQuestion(){
        val question = questionsList[currentPosition -1]
        flagImage.setImageResource(question.image)
        progressBar.progress = currentPosition
        textViewProgress.text = "$currentPosition/${progressBar.max}"
        textViewQuestion.text = question.question
        textViewOptionOne.text = question.optionOne
        textViewOptionTow.text = question.optionTwo
        textViewOptionThree.text = question.optionThree
        textViewOptionFour.text = question.optionFour
    }
}