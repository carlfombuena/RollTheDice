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
    val secondDice=Dice(6)
        val diceRoll = dice.roll()
        val secondDiceRoll=secondDice.roll()
        val diceArray= arrayOf("⚀","⚁","⚂","⚃","⚄","⚅")
    //Tracking the textview element with the dice roll
    val showtext: TextView = findViewById(R.id.textView)
    val showtext2: TextView = findViewById(R.id.textView2)
    //Using an Array to contain dice typetext and then index it using rolled number
    //Array starts to one so applied a negative 1 to reach 0 index and 5th index
    showtext.text=diceArray[diceRoll-1]
    showtext2.text=diceArray[secondDiceRoll-1]



    }
}