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
            var randomnum = (1..6).random()


            // Use when -- it's good choice
            if (randomnum == 1) {
                binding.dice.setImageResource(R.drawable.dice1)
            } else if (randomnum == 2) {
                binding.dice.setImageResource(R.drawable.dice2)
            } else if (randomnum == 3) {
                binding.dice.setImageResource(R.drawable.dice3)
            } else if (randomnum == 4) {
                binding.dice.setImageResource(R.drawable.dice4)
            } else if (randomnum == 5) {
                binding.dice.setImageResource(R.drawable.dice5)
            } else if (randomnum == 6) {
                binding.dice.setImageResource(R.drawable.dice6)
            }

        }


    }


}