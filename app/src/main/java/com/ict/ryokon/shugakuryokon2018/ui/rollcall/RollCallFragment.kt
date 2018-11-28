package com.ict.ryokon.shugakuryokon2018.ui.rollcall

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.ict.ryokon.shugakuryokon2018.R
import com.ict.ryokon.shugakuryokon2018.databinding.FragmentRollCallBinding
import com.ict.ryokon.shugakuryokon2018.model.Minor
import com.ict.ryokon.shugakuryokon2018.ui.rollcall.view.RollCallAdapter
import org.altbeacon.beacon.BeaconManager
import org.altbeacon.beacon.MonitorNotifier
import org.altbeacon.beacon.Region

class RollCallFragment : Fragment() {
    private lateinit var viewModel: RollCallViewModel
    private var beaconManager: BeaconManager? = null
    private val region = Region(
        "iBeacon",   // UniqueID
        null,   // UUID
        null,   // Major
        null    // Minor
    )

    private val startOnClickListener: View.OnClickListener = View.OnClickListener {
        beaconManager?.startMonitoringBeaconsInRegion(region)
    }

    private val stopOnClickListener: View.OnClickListener = View.OnClickListener {
        beaconManager?.stopMonitoringBeaconsInRegion(region)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProviders.of(this).get(RollCallViewModel::class.java)

        val binding: FragmentRollCallBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_roll_call,
            container,
            false
        )

        val adapter = RollCallAdapter(viewModel.userDataList)
        binding.adapter = adapter

        binding.setLifecycleOwner(this)

        return binding.root
    }

    override fun onCreateOptionsMenu(
        menu: Menu?,
        inflater: MenuInflater?
    ) {
        inflater?.inflate(
            R.menu.menu_main,
            menu
        )
        super.onCreateOptionsMenu(
            menu,
            inflater
        )
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.roll_call_target_setting -> {
                findNavController().navigate(R.id.action_rollCallFragment_to_rollCallTargetSettingFragment)
            }
            R.id.beacon_setting -> {
                findNavController().navigate(R.id.action_rollCallFragment_to_beaconUserListFragment)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onResume() {
        super.onResume()
        beaconManager = BeaconManager.getInstanceForApplication(context!!)

        beaconManager?.addMonitorNotifier(object : MonitorNotifier {
            override fun didEnterRegion(region: Region) {
                viewModel.takeRollCallByMinor(
                    Minor(region.id2.toInt()),
                    true
                )
            }

            override fun didExitRegion(region: Region) {
                viewModel.takeRollCallByMinor(
                    Minor(region.id2.toInt()),
                    false
                )
            }

            override fun didDetermineStateForRegion(
                state: Int,
                region: Region
            ) {
            }
        })
    }
}
