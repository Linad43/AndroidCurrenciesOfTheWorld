package com.example.androidcurrenciesoftheworld.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.androidcurrenciesoftheworld.R
import com.example.androidcurrenciesoftheworld.databinding.FragmentMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.postDelayed(
            { /*findNavController().navigate(R.id.action_mainFragment_to_secondFragment)*/
            fragmentManager
                ?.beginTransaction()
                ?.replace(R.id.container, SecondFragment())
                ?.commit()
            },
            3000
        )
//        binding.root.setOnClickListener {
//            findNavController().navigate(R.id.action_mainFragment_to_secondFragment)
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}