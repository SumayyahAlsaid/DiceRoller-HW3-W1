package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // function onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // declare two variables for button and text
        val rollButton : Button = findViewById(R.id.btn_roll)
        val numberText : TextView = findViewById(R.id.txt_number)

        // function for event toast when on click button
        rollButton.setOnClickListener {

            // declare variable for toast
            val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT)

            // function for show toast
            toast.show()
        }
    }
}