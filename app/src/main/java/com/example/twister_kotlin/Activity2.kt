package com.example.twister_kotlin

//import android.R
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        // Jon was here

        val button_roll = findViewById<Button>(R.id.roll_button)
        button_roll.setOnClickListener {
            //val roll_part = (1..4).random()
            //val roll_color = (1..4).random()
            val roll1 = (0..3).random()
            val roll2 = (0..3).random()
//            val rand = (0 until 4).shuffled().last()
//            tvrandom.setText("" + rand)
            val textView_color = findViewById(R.id.text_view_color) as TextView
            val textView_part = findViewById(R.id.text_view_part) as TextView
            //textView.text = roll.toString()

         /*   when (roll_part) {
               *//* 1 -> textView.text = roll.toString()//Left foot: Red, Green, Yellow, Blue
                2 -> textView.text = roll.toString()//Right foot: Red, Green, Yellow, Blue
                3 -> textView.text = roll.toString()//Left Hand: Red, Green, Yellow, Blue
                4 -> textView.text = roll.toString()//Right Hand: Red, Green, Yellow, Blue*//*
                1 -> textView.text = "Left Hand "
                2 -> textView.text = "Right Hand"
                3 -> textView.text = "Left Foot"
                4 -> textView.text = "Right Foot"

            }
            when(roll_color){
                1 -> textView.text = "Red"
                2 -> textView.text = "Green"
                3 -> textView.text = "Yellow"
                4 -> textView.text = "Blue"

            }*/


            var colors_array: Array<String> = arrayOf("Green", "Red", "Blue", "Yellow")
            var parts_array: Array<String> = arrayOf("Left Foot", "Right Foot", "Left Hand", "Right Hand")

            //colors_array[roll].toString()
            textView_color.text = colors_array[roll1]
            textView_part.text = parts_array[roll2]

        }

    }
}
