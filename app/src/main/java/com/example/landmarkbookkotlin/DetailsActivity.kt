package com.example.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.landmarkbookkotlin.data.MySingleton.selectedLandmark
import com.example.landmarkbookkotlin.databinding.ActivityDetailsBinding
import com.example.landmarkbookkotlin.model.Landmark

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDetailsBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)


        val chosenLandmark=selectedLandmark
        selectedLandmark?.let {
            binding.nameText.text=it.name
            binding.nameText2.text=it.country
            binding.imageView.setImageResource(it.image)
        }

    }
}