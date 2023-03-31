package com.griindset.xtraskill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

       supportFragmentManager.beginTransaction().replace(R.id.lgn_frag,LoginFragment()).commit()
    }
}