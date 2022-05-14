package com.example.recyclerviewdragonball.repository

import androidx.lifecycle.MutableLiveData
import com.example.recyclerviewdragonball.R
import com.example.recyclerviewdragonball.model.Personaje

class DictionaryRepository {
    private var _personage = listOf(
        Personaje("Goku", "Personage principal del anime", R.drawable.goku),
        Personaje("Vegeta", "Personage secundario del anime rival de Goku",R.drawable.vegeta),
        Personaje("Krilin", "Amigo del personage principal",R.drawable.krilin),
        Personaje("Magin-boo", "Villano del anime",R.drawable.maginboo),
        Personaje("Frezeer", "Villano y aliado de del anime",R.drawable.freeza),
        Personaje("Goah", "Hijo del personage principal",R.drawable.gohan),
        ).toMutableList()

    val personages: MutableLiveData<List<Personaje>> =MutableLiveData(_personage)

}
