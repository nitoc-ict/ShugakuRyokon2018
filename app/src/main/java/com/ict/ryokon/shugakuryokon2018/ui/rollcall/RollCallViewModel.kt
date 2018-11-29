package com.ict.ryokon.shugakuryokon2018.ui.rollcall

import androidx.databinding.Bindable
import androidx.databinding.ObservableArrayList
import androidx.lifecycle.ViewModel
import com.ict.ryokon.shugakuryokon2018.model.Minor
import com.ict.ryokon.shugakuryokon2018.model.UserData
import com.ict.ryokon.shugakuryokon2018.model.repository.UserDataRepository

class RollCallViewModel : ViewModel() {
    val userDataList: ObservableArrayList<UserData> = ObservableArrayList()

    init {
        val allUserDataList = UserDataRepository.findAll()
        allUserDataList.forEach {
            if (it.isRollCallTarget) {
                userDataList.add(it)
            }
        }
    }

    @Bindable
    var unAttendNumText: String = getUnAttendUserNum().toString()

    @Bindable
    var userDataListText: String = "/${userDataList.size}"

    @Bindable
    var completedRollCall: Boolean = getUnAttendUserNum() == 0

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

    private fun getUnAttendUserNum(): Int {
        val unAttendUserList: ArrayList<UserData> = arrayListOf()

        userDataList.forEach {
            if (!it.isAttend) {
                unAttendUserList.add(it)
            }
        }

        return unAttendUserList.size
    }
}