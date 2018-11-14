package com.ict.ryokon.shugakuryokon2018.model

data class UserData(
    var name: Name,
    var minor: Minor,
    var isRollCallTarget: Boolean,
    var isAttend: Boolean
)
