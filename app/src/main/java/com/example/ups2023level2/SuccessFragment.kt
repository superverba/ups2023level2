package com.example.ups2023level2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ups2023level2.databinding.FragmentSuccesBinding

class SuccessFragment : Fragment() {

    private var binding: FragmentSuccesBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSuccesBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.run {
            // do something
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}