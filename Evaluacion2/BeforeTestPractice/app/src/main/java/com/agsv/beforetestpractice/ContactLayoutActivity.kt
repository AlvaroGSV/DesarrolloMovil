package com.agsv.beforetestpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.agsv.beforetestpractice.databinding.ActivityMainBinding
import com.agsv.beforetestpractice.databinding.ContactLayoutBinding

class ContactLayoutActivity : AppCompatActivity() {
    private lateinit var binding: ContactLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var img = 0
        var nombre = ""
        var tel = ""
        var inst = ""

        binding = ContactLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        intent.extras?.let{
            img = it.getInt("img").toInt()
            nombre = it.getString("nombre").toString()
            tel = it.getString("tel").toString()
            inst = it.getString("inst").toString()
        }
        binding.contactImage.setImageResource(img)
        binding.contactName.text = nombre
        binding.contactNum.text = tel
        binding.contactInst.text = inst
    }
}