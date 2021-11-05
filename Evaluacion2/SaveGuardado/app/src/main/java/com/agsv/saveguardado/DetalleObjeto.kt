package com.agsv.saveguardado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.agsv.saveguardado.databinding.ActivityDetalleObjetoBinding

class DetalleObjeto : AppCompatActivity() {
    private lateinit var binding: ActivityDetalleObjetoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        var nom = ""
        var tel = ""
        var Fnom= ""

        binding = ActivityDetalleObjetoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        intent.extras?.let {
            nom = it.getString("nom").toString()
            tel = it.getString("tel").toString()
        }

        Fnom = when(nom){
            "A" -> "Alvaro"
            "B" -> "Beto"
            "C" -> "Carlos"
            "D" -> "Dani"
            else -> "No se su nombre"
        }

        binding.nom.text = nom
        binding.Num.text = tel
        binding.Fnom.text = Fnom
    }
}