package com.ict.ryokon.shugakuryokon2018.ui.setting.beacon.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ict.ryokon.shugakuryokon2018.R
import com.ict.ryokon.shugakuryokon2018.databinding.FragmentBeaconUserListBinding
import com.ict.ryokon.shugakuryokon2018.model.repository.UserDataRepository

class BeaconUserListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentBeaconUserListBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_beacon_user_list,
            container,
            false
        )

        val list = UserDataRepository.findAll()

        val adapter = BeaconAdapter(list)
        adapter.onItemClickListener = clickListListener

        binding.also { it ->
            it.adapter = adapter
            it.setLifecycleOwner(this)
        }
        return binding.root
    }

    private val clickListListener: View.OnClickListener = View.OnClickListener {
        findNavController().navigate(R.id.action_beaconUserListFragment_to_beaconSettingFragment)
    }
}