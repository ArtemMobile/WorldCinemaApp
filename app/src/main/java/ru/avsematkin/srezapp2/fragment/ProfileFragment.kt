package ru.avsematkin.srezapp2.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.avsematkin.srezapp2.R
import ru.avsematkin.srezapp2.databinding.FragmentProfileBinding
import ru.avsematkin.srezapp2.databinding.FragmentRangeBinding


class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater)
        return binding.root
    }


}