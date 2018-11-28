package com.ict.ryokon.shugakuryokon2018.ui.setting.beacon.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ict.ryokon.shugakuryokon2018.model.UserData

class BeaconAdapter(private val userDataList:List<UserData>) :
    RecyclerView.Adapter<BeaconViewHolder>() {//ViewHolderクラスとしてBeaconViewHolderを定義

    //
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BeaconViewHolder = BeaconViewHolder.create(
        LayoutInflater.from(parent.context),//レイアウトファイルからビューを生成する
        parent,
        /*　Rootで指定したものをviewのルートにしない　*/
        false
    )
//抽象メゾット
    override fun getItemCount(): Int = userDataList.size
//抽象メゾット
    override fun onBindViewHolder(
        holder: BeaconViewHolder,
        position: Int
    ) {
        holder.bind(userDataList[position])
    }
}