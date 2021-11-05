package com.agsv.beforetestpractice.rvHB

import com.agsv.beforetestpractice.R

class HBarray {
    fun loadContacts(): List<HBcontacts>{
        return listOf<HBcontacts>(
            HBcontacts(R.drawable.blitz,"Blitz","666-654-2369","Blitzorodeo"),
            HBcontacts(R.drawable.loona,"Loona","666-354-1287","gothchk17"),
            HBcontacts(R.drawable.stolas,"Stolas","666-696-6969","daddy_hoothoot"),
            HBcontacts(R.drawable.octavia,"Octavia","666-487-2504","gothchk17"),
            HBcontacts(R.drawable.millie,"Millie","668-432-3773","beautymarkbabe666"),
            HBcontacts(R.drawable.moxxie,"Moxxie","668-967-3146","simply_moxxie")
        )
    }
}