package com.ict.ryokon.shugakuryokon2018.ui.setting.target

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ict.ryokon.shugakuryokon2018.databinding.RowRollCallTargetSettingBinding
import com.ict.ryokon.shugakuryokon2018.model.UserData

class RollCallTargetSettingViewHolder(private val binding: RowRollCallTargetSettingBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(bindingModel: RollCallTargetSettingBindingModel) {
        binding.bindingmodel = bindingModel
    }

    fun unbind() {
        binding.unbind()
    }

    companion object {
        fun create(
            inflater: LayoutInflater,
            parent: ViewGroup,
            attachToRoot: Boolean
        ): RollCallTargetSettingViewHolder = RollCallTargetSettingViewHolder(
            RowRollCallTargetSettingBinding.inflate(
                inflater,
                parent,
                attachToRoot
            )
        )
    }
}