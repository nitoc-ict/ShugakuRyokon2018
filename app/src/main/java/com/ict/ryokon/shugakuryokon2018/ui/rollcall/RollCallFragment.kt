package com.ict.ryokon.shugakuryokon2018.ui.rollcall

import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.os.RemoteException
import android.util.Log
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
import org.altbeacon.beacon.BeaconConsumer
import org.altbeacon.beacon.BeaconManager
import org.altbeacon.beacon.BeaconParser
import org.altbeacon.beacon.Identifier
import org.altbeacon.beacon.MonitorNotifier
import org.altbeacon.beacon.Region

class RollCallFragment : Fragment(), BeaconConsumer {
    override fun unbindService(p0: ServiceConnection?) {
    }

    override fun bindService(p0: Intent?, p1: ServiceConnection?, p2: Int): Boolean {
        return true
    }

    override fun getApplicationContext(): Context {
        return context!!
    }

    override fun onBeaconServiceConnect() {

        beaconManager?.addMonitorNotifier(object : MonitorNotifier {
            override fun didEnterRegion(region: Region) {
                viewModel.takeRollCallByMinor(
                    Minor(region.id2.toInt()),
                    true
                )
                Log.d("BeaconEnter", region.id2?.toInt().toString())
            }

            override fun didExitRegion(region: Region) {
                viewModel.takeRollCallByMinor(
                    Minor(region.id2.toInt()),
                    false
                )
                Log.d("BeaconExit", region.id2?.toInt().toString())
            }

            override fun didDetermineStateForRegion(
                state: Int,
                region: Region
            ) {
                Log.d("BeaconState", state.toString())
            }
        })
        beaconManager?.addRangeNotifier { beaconList, region ->
            beaconList.forEach {
                Log.d("BeaconHoge", "hoge")
                Log.d("Beacon", it.id2.toInt().toString())
            }
        }

        try {
            beaconManager?.startRangingBeaconsInRegion(region)
        } catch (e: RemoteException) {
        }
    }

    private lateinit var viewModel: RollCallViewModel
    private var beaconManager: BeaconManager? = null
    private val region = Region(
        "ShugakuRyokon2018",   // UniqueID
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

        beaconManager = BeaconManager.getInstanceForApplication(context!!)
        beaconManager?.beaconParsers?.add(BeaconParser().setBeaconLayout(IBEACON_FORMAT))
        beaconManager?.bind(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        beaconManager?.unbind(this)
    }

    companion object {
        const val IBEACON_FORMAT = "m:2-3=beac,i:4-19,i:20-21,i:22-23,p:24-24,d:25-25"
    }
}
