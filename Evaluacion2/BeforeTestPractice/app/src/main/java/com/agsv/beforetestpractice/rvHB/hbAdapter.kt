package com.agsv.beforetestpractice.rvHB


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.agsv.beforetestpractice.MainActivity
import com.agsv.beforetestpractice.R
import com.agsv.beforetestpractice.databinding.ContactCardHbBinding

class hbAdapter(private val context: Context,
                private val loadContacts: List<HBcontacts>,
                private val listener: (HBcontacts) -> Unit
                ): RecyclerView.Adapter<hbAdapter.viewholder>() {
    class viewholder(view: View):RecyclerView.ViewHolder(view){
        /*
        Relacionar por id
        val img = view.findViewById<ImageView>(R.id.imgContact)
        val name = view.findViewById<TextView>(R.id.txtContactName)
        val num = view.findViewById<TextView>(R.id.txtContactNum)
        val inst = view.findViewById<TextView>(R.id.txtContactInstagram)
         */
        /*Relacionar por binding*/
        val binding = ContactCardHbBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_card_hb, parent, false)
        return viewholder(view)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        val HBcontacts = loadContacts[position]

        with(holder){

            binding.root.setOnClickListener {
                listener(HBcontacts)
            }

            binding.imgContact.setImageResource(HBcontacts.img)
            binding.txtContactName.text = HBcontacts.name
            binding.txtContactNum.text = HBcontacts.num
            binding.txtContactInstagram.text = HBcontacts.inst
        }
    }

    override fun getItemCount(): Int = loadContacts.size
}