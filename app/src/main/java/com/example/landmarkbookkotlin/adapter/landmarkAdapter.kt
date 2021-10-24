package com.example.landmarkbookkotlin.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.landmarkbookkotlin.DetailsActivity
import com.example.landmarkbookkotlin.databinding.RecyclerRowBinding
import com.example.landmarkbookkotlin.model.Landmark
import com.example.landmarkbookkotlin.data.MySingleton.selectedLandmark

class landmarkAdapter(
    private val dataset: List<Landmark>
) : RecyclerView.Adapter<landmarkAdapter.LandmarkHolder>() {


    class LandmarkHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {

        holder.binding.recyclerTextView.text= dataset[position].name
        holder.itemView.setOnClickListener {
            val intent=Intent(holder.itemView.context,DetailsActivity::class.java)
            selectedLandmark=dataset[position]
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataset.size


}