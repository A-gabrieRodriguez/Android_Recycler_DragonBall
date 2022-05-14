package com.example.recyclerviewdragonball.ui.personage

import androidx.lifecycle.ViewModel
import com.example.recyclerviewdragonball.repository.DictionaryRepository

class PersonageViewModel (private val repository: DictionaryRepository): ViewModel() {
    val personage = repository.personages


}