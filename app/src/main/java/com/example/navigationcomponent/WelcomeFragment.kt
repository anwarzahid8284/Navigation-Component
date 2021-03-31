package com.example.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_welcome.*

class WelcomeFragment:Fragment(R.layout.fragment_welcome) {
    private val args:WelcomeFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        welcomeFragment_GetUserNameID.text=args.userName
        welcomeFragment_GetPasswordID.text=args.userPassword
        welcomeFragment_OkBtnID.setOnClickListener{
            val action=WelcomeFragmentDirections.actionWelcomeFragmentToHomeFragment()
            findNavController().navigate(action)
        }
    }
}