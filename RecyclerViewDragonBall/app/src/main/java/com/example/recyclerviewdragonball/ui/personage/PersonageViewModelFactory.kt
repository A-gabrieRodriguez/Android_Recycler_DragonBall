package com.example.recyclerviewdragonball.ui.personage

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.recyclerviewdragonball.repository.DictionaryRepository

class PersonageViewModelFactory (private val repository: DictionaryRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PersonageViewModel::class.java)) {
            return PersonageViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}