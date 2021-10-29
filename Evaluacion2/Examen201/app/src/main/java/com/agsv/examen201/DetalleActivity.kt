package com.agsv.examen201

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.agsv.examen201.databinding.ActivityDetalleBinding

class DetalleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)

        var name= ""
        var director= ""
        var genre= ""

        var genrename = ""


        binding = ActivityDetalleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        intent.extras?.let{
            name = it.getString("name").toString()
            director = it.getString("director").toString()
            genre = it.getString("genre").toString()
        }

        if(genre == "A"){
            genrename ="ACTION"
        }
        else if(genre == "T"){
            genrename = "THRILLER"
        }
        else if(genre == "D"){
            genrename = "DRAMA"
        }
        else if(genre == "C"){
            genrename = "COMEDY"
        }
        else if(genre == "F"){
            genrename = "FICTION"
        }
        else{
            genrename = "UNKNOWN"
        }


        binding.MovieGenereLetter.text = genre
        binding.MovieInfo.text = director
        binding.MovieName.text = name
        binding.MovieGenere.text = genrename

    }
}