package com.naveen.navdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.naveen.navdemo.databinding.ActivityMainBinding
import com.naveen.navdemo.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var  binding : FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container, false)
        binding.btnSubmit.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment)
        }
        return binding.root
    }
}