package com.dam.ye.examenu2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.agsv.examen201.R
import com.agsv.examen201.databinding.ItemMovieBinding
import com.dam.ye.examenu2.model.Movie

class MovieAdapter(
    private  val context: Context, private val loadMovies: List<Movie>, private val listener: (Movie) -> Unit) : RecyclerView.Adapter<MovieAdapter.viewHolder>() {

    class viewHolder(view: View) : RecyclerView.ViewHolder(view) {
         val binding = ItemMovieBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val movies = loadMovies[position]

        with(holder){

            binding.root.setOnClickListener {
                listener(movies)
            }

            binding.txtMovieName.text=movies.name
            binding.txtMovieGenre.text=movies.genre
            binding.txtMovieInfo.text=movies.director +" - "+ movies.year
        }
    }

    override fun getItemCount(): Int = loadMovies.size

}