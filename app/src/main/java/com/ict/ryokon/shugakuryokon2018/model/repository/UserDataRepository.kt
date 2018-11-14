package com.ict.ryokon.shugakuryokon2018.model.repository

import com.ict.ryokon.shugakuryokon2018.Minor
import com.ict.ryokon.shugakuryokon2018.Name
import com.ict.ryokon.shugakuryokon2018.UserData

object UserDataRepository {
    private var userDataList: ArrayList<UserData> = arrayListOf()

    fun storeAll(userDataList: ArrayList<UserData>) {
        this.userDataList = userDataList
    }

    fun findAll(): ArrayList<UserData> = userDataList

    fun findByName(name: Name): UserData? = userDataList.find { it.name == name }

    fun findByMinor(minor: Minor): UserData? = userDataList.find { it.minor == minor }
}
