package com.ict.ryokon.shugakuryokon2018.ui.setting.target

import android.util.Log
import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.ict.ryokon.shugakuryokon2018.model.UserData
import com.ict.ryokon.shugakuryokon2018.model.repository.UserDataRepository
import androidx.lifecycle.MutableLiveData

class RollCallTargetSettingViewModel : ViewModel() {
    var userDataList: ArrayList<UserData> = UserDataRepository.findAll()
    var changeSwitchTest: MutableLiveData<String> = MutableLiveData()

    fun onCheckedChanged(switch: View, checked: Boolean) {
        Log.d("switch", "$checked")

        when (checked) {
            true -> {
                changeSwitchTest.value = "on"
            }
            false -> {
                changeSwitchTest.value = "off"
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
