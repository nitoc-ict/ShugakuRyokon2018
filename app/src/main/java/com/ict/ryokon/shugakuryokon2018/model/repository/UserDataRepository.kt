package com.ict.ryokon.shugakuryokon2018.model.repository

import com.ict.ryokon.shugakuryokon2018.model.AttendanceNumber
import com.ict.ryokon.shugakuryokon2018.model.Minor
import com.ict.ryokon.shugakuryokon2018.model.Name
import com.ict.ryokon.shugakuryokon2018.model.UserData

object UserDataRepository {
    private var userDataList: ArrayList<UserData> = arrayListOf()

    fun storeAll(userDataList: ArrayList<UserData>) {
        this.userDataList = userDataList
    }

    fun findAll(): ArrayList<UserData> = userDataList

    fun findByName(name: Name): UserData? = userDataList.find { it.name == name }

    fun findByMinor(minor: Minor): UserData? = userDataList.find { it.minor == minor }

    fun findByAttendanceNumber(number: AttendanceNumber): UserData? =
        userDataList.find { it.attendanceNumber == number }
}
