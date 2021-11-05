package com.agsv.saveguardado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.agsv.saveguardado.databinding.ActivityMainBinding
import com.agsv.saveguardado.objeto.DataSurce
import com.agsv.saveguardado.objeto.adapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: adapter
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = adapter(this, DataSurce().loadObject()){
            val detalle = Intent(this, DetalleObjeto::class.java)

            detalle.putExtra("nom", it.nom)
            detalle.putExtra("tel", it.tel)

            startActivity(detalle)
        }

        layoutManager = LinearLayoutManager(this)

        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = layoutManager

    }
}