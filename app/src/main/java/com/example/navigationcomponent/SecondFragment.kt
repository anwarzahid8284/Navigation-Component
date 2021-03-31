package com.example.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment(R.layout.fragment_second) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loginBtnID.setOnClickListener{
            var userName:String=secondFragment_userNameID.text.toString().trim()
            var userPassword:String=secondFragment_userPasswordID.text.toString().trim()
            val action=SecondFragmentDirections.actionSecondFragmentToWelcomeFragment(userName,userPassword)
            findNavController().navigate(action)
        }
    }

}