package com.agsv.saveguardado.objeto

class DataSurce {
    fun loadObject(): List<objetoPorps>{
        return listOf(
            objetoPorps("A","1234"),
            objetoPorps("C","1234"),
            objetoPorps("B","1234"),
            objetoPorps("D","1234")
        )
    }
}