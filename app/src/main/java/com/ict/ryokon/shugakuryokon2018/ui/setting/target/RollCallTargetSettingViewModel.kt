package com.ict.ryokon.shugakuryokon2018.ui.setting.target

import android.util.Log
import android.view.View
import com.ict.ryokon.shugakuryokon2018.model.UserData
import androidx.lifecycle.MutableLiveData
import com.ict.ryokon.shugakuryokon2018.model.AttendanceNumber
import com.ict.ryokon.shugakuryokon2018.model.Minor
import com.ict.ryokon.shugakuryokon2018.model.Name

class RollCallTargetSettingBindingModel {
    /*var userData: UserData = UserData(
        name = Name("知花", "ちばな"),
        attendanceNumber = AttendanceNumber(1),
        minor = Minor(1),
        isRollCallTarget = true,
        isAttend = true
    )*/
    var changeSwitchTest: MutableLiveData<String> = MutableLiveData()

    fun onCheckedChanged(switch: View, checked: Boolean) {
        Log.d("isAttend", "${userData.isAttend}")

        when (checked) {
            true -> {
                userData.isAttend = true
            }
            false -> {
                userData.isAttend = false
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
