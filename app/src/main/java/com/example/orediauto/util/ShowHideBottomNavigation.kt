package com.example.orediauto.util

import androidx.fragment.app.Fragment
import com.example.orediauto.R
import com.example.orediauto.activities.ShoppingActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

fun Fragment.hideBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.example.orediauto.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.GONE
}

fun Fragment.showBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.example.orediauto.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.VISIBLE
}