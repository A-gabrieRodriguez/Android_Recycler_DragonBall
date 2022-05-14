package com.example.recyclerviewdragonball.ui.personage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewdragonball.R
import com.example.recyclerviewdragonball.databinding.CardDragonballBinding
import com.example.recyclerviewdragonball.model.Personaje
import com.example.recyclerviewdragonball.repository.DictionaryRepository

class PersonajeAdapter : RecyclerView.Adapter<PersonajeAdapter.PersonageViewHolder>() {
    private var personajes: List<Personaje>? = null

    fun setData(data: List<Personaje>) {
        personajes = data
        notifyDataSetChanged()
    }
    inner class PersonageViewHolder(private val binding: CardDragonballBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(personaje: Personaje) {
            binding.personage = personaje
            binding.executePendingBindings()

            Glide.with(binding.itemImage.context) //llamando imageView del layout
                //.load(personaje.image)// url de donde obtendra la imagen
                .load(personaje.imagen)// url de donde obtendra la imagen
                .placeholder(R.drawable.esfera_del_dragon_4)
                .error(R.drawable.esfera_dragon_6_estrellas)
                .into(binding.itemImage)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        PersonageViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.card_dragonball,
                parent,
                false
    )
        )
    override fun onBindViewHolder(holder: PersonageViewHolder, position: Int) {
        personajes?.let {
            holder.bind(it[position])
        }

    }
    override fun getItemCount() = personajes?.size ?: 0
}
