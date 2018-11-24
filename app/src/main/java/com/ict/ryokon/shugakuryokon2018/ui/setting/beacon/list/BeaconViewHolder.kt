package com.ict.ryokon.shugakuryokon2018.ui.setting.beacon.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ict.ryokon.shugakuryokon2018.databinding.RowRollCallBinding//FragmentBeaconSettingBindingかと思ったけど違うかな
import com.ict.ryokon.shugakuryokon2018.model.UserData

class BeaconViewHolder(private val binding: RowRollCallBinding) : RecyclerView.ViewHolder(binding.root) {

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
            RowRollCallBinding.inflate(
                inflater,
                parent,
                attachToRoot
            )
        )
    }
}
