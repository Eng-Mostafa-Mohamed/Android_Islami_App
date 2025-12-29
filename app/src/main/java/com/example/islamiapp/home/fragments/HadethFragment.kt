package com.example.islamiapp.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islamiapp.R
import com.example.islamiapp.databinding.ActivityHomeBinding
import com.example.islamiapp.databinding.FragmentHadethBinding

class HadethFragment : Fragment() {
    lateinit var binding: FragmentHadethBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentHadethBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}