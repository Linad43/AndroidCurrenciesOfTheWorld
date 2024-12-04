package com.example.androidcurrenciesoftheworld.service

import com.example.androidcurrenciesoftheworld.R
import com.example.androidcurrenciesoftheworld.model.Currencies

class CurrencyRepositoryImpl : CurrencyRepository {
    override fun getCurrencies(): ArrayList<Currencies> {
        return arrayListOf(
            Currencies("Австрия", "Евро", "€", R.drawable.eur_100),
            Currencies("Албания", "Лек", "L", R.drawable.leke_100),
            Currencies("Афганистан", "Афгани", "Af", R.drawable.afgania_50),
            Currencies("Бангладеш", "Така", "€", R.drawable.taka_front_2),
            Currencies("Великобритания", "Фунт", "€", R.drawable.funtov_10),
        )
    }
}