package com.example.countdownexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.countdownexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        object : CountDownTimer(10000,1000){
            override fun onTick(p0: Long) {
                // her döngüde çalışıyor
                binding.textView.setText("Left : ${p0 / 1000}")
            }

            override fun onFinish() {
                // bittiğinde çalışıyor
                binding.textView.setText("Left : 0")
            }

        }.start()
    }
}