package com.ict.ryokon.shugakuryokon2018.ui.setting.beacon.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ict.ryokon.shugakuryokon2018.databinding.BeaconUserlistBinding
import com.ict.ryokon.shugakuryokon2018.model.UserData

class BeaconViewHolder(private val binding: BeaconUserlistBinding) : RecyclerView.ViewHolder(binding.root) {

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
        ): BeaconViewHolder = BeaconViewHolder(
            BeaconUserlistBinding.inflate(
                inflater,
                parent,
                attachToRoot
            )
        )
    }
}
