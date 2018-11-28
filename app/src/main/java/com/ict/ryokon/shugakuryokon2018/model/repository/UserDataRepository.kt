package com.ict.ryokon.shugakuryokon2018.model.repository

import com.ict.ryokon.shugakuryokon2018.model.AttendanceNumber
import com.ict.ryokon.shugakuryokon2018.model.Minor
import com.ict.ryokon.shugakuryokon2018.model.Name
import com.ict.ryokon.shugakuryokon2018.model.UserData

object UserDataRepository {
    private var userDataList: ArrayList<UserData> = dummy()

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

//    ダミー用のデータ(本番前削除)
//    名前は[https://namegen.jp]にて生成
    private fun dummy(): ArrayList<UserData> = arrayListOf(
        UserData(
            name = Name(
                "山本 浩司",
                "やまもと こうじ"
            ),
            attendanceNumber = AttendanceNumber(1),
            minor = Minor(1),
            isAttend = true,
            isRollCallTarget = false
        ),
        UserData(
            name = Name(
                "丸岡 恭平",
                "まるおか きょうへい"
            ),
            attendanceNumber = AttendanceNumber(2),
            minor = Minor(2),
            isAttend = false,
            isRollCallTarget = true
        ),
        UserData(
            name = Name(
                "八重樫 良平",
                "やえがし りょうへい"
            ),
            attendanceNumber = AttendanceNumber(3),
            minor = Minor(3),
            isAttend = true,
            isRollCallTarget = true
        ),
        UserData(
            name = Name(
                "叶 優太",
                "かのう ゆうた"
            ),
            attendanceNumber = AttendanceNumber(4),
            minor = Minor(4),
            isAttend = false,
            isRollCallTarget = false
        ),
        UserData(
            name = Name(
                "岩月 拓人",
                "いわつき たくと"
            ),
            attendanceNumber = AttendanceNumber(5),
            minor = Minor(5),
            isAttend = false,
            isRollCallTarget = true
        ),
        UserData(
            name = Name(
                "片桐 志乃",
                "かたぎり しの"
            ),
            attendanceNumber = AttendanceNumber(6),
            minor = Minor(6),
            isAttend = false,
            isRollCallTarget = true
        ),
        UserData(
            name = Name(
                "花田 知香",
                "はなだ ちか"
            ),
            attendanceNumber = AttendanceNumber(7),
            minor = Minor(7),
            isAttend = true,
            isRollCallTarget = false
        ),
        UserData(
            name = Name(
                "島村 久恵",
                "しまむら ひさえ"
            ),
            attendanceNumber = AttendanceNumber(8),
            minor = Minor(8),
            isAttend = false,
            isRollCallTarget = false
        ),
        UserData(
            name = Name(
                "仲村 みづき",
                "なかむら みづき"
            ),
            attendanceNumber = AttendanceNumber(9),
            minor = Minor(9),
            isAttend = false,
            isRollCallTarget = false
        ),
        UserData(
            name = Name(
                "Julie Williams Wright",
                "ジュリー ウィリアムズ ライト"
            ),
            attendanceNumber = AttendanceNumber(10),
            minor = Minor(10),
            isAttend = true,
            isRollCallTarget = true
        )
    )
}
