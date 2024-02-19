package com.example.joshimhe_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.joshimhe_app.databinding.ActivityManualBinding

class ManualActivity : AppCompatActivity() {
    var sign = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityManualBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.group1.isSelected = true

        binding.group1.setOnClickListener {
            sign = 1
            binding.group1.isSelected = true
            binding.group2.isSelected = false
            binding.group3.isSelected = false
            binding.group4.isSelected = false

        }
        binding.group2.setOnClickListener {
            sign = 2
            binding.group1.isSelected = false
            binding.group2.isSelected = true
            binding.group3.isSelected = false
            binding.group4.isSelected = false

        }
        binding.group3.setOnClickListener {
            sign = 3
            binding.group1.isSelected = false
            binding.group2.isSelected = false
            binding.group3.isSelected = true
            binding.group4.isSelected = false

        }
        binding.group4.setOnClickListener {
            sign = 4
            binding.group1.isSelected = false
            binding.group2.isSelected = false
            binding.group3.isSelected = false
            binding.group4.isSelected = true

        }
    }
}