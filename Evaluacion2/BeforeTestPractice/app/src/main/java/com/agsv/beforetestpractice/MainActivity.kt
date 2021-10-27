package com.agsv.beforetestpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.agsv.beforetestpractice.databinding.ActivityMainBinding
import com.agsv.beforetestpractice.rvHB.HBarray
import com.agsv.beforetestpractice.rvHB.hbAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: hbAdapter
    private lateinit var layout: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Recycler view
        //Traer los datos
        adapter = hbAdapter(this, HBarray().loadContacts())/*Esto es el lambda*/{
            Toast.makeText(this,"${it.name}",Toast.LENGTH_SHORT).show()//Un toast de prueba
            //mandar a otra pantalla
            val contacto = Intent(this,ContactLayoutActivity::class.java)
            contacto.putExtra("img",it.img)
            contacto.putExtra("nombre",it.name)
            contacto.putExtra("tel",it.num)
            contacto.putExtra("inst",it.inst)
            startActivity(contacto)
        }
        //Donde pondra los datos
        layout = LinearLayoutManager(this)
        //mandando los datos al layout
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = layout
    }
}