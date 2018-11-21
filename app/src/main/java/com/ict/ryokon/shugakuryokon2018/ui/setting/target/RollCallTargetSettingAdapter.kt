package com.ict.ryokon.shugakuryokon2018.ui.setting.target

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ict.ryokon.shugakuryokon2018.model.UserData

class RollCallTargetSettingAdapter(private val userDataList: List<UserData>) : RecyclerView.Adapter<RollCallTargetSettingViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RollCallTargetSettingViewHolder = RollCallTargetSettingViewHolder.create(
        LayoutInflater.from(parent.context),
        parent,
        false
    )

    override fun getItemCount(): Int = userDataList.size

    override fun onBindViewHolder(
        holder: RollCallTargetSettingViewHolder,
        position: Int
    ) {
        val bindingModel = RollCallTargetSettingBindingModel()
        holder.bind(bindingModel)
    }
}