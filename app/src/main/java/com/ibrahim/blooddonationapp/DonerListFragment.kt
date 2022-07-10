package com.ibrahim.blooddonationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ibrahim.blooddonationapp.databinding.FragmentDonerListBinding


class DonerListFragment : Fragment() {

    private lateinit var binding:FragmentDonerListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDonerListBinding.inflate(inflater,container,false)
        binding.addDonorFab.setOnClickListener {
            findNavController().navigate(R.id.action_donerListFragment_to_newDonerFragment)
        }
        return binding.root
    }

}