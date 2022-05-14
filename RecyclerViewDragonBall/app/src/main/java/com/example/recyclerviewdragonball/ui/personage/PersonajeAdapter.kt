package com.example.recyclerviewdragonball.ui.personage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdragonball.R
import com.example.recyclerviewdragonball.databinding.CardDragonballBinding
import com.example.recyclerviewdragonball.model.Personaje

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