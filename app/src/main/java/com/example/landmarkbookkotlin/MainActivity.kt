package com.example.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.landmarkbookkotlin.adapter.landmarkAdapter
import com.example.landmarkbookkotlin.data.dataSource
import com.example.landmarkbookkotlin.databinding.ActivityMainBinding
import com.example.landmarkbookkotlin.model.Landmark

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        val mydataset = dataSource().loadLandMark()
        binding.recyclerView.adapter = landmarkAdapter(mydataset)


    }
}