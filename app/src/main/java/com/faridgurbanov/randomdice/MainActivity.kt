package com.faridgurbanov.randomdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.faridgurbanov.randomdice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.dice.setImageResource(R.drawable.dicee)

        binding.button.setOnClickListener {
            val randomnum = (1..6).random()

            when (randomnum) {
                1 -> binding.dice.setImageResource(R.drawable.dice1)
                2 -> binding.dice.setImageResource(R.drawable.dice2)
                3 -> binding.dice.setImageResource(R.drawable.dice3)
                4 -> binding.dice.setImageResource(R.drawable.dice4)
                5 -> binding.dice.setImageResource(R.drawable.dice5)
                6 -> binding.dice.setImageResource(R.drawable.dice6)
            }
        }
    }
}