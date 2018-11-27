package com.ict.ryokon.shugakuryokon2018.ui.rollcall.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ict.ryokon.shugakuryokon2018.databinding.RowRollCallBinding
import com.ict.ryokon.shugakuryokon2018.model.UserData

class RollCallViewHolder(private val binding: RowRollCallBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(userData: UserData) {
        binding.userdata = userData
    }

    fun unbind() {
        binding.unbind()
    }

    companion object {
        fun create(
            inflater: LayoutInflater,
            parent: ViewGroup,
            attachToRoot: Boolean
        ): RollCallViewHolder =
            RollCallViewHolder(
                RowRollCallBinding.inflate(
                    inflater,
                    parent,
                    attachToRoot
                )
            )
    }
}
