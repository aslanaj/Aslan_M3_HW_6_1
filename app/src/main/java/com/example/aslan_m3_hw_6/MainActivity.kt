package com.example.aslan_m3_hw_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aslan_m3_hw_6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var  FirstFragment = FirstFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

     supportFragmentManager.beginTransaction()
         .add(R.id.container, FirstFragment)
         .commit()
    }
}