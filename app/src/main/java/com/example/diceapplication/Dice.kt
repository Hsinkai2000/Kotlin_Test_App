package com.example.diceapplication

class Dice(private var diceMin: Int, private var diceMax: Int) {

    fun roll(): Int {
        val randomNumber = (this.diceMin..this.diceMax).random()
        return randomNumber
    }
}