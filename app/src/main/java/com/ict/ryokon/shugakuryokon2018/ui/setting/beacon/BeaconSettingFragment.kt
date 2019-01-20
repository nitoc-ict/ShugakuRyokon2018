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
    private lateinit var viewmodel: BeaconSettingViewModel

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

        viewmodel = ViewModelProviders.of(this).get(BeaconSettingViewModel::class.java)
        val args = arguments ?: return null
        val safeArgs = BeaconSettingFragmentArgs.fromBundle(args)
        val userAttendNum = safeArgs.userAttendNum

        UserDataRepository.findByAttendanceNumber(AttendanceNumber(userAttendNum))?.let { viewmodel.userdata = it }

        binding.also { it ->
            it.setLifecycleOwner(this)
            it.viewmodel = viewmodel
        }

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        val appCompatActivity = activity as AppCompatActivity?
        appCompatActivity?.supportActionBar?.let {
            it.title = "${viewmodel.userdata.attendanceNumber.value} " +
                    "${viewmodel.userdata.name.kanji} " +
                    viewmodel.userdata.name.hiragana
            it.setDisplayHomeAsUpEnabled(true)
            it.setHomeButtonEnabled(true)
        }
    }
}