package com.ibrahim.blooddonationapp.adapter

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.ibrahim.blooddonationapp.databinding.DonorRowBinding
import com.ibrahim.blooddonationapp.entities.BloodModel

class DonorAdapter {

    class DonorViewHolder(private val binding:DonorRowBinding,
        val actionCallback:(BloodModel,String)->Unit)
        :RecyclerView.ViewHolder(binding.root){
        fun bind(bloodModel:BloodModel){
            binding.donor = bloodModel
        }
    }

    class DonorDiffUtil:DiffUtil.ItemCallback<BloodModel>(){
        override fun areItemsTheSame(oldItem: BloodModel, newItem: BloodModel): Boolean {
            return oldItem.bloodId == newItem.bloodId
        }

        override fun areContentsTheSame(oldItem: BloodModel, newItem: BloodModel): Boolean {
            return oldItem == newItem
        }

    }

}