package com.madevuika.projectuts_dttn

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.madevuika.projectuts_dttn.databinding.ActivityScheduleDetailBinding

class ScheduleDetailActivity : AppCompatActivity() {
    private lateinit var binding:ActivityScheduleDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScheduleDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.recSchedules.layoutManager = LinearLayoutManager(this)
        binding.recSchedules.setHasFixedSize(true)
        binding.recSchedules.adapter = ScheduleAdapter()
    }
}