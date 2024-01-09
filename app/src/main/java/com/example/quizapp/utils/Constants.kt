package com.example.quizapp.utils

import com.example.quizapp.R
import com.example.quizapp.model.Questions

object Constants {
    fun getQuestions(): MutableList<Questions>{
        val questions = mutableListOf<Questions>()
        val quest1 = Questions(
            id = 1, "What Country this Flag belong?",  R.drawable.spain, "Italy", "Bangladesh", "India", "Spain", 1
        )

        questions.add(quest1)

        val quest2 = Questions(2, "What country this Flag belong", R.drawable.argenttina, "Argentina", "Brazil", "Bangladesh", "Spain",1)
        questions.add(quest2)

        val quest3 = Questions(3, "What country this Flag belong", R.drawable.uk, "USA","Bangladesh", "UK", "Rashia",3)
        questions.add(quest3)

        val quest4 = Questions(4, "what country this Flag belong",R.drawable.franch,"Franch","Bangladesh","USA","India",1)
        questions.add(quest4)
        val quest5 = Questions(5,"what country this Flug belong",R.drawable.usa,"Bangladesh","UK","USA","India",3)
        questions.add(quest5)
        return questions
    }
}