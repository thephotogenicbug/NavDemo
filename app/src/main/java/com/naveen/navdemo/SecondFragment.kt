package com.naveen.navdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.naveen.navdemo.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding : FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater,container,false)
        val input = requireArguments().getString("user_input")
        binding.tvName.text = input
        return binding.root
    }

}