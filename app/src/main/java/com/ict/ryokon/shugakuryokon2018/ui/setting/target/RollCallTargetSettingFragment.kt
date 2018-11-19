package com.ict.ryokon.shugakuryokon2018.ui.setting.target

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.ict.ryokon.shugakuryokon2018.R
import com.ict.ryokon.shugakuryokon2018.databinding.FragmentRollCallTargetSettingBinding

class RollCallTargetSettingFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProviders.of(this).get(RollCallTargetSettingViewModel::class.java)

        val binding: FragmentRollCallTargetSettingBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_roll_call_target_setting,
            container,
            false
        )
        binding.also { it ->
            it.viewmodel = viewModel
        }

        return binding.root
    }
}
