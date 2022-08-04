package com.example.diceroller


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    // function onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // declare two variables for button and text
        val rollButton : Button = findViewById(R.id.btn_roll)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    //Function for roll the dice and update the screen with the result.
    private fun rollDice() {
        // create object
        val dice = Dice(6)

        // save the result number
        val diceRoll = dice.roll()

        // reference to imageView
        val imageDice : ImageView = findViewById(R.id.image_dice)

        // check number of dice roll and update screen (UI) by image
        when (diceRoll) {
            1 -> imageDice.setImageResource(R.drawable.dice_1)
            2 -> imageDice.setImageResource(R.drawable.dice_2)
            3 -> imageDice.setImageResource(R.drawable.dice_3)
            4 -> imageDice.setImageResource(R.drawable.dice_4)
            5 -> imageDice.setImageResource(R.drawable.dice_5)
            6 -> imageDice.setImageResource(R.drawable.dice_6)
        }

    }
}