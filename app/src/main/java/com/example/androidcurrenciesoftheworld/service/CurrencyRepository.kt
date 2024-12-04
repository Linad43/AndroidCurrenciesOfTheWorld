package com.example.androidcurrenciesoftheworld.service

import com.example.androidcurrenciesoftheworld.model.Currencies

interface CurrencyRepository {
    fun getCurrencies(): ArrayList<Currencies>
}