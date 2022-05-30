package com.example.viewmodeimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeimplementation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var  viewmodel:MainActivityViewModel //here we have declared object of MainActivityViewModel class
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewmodel=ViewModelProvider(this).get(MainActivityViewModel::class.java)  //here we have initialized object of MainActivityViewModel class

        binding.countText.text=viewmodel.getcurrentcount().toString()


        binding.setBtn.setOnClickListener {

            binding.countText.text=viewmodel.getupdatedcount().toString()


        }
    }
}