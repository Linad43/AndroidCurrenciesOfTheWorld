package com.example.androidcurrenciesoftheworld.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.motion.widget.TransitionAdapter
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidcurrenciesoftheworld.R
import com.example.androidcurrenciesoftheworld.databinding.FragmentSecondBinding
import com.example.androidcurrenciesoftheworld.model.Currencies
import com.example.androidcurrenciesoftheworld.service.CurrencyViewModel
import com.example.androidcurrenciesoftheworld.service.RecyclerAdapter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!
    private val viewModal: CurrencyViewModel by viewModels()
    lateinit var adapter: RecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("FragmentLiveDataObserve")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val currenciesList = arrayListOf(
//            Currencies("Австрия", "Евро", "€", R.drawable.eur_100),
//            Currencies("Албания", "Лек", "L", R.drawable.leke_100),
//            Currencies("Афганистан", "Афгани", "Af", R.drawable.afgania_50),
//            Currencies("Бангладеш", "Така", "€", R.drawable.taka_front_2),
//            Currencies("Великобритания", "Фунт", "€", R.drawable.funtov_10),
//        )

        adapter = RecyclerAdapter()
        binding.recyclerRV.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerRV.adapter = adapter

        viewModal.currencies.observe(this){
            adapter.setCurrencies(it)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}