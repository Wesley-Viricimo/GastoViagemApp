package com.example.gastoviagemapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gastoviagemapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding //lateinit indica que a variável será instanciada posteriormente
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) //View Binding para conectar layout ao codigo


    }

    private fun calcular() {

    }
}