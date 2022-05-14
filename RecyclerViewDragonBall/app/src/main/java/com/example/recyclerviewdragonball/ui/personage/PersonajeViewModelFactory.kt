package com.example.recyclerviewdragonball.ui.personage

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.recyclerviewdragonball.repository.DictionaryRepository

class PersonajeViewModelFactory (private val repository: DictionaryRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PersonajeViewModel::class.java)) {
            return PersonajeViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}