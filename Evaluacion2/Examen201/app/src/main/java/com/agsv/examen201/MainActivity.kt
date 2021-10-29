package com.agsv.examen201

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.agsv.examen201.databinding.ActivityMainBinding
import com.dam.ye.examenu2.adapter.MovieAdapter
import com.dam.ye.examenu2.data.Datasource

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MovieAdapter
    private lateinit var layout: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Recycler view y mandar datos a otro intent
        adapter = MovieAdapter(this, Datasource().loadMovies()){
            val item = Intent(this,DetalleActivity::class.java)
            item.putExtra("name", it.name)
            item.putExtra("director",it.director)
            item.putExtra("genre",it.genre)
            startActivity(item)
        }

        //Recycler view; Presentar los datos
        layout = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = layout
    }
}