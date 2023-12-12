package com.ubalia.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorsDataset = resources.getStringArray(R.array.colors).asList()
        val customAdapter = CustomAdapter(colorsDataset)
        val recyclerView = findViewById<RecyclerView>(R.id.rvColorsList)
        recyclerView.adapter = customAdapter
    }
}