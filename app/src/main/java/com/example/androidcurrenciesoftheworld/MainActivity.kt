package com.example.androidcurrenciesoftheworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidcurrenciesoftheworld.databinding.ActivityMainBinding
import com.example.androidcurrenciesoftheworld.fragment.MainFragment
import dagger.hilt.android.AndroidEntryPoint
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, MainFragment())
            .commit()
    }
}