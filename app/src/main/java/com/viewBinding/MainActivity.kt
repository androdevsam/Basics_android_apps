package com.viewBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.viewBinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            Button.setOnClickListener {
                val editText = ET.text.toString()
                if (editText == ""){
                    TextView.text = ""
                    Toast.makeText(this@MainActivity, "Please Enter your name", Toast.LENGTH_SHORT).show()
            }else {

            val message = "Hi $editText"
            TextView.text = message
                    ET.text.clear()
        }
        }

        }



    } }

