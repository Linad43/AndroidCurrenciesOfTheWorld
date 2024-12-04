package com.example.androidcurrenciesoftheworld.service

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

class CurrenciesDI {
    @Module
    @InstallIn(SingletonComponent::class)
    object AppModule {

        @Provides
        @Singleton
        fun provideCurrencyRepository(): CurrencyRepository {
            return CurrencyRepositoryImpl()
        }
    }
}