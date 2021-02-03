package com.momokosaa.nottosdk.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.momokosaa.nottosdk.notto_sdk.MyMain
import com.momokosaa.nottosdk.sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        handleView()
    }

    private fun handleView(){
        binding.tvInfo.text = MyMain().getPackageName(this)
        binding.btnToast.setOnClickListener {
            MyMain().ToastVersion(this)
        }
    }
}