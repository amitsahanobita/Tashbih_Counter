package com.example.tasbihcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.InputBinding
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelStore
import com.example.tasbihcounter.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.liveScore.observe(this){
            binding.count.text="$it"
        }
        binding.increasebtn.setOnClickListener{
            viewModel.increase()
        }
        binding.decrease.setOnClickListener{
            viewModel.decrease()
        }
        binding.restart.setOnClickListener{
            viewModel.reset()
        }
        Log.d("Tag", "onCreate")
    }
    override fun onStart() {
        super.onStart()
        Log.d("Tag", "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.d("Tag", "onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d("Tag", "onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d("Tag", "onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("Tag", "onDestroy")
    }
}