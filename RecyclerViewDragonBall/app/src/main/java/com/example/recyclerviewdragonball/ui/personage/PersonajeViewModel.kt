package com.example.recyclerviewdragonball.ui.personage

import androidx.lifecycle.ViewModel
import com.example.recyclerviewdragonball.model.Personaje
import com.example.recyclerviewdragonball.repository.DictionaryRepository

class PersonajeViewModel (private val repository: DictionaryRepository): ViewModel() {
    val personage = repository.personages

    fun onAddPersonaje(personage: Personaje){
        // validar
        repository.addPersonaje(personage)
    }

}