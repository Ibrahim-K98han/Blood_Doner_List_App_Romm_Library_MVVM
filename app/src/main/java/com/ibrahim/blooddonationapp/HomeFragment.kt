package com.ibrahim.blooddonationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ibrahim.blooddonationapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding:FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        binding.donerET.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_newDonerFragment)
        }
        binding.donerListET.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_donerListFragment)
        }
        return binding.root
    }

}