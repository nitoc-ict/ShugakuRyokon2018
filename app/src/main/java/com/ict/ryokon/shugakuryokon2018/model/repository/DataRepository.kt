package com.ict.ryokon.shugakuryokon2018.model.repository

import android.content.Context
import com.ict.ryokon.shugakuryokon2018.R
import com.ict.ryokon.shugakuryokon2018.model.UserData
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import org.json.JSONArray

class DataRepository {

    fun saveUserDataList(
        ctx: Context,
        userDataList: ArrayList<UserData>
    ) {
        val moshi = Moshi.Builder().build()
        val userArrayParameterizedType = Types.newParameterizedType(
            List::class.java,
            UserData::class.java
        )
        val adapter = moshi.adapter<ArrayList<UserData>>(userArrayParameterizedType)

        saveString(
            ctx,
            ctx.getString(R.string.user_data),
            adapter.toJson(userDataList).toString()
        )
    }

    // 設定値 String を保存（Context は Activity や Application や Service）
    private fun saveString(
        ctx: Context,
        key: String,
        value: String
    ) {
        ctx.getSharedPreferences(
            ctx.getString(R.string.app_name),
            Context.MODE_PRIVATE
        ).edit().apply {
            putString(
                key,
                value
            )
        }.apply()
    }

    // 設定値 String を取得（Context は Activity や Application や Service）
    fun loadString(
        ctx: Context,
        key: String
    ): String =
        ctx.getSharedPreferences(
            ctx.getString(R.string.app_name),
            Context.MODE_PRIVATE
        ).getString(
            key,
            ""
        ) ?: ""// 第２引数はkeyが存在しない時に返す初期値

    fun parseData(jsonDataString: String = ""): ArrayList<UserData>? {
        val moshi = Moshi.Builder().build()
        if (jsonDataString == "") {
            return null
        }
        val userDataAdapter = moshi.adapter(UserData::class.java)

        val jsonArray = JSONArray(jsonDataString)
        val userDataArrayList: ArrayList<UserData> = arrayListOf()
        (0 until jsonArray.length()).forEach { i ->
            val dataJSON = jsonArray.getJSONObject(i).toString()
            userDataAdapter.fromJson(dataJSON)?.let { userDataArrayList.add(it) }
        }
        return userDataArrayList
    }
}