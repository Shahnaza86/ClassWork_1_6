package com.example.classwork_1_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.classwork_1_6.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFindNumber.setOnClickListener{
            val number=binding.etFindNumber.text.toString()
            var random = Random.nextInt(0,10)

            if(number.toInt()==random){
                Toast.makeText(this,"Поздравляем вы угадали чмсло!",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"Вы не угадали число,попробуйте еще раз!",Toast.LENGTH_SHORT).show()
            }
        }
    }
}