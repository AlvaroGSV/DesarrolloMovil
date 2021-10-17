package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.adapter.songAdapter
import com.example.recycleview.data.dataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewContainer)

        val listSongs = dataSource().loadSongs()

        recyclerView.adapter = songAdapter(listSongs)
        recyclerView.setHasFixedSize(true)
    }
}