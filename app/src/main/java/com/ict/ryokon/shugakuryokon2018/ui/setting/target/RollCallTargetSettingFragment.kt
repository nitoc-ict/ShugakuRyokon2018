package com.ict.ryokon.shugakuryokon2018.ui.setting.target

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.ict.ryokon.shugakuryokon2018.R
import com.ict.ryokon.shugakuryokon2018.databinding.FragmentRollCallTargetSettingBinding
import com.ict.ryokon.shugakuryokon2018.model.UserData
import com.ict.ryokon.shugakuryokon2018.model.repository.UserDataRepository

class RollCallTargetSettingFragment : Fragment() {
    private lateinit var userDataList: ArrayList<UserData>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentRollCallTargetSettingBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_roll_call_target_setting,
            container,
            false
        )

        userDataList = UserDataRepository.findAll()

        binding.also { it ->
            it.adapter = RollCallTargetSettingAdapter(userDataList)
            it.setLifecycleOwner(this)
        }

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        val appCompatActivity = activity as AppCompatActivity?
        appCompatActivity?.supportActionBar?.let {
            it.title = getString(R.string.title_roll_call_target)
            it.setDisplayHomeAsUpEnabled(true)
            it.setHomeButtonEnabled(true)
        }
    }
}