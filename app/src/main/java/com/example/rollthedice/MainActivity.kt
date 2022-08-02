package com.example.rollthedice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)

// this part is when you click the button triggers the function
        rollButton.setOnClickListener {
            Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }
//This part controll the dice function
    private fun rollDice() {
    //Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
    //Update the textview element with the dice roll
    val showtext: TextView = findViewById(R.id.textView)
    //Conditional Statement to alter textview element to show typeface dice
    if(diceRoll==1){
        showtext.text = "⚀"
    }else if (diceRoll==2)
    {
        showtext.text = "⚁"
    }
    else if (diceRoll==3)
    {
        showtext.text = "⚂"
    }
    else if (diceRoll==4)
    {
        showtext.text = "⚃"
    }
    else if (diceRoll==5)
    {
        showtext.text = "⚄"
    }
    else
    {
        showtext.text = "⚅"
    }

    }
}