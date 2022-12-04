package ru.avsematkin.srezapp2.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.avsematkin.srezapp2.databinding.FragmentRangeBinding


class RangeFragment : Fragment() {

    private lateinit var binding: FragmentRangeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentRangeBinding.inflate(inflater)
        return binding.root
    }


}