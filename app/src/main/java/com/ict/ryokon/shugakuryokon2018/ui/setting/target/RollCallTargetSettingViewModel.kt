package com.ict.ryokon.shugakuryokon2018.ui.setting.target

import androidx.lifecycle.ViewModel
import com.ict.ryokon.shugakuryokon2018.model.UserData

class RollCallTargetSettingViewModel : ViewModel() {
    lateinit var userDataList: ArrayList<UserData>
    var changeSwitchTest: String = "off"

    fun onCheckedChenged(checked: Boolean) {
        if (checked == true) {
            changeSwitchTest = "on"
            //TODO call addTarget().
        }
        else {
            changeSwitchTest = "off"
            //TODO call removeTarget().
        }
    }
    fun addTarget() {
        //TODO iikanji ni Target ga add sareta toki no syori wo kaku
    }
    fun removeTarget() {
        //TODO iikanji ni Target ga removesareta toki no syori wo kaku
    }
}
