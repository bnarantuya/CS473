package com.example.assignments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var foods:MutableList<String> = mutableListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

        decide.setOnClickListener { food.text=foods.random() }

        addFood.setOnClickListener { foods.add(enterFood.text.toString()) }
    }
}