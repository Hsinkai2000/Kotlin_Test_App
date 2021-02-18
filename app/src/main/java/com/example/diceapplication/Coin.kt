package com.example.diceapplication

class Coin {
    val faces = listOf("Heads", "Tails")

    fun flip(): String {
        return faces.get((1..2).random())
    }
}