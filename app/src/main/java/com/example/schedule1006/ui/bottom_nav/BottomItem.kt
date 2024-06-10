package com.example.schedule1006.ui.bottom_nav

import com.example.schedule1006.R


sealed class BottomItem (val title: String, val iconId: Int, val route: String){
    object Screen1: BottomItem("Home", R.drawable.iconehome, "screen_1")
    object Screen2: BottomItem("Schedule", R.drawable.iconlist, "screen_2")
    object Screen3: BottomItem("Profile", R.drawable.iconeprofile, "screen_3")
}