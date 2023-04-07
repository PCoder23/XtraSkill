package com.griindset.xtraskill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btmNav= findViewById<BottomNavigationView>(R.id.btmNvgtn)
        btmNav.setOnItemSelectedListener { item->
            when (item.itemId) {
                R.id.nav_home -> {
                    supportFragmentManager.beginTransaction().replace(R.id.mainFrame,HomeFragment()).commit()
                }
                R.id.nav_library -> {
                    loadFragment(LibraryFragment())
                }
                R.id.nav_download -> {
                    loadFragment(DownloadsFragment())
                }
                else -> {
                    loadFragment(ProfileFragment())
                }
            }
            true
        }
        btmNav.selectedItemId=R.id.nav_home

    }

    private fun loadFragment(fragment:Fragment){
        supportFragmentManager.beginTransaction().add(R.id.mainFrame,fragment).commit()
    }


}