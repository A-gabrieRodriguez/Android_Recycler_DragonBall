package com.example.recyclerviewdragonball.repository

import androidx.lifecycle.MutableLiveData
import com.example.recyclerviewdragonball.model.Personage

class DictionaryRepository {
    private var _personage = listOf(
        Personage("Goku", "Personage principal del anime"),
        Personage("Vegeta", "Personage secundario del anime rival de Goku"),
        Personage("Krilin", "Amigo del personage principal"),
        Personage("Magin-boo", "Villano del anime"),
        Personage("Frezeer", "Villano y aliado de del anime"),
        Personage("Goah", "Hijo del personage principal"),
        ).toMutableList()

    val personages: MutableLiveData<List<Personage>> =MutableLiveData(_personage)

}
