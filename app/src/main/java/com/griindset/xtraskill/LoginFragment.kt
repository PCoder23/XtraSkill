package com.griindset.xtraskill

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.widget.LinearLayoutCompat

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view =  inflater.inflate(R.layout.fragment_login, container, false)
        var signupBtn = view.findViewById<LinearLayoutCompat>(R.id.signupBtn)
        var lgnBtn = view.findViewById<Button>(R.id.lgn_btn)
        lgnBtn.setOnClickListener {
            startActivity(Intent(context,MainActivity::class.java))
        }
        signupBtn.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()?.setCustomAnimations(R.anim.slide_in,R.anim.fade_out,R.anim.fade_in,R.anim.slide_out)?.replace(R.id.lgn_frag,SignupFragment())?.addToBackStack(null)?.commit()

        }

        return view;
    }


}