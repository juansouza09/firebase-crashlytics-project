package com.example.firebase_crashlytics_project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firebase_crashlytics_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.errorButton.setOnClickListener {
            throw RuntimeException("Teste de Crash do Firebase")
        }
    }
}
