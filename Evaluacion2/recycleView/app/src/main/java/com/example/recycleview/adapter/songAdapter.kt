package com.example.recycleview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.R
import com.example.recycleview.model.Song

class songAdapter(private val data: List<Song>): RecyclerView.Adapter<songAdapter.viewHolder>() {
    class viewHolder(view: View): RecyclerView.ViewHolder(view){
        val title = view.findViewById<TextView>(R.id.songTitle)
        val album = view.findViewById<TextView>(R.id.songAlbum)
        val artist = view.findViewById<TextView>(R.id.songArtist)
        val trackNum = view.findViewById<TextView>(R.id.songTrackNum)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.song_item, parent, false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val song = data[position]
        holder.title.text = song.title
        holder.album.text = song.album
        holder.artist.text = song.artist
        holder.trackNum.text = song.trackNum.toString()
    }

    override fun getItemCount(): Int = data.size
}