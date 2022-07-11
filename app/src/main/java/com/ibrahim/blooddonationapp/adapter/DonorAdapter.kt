package com.ibrahim.blooddonationapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ibrahim.blooddonationapp.databinding.DonorRowBinding
import com.ibrahim.blooddonationapp.entities.BloodModel

class DonorAdapter(val actionCallback: (BloodModel, String) -> Unit):ListAdapter<BloodModel,DonorAdapter.DonorViewHolder>(DonorDiffUtil()){

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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DonorViewHolder {
        val binding = DonorRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DonorViewHolder(binding,actionCallback)
    }

    override fun onBindViewHolder(holder: DonorViewHolder, position: Int) {
        val todoModel = getItem(position)
        holder.bind(todoModel)
    }

}