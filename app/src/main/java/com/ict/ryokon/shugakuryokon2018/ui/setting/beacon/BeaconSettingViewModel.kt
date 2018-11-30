package com.ict.ryokon.shugakuryokon2018.ui.setting.beacon

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModel
import com.ict.ryokon.shugakuryokon2018.model.Minor
import com.ict.ryokon.shugakuryokon2018.model.UserData
import com.ict.ryokon.shugakuryokon2018.model.repository.UserDataRepository

class BeaconSettingViewModel : ViewModel() {
    lateinit var userdata: UserData // lateinit今初期化しない
    var minor: String = ""

    fun removeOnClick(savedInstanceState: Bundle?) {
        // 前の画面にもどる
    }

    fun changeOnClick(view: View) {
        // UserDataのMinorをuserdataにセットする
        userdata.minor = Minor(Integer.parseInt(minor))
        UserDataRepository.updateUserData(userdata)
    }

    fun onMinorChanged(
        c: CharSequence,
        start: Int,
        before: Int,
        count: Int
    ) {
        minor = c.toString()
    }
}