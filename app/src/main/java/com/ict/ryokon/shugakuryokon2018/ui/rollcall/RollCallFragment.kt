package com.ict.ryokon.shugakuryokon2018.ui.rollcall

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.ict.ryokon.shugakuryokon2018.R
import com.ict.ryokon.shugakuryokon2018.model.Minor
import com.ict.ryokon.shugakuryokon2018.model.repository.UserDataRepository
import org.altbeacon.beacon.BeaconManager
import org.altbeacon.beacon.MonitorNotifier
import org.altbeacon.beacon.Region

class RollCallFragment : Fragment() {
    private lateinit var viewModel: RollCallViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewModel = ViewModelProviders.of(this).get(RollCallViewModel::class.java)
        viewModel.userDataList = UserDataRepository.findAll()

        return super.onCreateView(
            inflater,
            container,
            savedInstanceState
        )
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(
            R.menu.menu_main,
            menu
        )
        super.onCreateOptionsMenu(menu, inflater)
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
        val beaconManager = BeaconManager.getInstanceForApplication(context!!)

        val region = Region(
            null,   // UniqueID
            null,   // UUID
            null,   // Major
            null    // Minor
        )

        beaconManager.addMonitorNotifier(object : MonitorNotifier {
            override fun didEnterRegion(region: Region) {
                takeRollCallByMinor(
                    Minor(region.id2.toInt()),
                    true
                )
            }

            override fun didExitRegion(region: Region) {
                takeRollCallByMinor(
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
        beaconManager.startMonitoringBeaconsInRegion(region)
    }

    fun takeRollCallByMinor(
        minor: Minor,
        isAttend: Boolean
    ) {
        viewModel.userDataList.forEachIndexed {
                index,
                userData
            ->
            if (userData.minor == minor) {
                viewModel.userDataList[index] = userData.copy(isAttend = isAttend)
                return
            }
        }
    }

    fun startOnClick(view: View) {
        TODO("Must implement")
    }

    fun stopOnClick(view: View) {
        TODO("Must implement")
    }

}