package com.ict.ryokon.shugakuryokon2018.ui.rollcall

import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
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
import org.altbeacon.beacon.RangeNotifier
import org.altbeacon.beacon.Region

class RollCallFragment : Fragment(), BeaconConsumer {
    private lateinit var binding: FragmentRollCallBinding
    override fun unbindService(p0: ServiceConnection) {
        beaconManager.apply {
            stopRangingBeaconsInRegion(region)
            removeAllRangeNotifiers()
        }
    }

    override fun bindService(
        p0: Intent?,
        p1: ServiceConnection,
        p2: Int
    ): Boolean {
        return context?.bindService(
            p0,
            p1,
            p2
        ) ?: false
    }

    override fun getApplicationContext(): Context {
        return context?.applicationContext!!
    }

    override fun onBeaconServiceConnect() {
        beaconManager.apply {
            addRangeNotifier(rangeNotifier)
            startRangingBeaconsInRegion(region)
        }
    }

    private lateinit var viewModel: RollCallViewModel
    private val beaconManager: BeaconManager by lazy {
        BeaconManager.getInstanceForApplication(context!!).apply {
            beaconParsers.clear()
            beaconParsers.add(BeaconParser().setBeaconLayout(IBEACON_FORMAT))
            foregroundBetweenScanPeriod = 1024L // おおよそ1秒毎
        }
    }

    private val rangeNotifier = RangeNotifier { beacons, _ ->
        Log.d("BeaconRange", "$beacons")
        beacons.forEach {
            viewModel.takeRollCallByMinor(
                Minor(it.id3.toInt()),
                true
            )
        }
        binding.notifyChange()
    }

    private val region = Region(
        "ShugakuRyokon2018", // UniqueID
        null,   // UUID
        null,   // Major
        null    // Minor
    )

    private val fabtOnClickListener: View.OnClickListener = View.OnClickListener {
        if (viewModel.isStartRollCall.get()) {
            beaconManager.stopRangingBeaconsInRegion(region)
            viewModel.isStartRollCall.set(false)

        } else {
            beaconManager.startRangingBeaconsInRegion(region)
            viewModel.isStartRollCall.set(true)
        }
        binding.notifyChange()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProviders.of(this).get(RollCallViewModel::class.java)

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_roll_call,
            container,
            false
        )

        val adapter = RollCallAdapter(viewModel.userDataList)
        binding.also {
            it.adapter = adapter
            it.viewmodel = viewModel
            it.fabOnClick = fabtOnClickListener

            it.setLifecycleOwner(this)
        }
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onResume() {
        super.onResume()
        beaconManager.bind(this)
        viewModel.updateUserDataList()
        binding.adapter = RollCallAdapter(viewModel.userDataList)
        binding.notifyChange()
    }

    override fun onDestroy() {
        super.onDestroy()
        beaconManager.unbind(this)
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

    companion object {
        private const val IBEACON_FORMAT = "m:2-3=0215,i:4-19,i:20-21,i:22-23,p:24-24"
    }
}
