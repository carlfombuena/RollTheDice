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


        rollButton.setOnClickListener {
            Toast.makeText(this,"Dice Rolled", Toast.LENGTH_SHORT).show()

            rollDice()
        }
    }

    private fun rollDice() {
        val dice=Dice(6)
        val diceRoll=dice.roll()
        val showtext: TextView=findViewById(R.id.textView)
        showtext.text=diceRoll.toString()
    }
}