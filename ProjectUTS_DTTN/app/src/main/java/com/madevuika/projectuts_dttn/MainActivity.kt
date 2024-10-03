package com.madevuika.projectuts_dttn

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.madevuika.projectuts_dttn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.WWALL.setOnClickListener{
            val intent = Intent(this,WhoActivity::class.java)
            startActivity(intent)
        }
        binding.WWPLL.setOnClickListener{
//            val intent = Intent(this,WhoActivity::class.java)
//            startActivity(intent)
        }
        binding.OSLL.setOnClickListener{
            val intent = Intent(this,ScheduleDetailActivity::class.java)
            startActivity(intent)
        }
    }
}