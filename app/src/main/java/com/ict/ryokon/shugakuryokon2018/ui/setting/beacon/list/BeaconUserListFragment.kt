package com.ict.ryokon.shugakuryokon2018.ui.setting.beacon.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableArrayList
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ict.ryokon.shugakuryokon2018.R
import com.ict.ryokon.shugakuryokon2018.databinding.FragmentBeaconUserListBinding
import com.ict.ryokon.shugakuryokon2018.model.UserData
import com.ict.ryokon.shugakuryokon2018.model.repository.DataRepository
import com.ict.ryokon.shugakuryokon2018.model.repository.UserDataRepository

class BeaconUserListFragment : Fragment() {
    private lateinit var userDataList: ArrayList<UserData>

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

        val observableUserList = ObservableArrayList<UserData>()
        userDataList = UserDataRepository.findAll()
        userDataList.forEach {
            observableUserList.add(it)
        }

        val adapter = BeaconAdapter(observableUserList)
        adapter.navController = findNavController()

        binding.also { it ->
            it.adapter = adapter
            it.setLifecycleOwner(this)
        }
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        val appCompatActivity = activity as AppCompatActivity?
        appCompatActivity?.supportActionBar?.let {
            it.title = getString(R.string.title_beacon_setting)
            it.setDisplayHomeAsUpEnabled(true)
            it.setHomeButtonEnabled(true)
        }
    }

    override fun onPause() {
        super.onPause()
        DataRepository().saveUserDataList(
            context!!,
            userDataList
        )
    }
}