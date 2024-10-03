package com.madevuika.projectuts_dttn

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.madevuika.projectuts_dttn.databinding.ScheduleCardBinding

class ScheduleAdapter()
    :RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder>() {
        class ScheduleViewHolder(val binding: ScheduleCardBinding):RecyclerView.ViewHolder(binding.root)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleViewHolder {
            val binding = ScheduleCardBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            return ScheduleViewHolder(binding)
        }

        override fun getItemCount(): Int {
            return ScheduleData.schedules.size
        }

        override fun onBindViewHolder(holder: ScheduleViewHolder, position: Int) {
            holder.binding.schBackground.setImageResource(ScheduleData.schedules[position].imageID)
            holder.binding.scheduleTitle.text = ScheduleData.schedules[position].title
            holder.binding.scheduleTimeDate.text = ScheduleData.schedules[position].timeDate
            holder.binding.scheduleTeam.text = ScheduleData.schedules[position].team
            holder.binding.scheduleDescription.text = ScheduleData.schedules[position].description
        }
}