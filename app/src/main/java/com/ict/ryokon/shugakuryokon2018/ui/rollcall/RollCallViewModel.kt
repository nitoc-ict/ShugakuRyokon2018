package com.ict.ryokon.shugakuryokon2018.ui.rollcall

import androidx.lifecycle.ViewModel
import com.ict.ryokon.shugakuryokon2018.model.Minor
import com.ict.ryokon.shugakuryokon2018.model.UserData
import com.ict.ryokon.shugakuryokon2018.model.repository.UserDataRepository

class RollCallViewModel : ViewModel() {
    val userDataList: ArrayList<UserData> = UserDataRepository.findAll()

    fun takeRollCallByMinor(
        minor: Minor,
        isAttend: Boolean
    ) {
        userDataList.forEachIndexed { index, userData ->
            if (userData.minor == minor) {
                userDataList[index] = userData.copy(isAttend = isAttend)
                return
            }
        }
    }
}