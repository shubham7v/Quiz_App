package com.shubham.quizapp

data class QuestionData(
    var Id:Int,
    var Question:String,
    var option_one:String,
    var option_two:String,
    var option_three:String,
    var option_four:String,
    var correct_ans:Int,
)