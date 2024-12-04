package com.example.androidcurrenciesoftheworld.service

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androidcurrenciesoftheworld.model.Currencies
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CurrencyViewModel @Inject constructor(
    private val repository: CurrencyRepository
) : ViewModel() {

    private val _currencies = MutableLiveData< ArrayList<Currencies>>()
    val currencies: LiveData<ArrayList<Currencies>> get() = _currencies

    init {
        fetchCurrencies()
    }

    private fun fetchCurrencies() {
        _currencies.value = repository.getCurrencies()
    }
}
