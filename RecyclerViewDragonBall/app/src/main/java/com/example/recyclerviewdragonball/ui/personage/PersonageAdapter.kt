package com.example.recyclerviewdragonball.ui.personage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdragonball.R
import com.example.recyclerviewdragonball.databinding.CardDragonballBinding
import com.example.recyclerviewdragonball.model.Personage

class PersonageAdapter : RecyclerView.Adapter<PersonageAdapter.PersonageViewHolder>() {
    private var personages: List<Personage>? = null

    fun setData(data: List<Personage>) {
        personages = data
        notifyDataSetChanged()
    }
    inner class PersonageViewHolder(private val binding: CardDragonballBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(personage: Personage) {
            binding.personage = personage
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
        personages?.let {
            holder.bind(it[position])
        }
    }

    override fun getItemCount() = personages?.size ?: 0

}