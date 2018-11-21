package com.ict.ryokon.shugakuryokon2018.ui.setting.target

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ict.ryokon.shugakuryokon2018.model.UserData

class RollCallTargetSettingAdapter(private val list: UserData) : RecyclerView.Adapter<RollCallTargetSettingViewHolder>() { //もとは userDataList: List<UserData>を引数としていました 過去のmosmos_syrcより
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RollCallTargetSettingViewHolder = RollCallTargetSettingViewHolder.create(
        LayoutInflater.from(parent.context),
        parent,
        false
    )

    override fun getItemCount(): Int = list.size //ここ最高にわからない これリストの数取ってるんだよね でもUserDataList型は使わない 虚無

    override fun onBindViewHolder(
        holder: RollCallTargetSettingViewHolder,
        position: Int
    ) {
        val bindingModel = RollCallTargetSettingBindingModel()
        holder.bind(bindingModel)
    }
}