package com.example.uts_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uts_1.databinding.ActivityLoginBinding

class Activity3 : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Add login logic here
    }
}
