package com.example.androidcurrenciesoftheworld

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidcurrenciesoftheworld.databinding.FragmentMainBinding
import com.example.androidcurrenciesoftheworld.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val currenciesList = arrayListOf(
            Currencies("Австрия", "Евро", "€", R.drawable.eur_100),
            Currencies("Албания", "Лек", "L", R.drawable.leke_100),
            Currencies("Афганистан", "Афгани", "Af", R.drawable.afgania_50),
            Currencies("Бангладеш", "Така", "€", R.drawable.taka_front_2),
            Currencies("Великобритания", "Фунт", "€", R.drawable.funtov_10),
        )
        val adapter = RecyclerAdapter(currenciesList)
        binding.recyclerRV.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerRV.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}