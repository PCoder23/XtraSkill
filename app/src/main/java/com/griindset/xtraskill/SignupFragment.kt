package com.griindset.xtraskill

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.LinearLayoutCompat

class SignupFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view=  inflater.inflate(R.layout.fragment_signup, container, false)
        var signinBtn = view.findViewById<LinearLayoutCompat>(R.id.signinBtn)
        signinBtn.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()?.setCustomAnimations(R.anim.fade_in,R.anim.slide_out)?.replace(R.id.lgn_frag,LoginFragment())?.commit()

        }
        return view
    }

}