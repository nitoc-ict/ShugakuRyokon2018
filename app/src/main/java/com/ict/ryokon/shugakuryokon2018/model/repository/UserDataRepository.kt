package com.ict.ryokon.shugakuryokon2018.model.repository

import com.ict.ryokon.shugakuryokon2018.model.AttendanceNumber
import com.ict.ryokon.shugakuryokon2018.model.Minor
import com.ict.ryokon.shugakuryokon2018.model.Name
import com.ict.ryokon.shugakuryokon2018.model.UserData

object UserDataRepository {
    private var userDataList: ArrayList<UserData> = DummyData().dummy()

    fun storeAll(userDataList: ArrayList<UserData>) {
        this.userDataList = userDataList
    }

    fun findAll(): ArrayList<UserData> = userDataList

    fun findByName(name: Name): UserData? = userDataList.find { it.name == name }

    fun findByMinor(minor: Minor): UserData? = userDataList.find { it.minor == minor }

    fun findByAttendanceNumber(number: AttendanceNumber): UserData? =
        userDataList.find { it.attendanceNumber == number }

    fun updateUserData(newUserData: UserData) {
        userDataList.forEachIndexed { index, oldUserData ->
            if (oldUserData.attendanceNumber == newUserData.attendanceNumber) {
                userDataList[index] = newUserData
            }
        }
    }

}
