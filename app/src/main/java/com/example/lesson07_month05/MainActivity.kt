package com.example.lesson07_month05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson07_month05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val math = Math()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpListeners()
        supportActionBar?.hide()
    }

    private fun setUpListeners() {
        binding.btnCalcAdd.setOnClickListener {
            result(math.sum(binding.etCalc.text.toString(),binding.etCalc2.text.toString()))

        binding.btnCalcMinus.setOnClickListener {
            result(math.minus(binding.etCalc.text.toString(),binding.etCalc2.text.toString()))
        }
        }
    }

    private fun result(value: String) {
        binding.tvCalcResult.text=value
    }
    private fun divideRes(value:Int){
        binding.tvCalcResult.text = value.toString()
    }
    private fun doubleRes(value:Double){
        binding.tvCalcResult.text = value.toString()
    }
}