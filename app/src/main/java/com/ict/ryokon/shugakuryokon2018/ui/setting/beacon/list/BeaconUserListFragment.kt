package com.ict.ryokon.shugakuryokon2018.ui.setting.beacon.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.ict.ryokon.shugakuryokon2018.R
import com.ict.ryokon.shugakuryokon2018.databinding.FragmentUserlistBinding
import com.ict.ryokon.shugakuryokon2018.model.repository.UserDataRepository

class BeaconUserListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentUserlistBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_userlist,
            container,
            false
        )

        val list = UserDataRepository.findAll()

        binding.also { it ->
            it.adapter = BeaconAdapter(list)
            it.setLifecycleOwner(this)
        }
        return binding.root
    }
    //mitoが書く
    findNavController().navigate(R.id.action_beaconUserListFragment2_to_beaconSettingFragment2)
}