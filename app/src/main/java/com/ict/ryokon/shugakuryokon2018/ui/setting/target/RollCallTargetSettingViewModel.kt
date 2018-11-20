package com.ict.ryokon.shugakuryokon2018.ui.setting.target

import android.util.Log
import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.ict.ryokon.shugakuryokon2018.model.UserData
import com.ict.ryokon.shugakuryokon2018.model.repository.UserDataRepository

class RollCallTargetSettingViewModel : ViewModel() {
    var userDataList: ArrayList<UserData> = UserDataRepository.findAll()
    var changeSwitchTest: ObservableField<String> = ObservableField("off")

    fun onCheckedChanged(switch: View, checked: Boolean) {
        Log.d("switch", "$checked")

        /*when (checked) {
            true -> changeSwitchTest = "on"
            false -> changeSwitchTest = "off"
        }*/

        when (checked) {
            true -> {

                changeSwitchTest.set("on")
            }
            false -> {
                changeSwitchTest.set("off")
            }
        }
    }
    fun addTarget() {
        //TODO iikanji ni Target ga add sareta toki no syori wo kaku
    }
    fun removeTarget() {
        //TODO iikanji ni Target ga removesareta toki no syori wo kaku
    }
}
