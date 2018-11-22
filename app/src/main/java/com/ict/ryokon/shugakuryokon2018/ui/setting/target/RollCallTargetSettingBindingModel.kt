package com.ict.ryokon.shugakuryokon2018.ui.setting.target

import android.util.Log
import com.ict.ryokon.shugakuryokon2018.model.UserData
import com.ict.ryokon.shugakuryokon2018.model.repository.UserDataRepository

class RollCallTargetSettingBindingModel(val userData: UserData) {
    fun onCheckedChanged(checked: Boolean) {
        when (checked) {
            true -> {
                addTarget()
            }
            false -> {
                removeTarget()
            }
        }

        Log.d("isAttend", "${userData.isRollCallTarget}")
    }
    fun addTarget() {
        userData.isRollCallTarget = true
        UserDataRepository.updateUserData(userData)
    }
    fun removeTarget() {
        userData.isRollCallTarget = false
        UserDataRepository.updateUserData(userData)
    }
}
