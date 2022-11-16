package com.example.counter48

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.counter48.databinding.ActivityMainBinding
import com.example.counter48.presenter.Presenter
import com.example.counter48.view.CounterView

class MainActivity : AppCompatActivity() , CounterView{
    lateinit var binding: ActivityMainBinding
    private var count = 0
    var presenter = Presenter()
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
         presenter.attachView(this)
    }

    private fun initClicker() {
        with(binding) {
             plusBtn.setOnClickListener{
             presenter.increment()
             }
        }
    }

    override fun updateCount(count: String) {
        binding.resultTv.text = count.toString()

    }

    override fun showToastPlus() {
        this.showToast("Поздравляем")
    }

    override fun getColor() {
        binding.resultTv.setBackgroundColor(Color.GREEN)
    }
}