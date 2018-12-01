package com.ict.ryokon.shugakuryokon2018.ui.setting.beacon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.ict.ryokon.shugakuryokon2018.R
import com.ict.ryokon.shugakuryokon2018.databinding.FragmentBeaconSettingBinding
import com.ict.ryokon.shugakuryokon2018.model.AttendanceNumber
import com.ict.ryokon.shugakuryokon2018.model.repository.UserDataRepository

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

        val viewModel: BeaconSettingViewModel = ViewModelProviders.of(this).get(BeaconSettingViewModel::class.java)
        val safeArgs = BeaconSettingFragmentArgs.fromBundle(arguments)
        val userAttendNum = safeArgs.userAttendNum

        UserDataRepository.findByAttendanceNumber(AttendanceNumber(userAttendNum))?.let { viewModel.userdata = it }

        binding.also { it ->
            it.setLifecycleOwner(this)
            it.viewmodel = viewModel
        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val appCompatActivity = activity as AppCompatActivity?
        appCompatActivity?.supportActionBar?.let {
            it.title = ""
            it.setDisplayHomeAsUpEnabled(true)
            it.setHomeButtonEnabled(true)
        }
    }
}