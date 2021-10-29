package com.dam.ye.examenu2.data

import com.dam.ye.examenu2.model.Movie

class Datasource {
    fun loadMovies(): List<Movie>{
        return listOf<Movie>(
            Movie("HelluvaBoss","VievziePop","A","2020"),
            Movie("HazbinHotel","VievziePop","T","2019"),
            Movie("titanic","cameron","D","2003"),
            Movie("una niñera apreuba de balas","disney","C","1990"),
            Movie("Diario de una pasion","quien sea","D","1996"),
            Movie("petter pan","disney","F","1985")
        )
    }
}