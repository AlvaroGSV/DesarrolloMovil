package com.agsv.saveguardado.objeto

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.agsv.saveguardado.R
import com.agsv.saveguardado.databinding.ContactViewBinding

class adapter (private val context: Context,
               private val loadObject: List<objetoPorps>,
                private val listener: (objetoPorps) -> Unit):
    RecyclerView.Adapter<adapter.viewHolder>() {
    class viewHolder (view: View):RecyclerView.ViewHolder(view){
        val binding = ContactViewBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_view, parent, false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val objetoPorps = loadObject[position]
        with(holder){
            binding.root.setOnClickListener {
                listener(objetoPorps)
            }
            binding.nameObj.text = objetoPorps.nom
            binding.telObj.text = objetoPorps.tel
        }
    }

    override fun getItemCount(): Int = loadObject.size

}