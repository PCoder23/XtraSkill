package com.griindset.xtraskill

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.view.isVisible

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        var titl = findViewById<TextView>(R.id.title)
        var wlcm = findViewById<LinearLayoutCompat>(R.id.welcome)
        Handler().postDelayed(Runnable {
            ObjectAnimator.ofFloat(titl,"translationY",-600f).apply {
                duration=600
                start()
            }
        },1500
        )
        Handler().postDelayed(Runnable {
            wlcm.isVisible=true
            wlcm.animation=AnimationUtils.loadAnimation(this@SplashActivity,R.anim.fade_in)
        },2200)

    Handler().postDelayed(Runnable {
        startActivity(Intent(this@SplashActivity,LoginActivity::class.java))
        finish()
    },4200)

    }
}