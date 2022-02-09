package com.example.dicerollfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count:Int = 0
    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.btnRoll)
        val tvCountUp : TextView = findViewById(R.id.tvCountUp)
        diceImage = findViewById(R.id.dice_image)

        btn.setOnClickListener(){
            //Toast.makeText(applicationContext,"Clicked", Toast.LENGTH_LONG).show()
            generateRandomNo()

            if(count < 6)
            {
                count += 1
                tvCountUp.text = count.toString()
            }
        }
    }

    fun generateRandomNo() {

        val number = (1..6).random()
        val drawableResource = when (number) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
    }
}