package com.ict.ryokon.shugakuryokon2018.ui.setting.beacon

import android.view.View
import androidx.databinding.Bindable
import androidx.databinding.ObservableBoolean
import androidx.lifecycle.ViewModel
import com.ict.ryokon.shugakuryokon2018.model.Minor
import com.ict.ryokon.shugakuryokon2018.model.UserData
import com.ict.ryokon.shugakuryokon2018.model.repository.UserDataRepository

class BeaconSettingViewModel : ViewModel() {
    lateinit var userdata: UserData // lateinit今初期化しない
    var minor: String = ""

    @Bindable
    var changeable: ObservableBoolean = ObservableBoolean(false)

    fun cancelOnClick(view: View) {
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
        changeable.set(minor != "" && userdata.minor != Minor(Integer.parseInt(minor)))
    }
}