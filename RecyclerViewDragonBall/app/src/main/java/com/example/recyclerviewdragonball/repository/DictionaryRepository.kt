package com.example.recyclerviewdragonball.repository

import androidx.lifecycle.MutableLiveData
import com.example.recyclerviewdragonball.R
import com.example.recyclerviewdragonball.model.Personaje

class DictionaryRepository {
    private var _personage = listOf(
        Personaje("Goku", "Personage principal del anime", "https://www.geekmi.news/__export/1623433413016/sites/debate/img/2021/06/11/gokx-1.jpg_976912859.jpg"),
        Personaje("Vegeta", "Personage secundario del anime rival de Goku","https://www.cinemascomics.com/wp-content/uploads/2018/11/dragon-ball-super-hermano-vegeta-anime.jpg?mrf-size=m"),
        Personaje("Krilin", "Amigo del personage principal","https://static.wikia.nocookie.net/heros/images/6/6d/Krilin_Infobox.jpg/revision/latest?cb=20200912075900&path-prefix=fr"),
        Personaje("Magin-boo", "Villano del anime","https://gruposaedal.com/wp-content/uploads/2021/10/Majin-Buu-de-Dragon-Ball-Z-tiene-un-poder-milagroso.jpg"),
        Personaje("Frezeer", "Villano y aliado de del anime","https://i0.wp.com/www.senpai.com.mx/wp-content/uploads/2021/04/Dragon-Ball_-Esta-ilustracio%CC%81n-realista-de-Freezer-es-espeluznante.jpg?fit=1280%2C720&ssl=1"),
        Personaje("Goah", "Hijo del personage principal","https://www.drakonball.com/wp-content/uploads/2021/09/gohan-mistico-1.jpg"),
        ).toMutableList()

    val personages: MutableLiveData<List<Personaje>> =MutableLiveData(_personage)

    fun addPersonaje(personaje: Personaje) {
        _personage.add(personaje)
        personages.value = _personage
    }

}
