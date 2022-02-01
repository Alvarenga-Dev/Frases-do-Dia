package com.alvarengadev.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alvarengadev.frasesdodia.TextUtils.getTexts
import com.alvarengadev.frasesdodia.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val random = Random.nextInt(0,6)
            binding.textView.text = getTexts(random)
        }
    }
}