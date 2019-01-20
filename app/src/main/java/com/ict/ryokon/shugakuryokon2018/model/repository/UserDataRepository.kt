package com.ict.ryokon.shugakuryokon2018.model.repository

import android.content.Context
import com.ict.ryokon.shugakuryokon2018.R
import com.ict.ryokon.shugakuryokon2018.model.AttendanceNumber
import com.ict.ryokon.shugakuryokon2018.model.Minor
import com.ict.ryokon.shugakuryokon2018.model.Name
import com.ict.ryokon.shugakuryokon2018.model.UserData

object UserDataRepository {
    private lateinit var userDataList: ArrayList<UserData>

    fun initRepository(ctx: Context) {
        if (DataRepository().loadBoolean(
                ctx,
                ctx.getString(R.string.initialized)
            )
        ) {
            userDataList = DataRepository().parseData(
                DataRepository().loadString(
                    ctx,
                    ctx.getString(R.string.user_data)
                )
            ) ?: DummyData().dummy()
        } else {
            userDataList = DummyData().dummy()
            DataRepository().saveBoolean(
                ctx,
                ctx.getString(R.string.initialized),
                true
            )
        }
    }

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
