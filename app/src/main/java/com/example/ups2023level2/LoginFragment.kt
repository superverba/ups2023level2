package com.example.ups2023level2

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ups2023level2.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private var binding: FragmentLoginBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)

        binding?.run {
            already.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_signupFragment2)
            }

            noAcc.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_signupFragment2)
            }

            forget.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_recoveryFragment)
            }

            recovery.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_recoveryFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}