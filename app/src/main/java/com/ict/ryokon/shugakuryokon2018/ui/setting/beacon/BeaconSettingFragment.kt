package com.ict.ryokon.shugakuryokon2018.ui.setting.beacon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.ict.ryokon.shugakuryokon2018.R
import com.ict.ryokon.shugakuryokon2018.databinding.FragmentBeaconSettingBinding

class BeaconSettingFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentBeaconSettingBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_beacon_setting,
            container,
            false
        )

        binding.also { it ->
            it.setLifecycleOwner(this)
        }

        return binding.root
    }
}