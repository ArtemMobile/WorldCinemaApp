package ru.avsematkin.srezapp2.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.avsematkin.srezapp2.R
import ru.avsematkin.srezapp2.databinding.FragmentCollectionsBinding
import ru.avsematkin.srezapp2.databinding.FragmentRangeBinding

class CollectionsFragment : Fragment() {

    private lateinit var binding: FragmentCollectionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCollectionsBinding.inflate(inflater)
        return binding.root
    }



}