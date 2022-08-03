package com.example.rollthedice

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat

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
    @SuppressLint("UseCompatLoadingForDrawables")
    private fun rollDice() {
        //Create new Dice Array object with 6 sides and roll it
//        val diceArray = arrayOf("⚀", "⚁", "⚂", "⚃", "⚄", "⚅")
        //Tracking the textview element with the dice roll
//        val showtext: TextView = findViewById(R.id.textView)
//        val showtext2: TextView = findViewById(R.id.textView2)
        val showImage: ImageView = findViewById(R.id.imageView)
        val showSecondImage:ImageView=findViewById(R.id.imageView2)
        //Using an Array to contain dice typetext and then index it using rolled number
        //Array starts to zero so applied a negative 1 to reach 0 index and 5th index
//        showtext.text = diceArray[Dice(6).roll() - 1]
//        showtext2.text = diceArray[Dice(6).roll() - 1]
        // Create an array of image id or path location
        val diceImageArray = arrayOf(
            ResourcesCompat.getDrawable(resources,R.drawable.dice_1,null),
            ResourcesCompat.getDrawable(resources,R.drawable.dice_2,null),
            ResourcesCompat.getDrawable(resources,R.drawable.dice_3,null),
            ResourcesCompat.getDrawable(resources,R.drawable.dice_4,null),
            ResourcesCompat.getDrawable(resources,R.drawable.dice_5,null),
            ResourcesCompat.getDrawable(resources,R.drawable.dice_6,null),
        )
        //Using an Array image shows and set by index rolled by the dice
        showImage.setImageDrawable(diceImageArray[Dice(6).roll()-1])
        showSecondImage.setImageDrawable(diceImageArray[Dice(6).roll()-1])


    }
}