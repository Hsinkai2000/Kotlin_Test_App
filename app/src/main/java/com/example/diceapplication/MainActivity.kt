package com.example.diceapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var myCoin: Coin = initdefaultCoin()
        var myDice: Dice = initdefaultDice()
        var randomFace = myCoin.flip()

        val btnRoll: Button = findViewById(R.id.btnRoll)
        val imgDice: ImageView = findViewById(R.id.imgDice)
        rollDice(myDice, imgDice)

        btnRoll.setOnClickListener {
            rollDice(myDice, imgDice)
        }

    }

    fun rollDice(myDice: Dice, imgDice: ImageView) {
        var randomNumber = myDice.roll()

        val drawableResource = when (randomNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        imgDice.setImageResource(drawableResource)
        imgDice.contentDescription = randomNumber.toString()
    }

    fun initdefaultCoin(): Coin {
        return Coin()
    }

    fun initdefaultDice(): Dice {
        return Dice(1, 6)
    }
}