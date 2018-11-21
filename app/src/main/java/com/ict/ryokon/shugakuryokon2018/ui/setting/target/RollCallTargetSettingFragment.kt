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
import com.ict.ryokon.shugakuryokon2018.model.repository.UserDataRepository

class RollCallTargetSettingFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bindingModel = RollCallTargetSettingBindingModel()

        val binding: FragmentRollCallTargetSettingBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_roll_call_target_setting,
            container,
            false
        )

        val list = UserDataRepository.findAll()
        binding.also { it ->
            it.adapter = RollCallTargetSettingAdapter(list)
            it.setLifecycleOwner(this)
        }

        return binding.root
    }
}
