package com.example.recycleview.data

import com.example.recycleview.model.Song

class dataSource {
    fun loadSongs(): List<Song>{
        return listOf<Song>(
            Song("Spicy","CL","Alpha",1),
            Song("Lover like me","CL","Alpha",2),
            Song("Savage","aespa","savage",3),
            Song("Crush","2NE1","Crush",1),
            Song("Come back home","2NE1","Crush",2),
            Song("Gotta be you","2NE1","Crush",3),
            Song("If were you","2NE1","Crush",4),
            Song("Love again","Dua Lipa","Future Nostalgia",8)
        )
    }
}