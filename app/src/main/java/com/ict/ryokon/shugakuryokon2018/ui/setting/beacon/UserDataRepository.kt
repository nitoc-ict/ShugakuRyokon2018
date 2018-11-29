package com.ict.ryokon.shugakuryokon2018.ui.setting.beacon

import android.os.Bundle
import androidx.databinding.DataBindingUtil.setContentView

class UserDataRepository {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bar = supportActionBar
        if(bar != null){
            bar.setDisplayHomeAsUpEnabled(true)
            bar.setHomeButtonEnabled(true)
        }
    }
}