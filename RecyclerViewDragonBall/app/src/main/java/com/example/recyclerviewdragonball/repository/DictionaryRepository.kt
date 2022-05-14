package com.example.recyclerviewdragonball.repository

import androidx.lifecycle.MutableLiveData
import com.example.recyclerviewdragonball.R
import com.example.recyclerviewdragonball.model.Personaje

class DictionaryRepository {
    private var _personage = listOf(
        Personaje("Goku", "Personage principal del anime", "https://www.geekmi.news/__export/1623433413016/sites/debate/img/2021/06/11/gokx-1.jpg_976912859.jpg"),
        Personaje("Vegeta", "Personage secundario del anime rival de Goku","https://www.geekmi.news/__export/1623433413016/sites/debate/img/2021/06/11/gokx-1.jpg_976912859.jpg"),
        Personaje("Krilin", "Amigo del personage principal","https://www.geekmi.news/__export/1623433413016/sites/debate/img/2021/06/11/gokx-1.jpg_976912859.jpg"),
        Personaje("Magin-boo", "Villano del anime","https://www.geekmi.news/__export/1623433413016/sites/debate/img/2021/06/11/gokx-1.jpg_976912859.jpg"),
        Personaje("Frezeer", "Villano y aliado de del anime","https://www.geekmi.news/__export/1623433413016/sites/debate/img/2021/06/11/gokx-1.jpg_976912859.jpg"),
        Personaje("Goah", "Hijo del personage principal","https://www.geekmi.news/__export/1623433413016/sites/debate/img/2021/06/11/gokx-1.jpg_976912859.jpg"),
        ).toMutableList()

    val personages: MutableLiveData<List<Personaje>> =MutableLiveData(_personage)

}
