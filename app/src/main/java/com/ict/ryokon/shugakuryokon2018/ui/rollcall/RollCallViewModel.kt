package com.ict.ryokon.shugakuryokon2018.ui.rollcall

import androidx.databinding.Bindable
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.ict.ryokon.shugakuryokon2018.model.Minor
import com.ict.ryokon.shugakuryokon2018.model.UserData
import com.ict.ryokon.shugakuryokon2018.model.repository.UserDataRepository

class RollCallViewModel : ViewModel() {
    val userDataList: ObservableArrayList<UserData> = ObservableArrayList()

    init {
        initValue()
        updateUserDataList()
    }

    @Bindable
    lateinit var unAttendNumText: ObservableField<String>

    @Bindable
    lateinit var userDataListText: ObservableField<String>

    @Bindable
    lateinit var completedRollCall: ObservableBoolean

    @Bindable
    lateinit var isStartRollCall: ObservableBoolean

    fun takeRollCallByMinor(
        minor: Minor,
        isAttend: Boolean
    ) {
        userDataList.forEachIndexed { index, userData ->
            if (userData.minor == minor) {
                userDataList[index] = userData.copy(isAttend = isAttend)
                UserDataRepository.updateUserData(userDataList[index])
                return
            }
        }
    }

    fun updateUserDataList() {
        userDataList.clear()
        val allUserDataList = UserDataRepository.findAll()
        allUserDataList.forEach {
            if (it.isRollCallTarget) {
                userDataList.add(it)
            }
        }
    }

    fun updateRollCallContent() {
        unAttendNumText.set(getUnAttendUserNum().toString())
        userDataListText.set("/${userDataList.size}")
        completedRollCall.set(getUnAttendUserNum() == 0)
    }

    private fun initValue() {
        unAttendNumText = ObservableField(getUnAttendUserNum().toString())
        userDataListText = ObservableField("/${userDataList.size}")
        completedRollCall = ObservableBoolean(getUnAttendUserNum() == 0)
        isStartRollCall = ObservableBoolean(false)
    }

    fun initRollCall() {
        userDataList.forEach {
            takeRollCallByMinor(
                it.minor,
                false
            )
        }
        updateRollCallContent()
    }

    private fun getUnAttendUserNum(): Int {
        var unAttendCount = 0

        userDataList.forEach {
            if (!it.isAttend) {
                unAttendCount++
            }
        }

        return unAttendCount
    }
}