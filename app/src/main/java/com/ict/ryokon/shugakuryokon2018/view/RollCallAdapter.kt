package com.ict.ryokon.shugakuryokon2018.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ict.ryokon.shugakuryokon2018.model.UserData

class RollCallAdapter(private val userDataList: List<UserData>) : RecyclerView.Adapter<RollCallViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RollCallViewHolder = RollCallViewHolder.create(
        LayoutInflater.from(parent.context),
        parent,
        false
    )

    override fun getItemCount(): Int = userDataList.size

    override fun onBindViewHolder(
        holder: RollCallViewHolder,
        position: Int
    ) {
        holder.bind(userDataList[position])
    }
}