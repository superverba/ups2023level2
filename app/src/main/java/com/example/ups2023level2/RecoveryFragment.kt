package com.example.ups2023level2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ups2023level2.databinding.FragmentRecoveryBinding
import com.example.ups2023level2.databinding.FragmentSignupBinding

class RecoveryFragment : Fragment() {

    private var binding: FragmentRecoveryBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRecoveryBinding.inflate(inflater, container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.run {
            // do something
//            findNavController().navigate(R.id.re)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}