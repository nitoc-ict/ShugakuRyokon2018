package com.ict.ryokon.shugakuryokon2018.ui.setting.beacon.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableList
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.ict.ryokon.shugakuryokon2018.model.UserData

class BeaconAdapter(private val userDataList: ObservableArrayList<UserData>) :
    RecyclerView.Adapter<BeaconViewHolder>() { // ViewHolderクラスとしてBeaconViewHolderを定義

    lateinit var navController: NavController

    init {
        userDataList.addOnListChangedCallback(
            object : ObservableList.OnListChangedCallback<ObservableArrayList<UserData>>() {
                override fun onChanged(sender: ObservableArrayList<UserData>?) {
                    notifyDataSetChanged()
                }

                override fun onItemRangeRemoved(
                    sender: ObservableArrayList<UserData>?,
                    positionStart: Int,
                    itemCount: Int
                ) {
                    notifyItemRangeRemoved(positionStart, itemCount)
                }

                override fun onItemRangeMoved(
                    sender: ObservableArrayList<UserData>?,
                    fromPosition: Int,
                    toPosition: Int,
                    itemCount: Int
                ) {
                    for (i in 0..itemCount) {
                        notifyItemMoved(
                            fromPosition + i,
                            toPosition + i
                        )
                    }
                }

                override fun onItemRangeInserted(
                    sender: ObservableArrayList<UserData>?,
                    positionStart: Int,
                    itemCount: Int
                ) {
                    notifyItemRangeInserted(
                        positionStart,
                        itemCount
                    )
                }

                override fun onItemRangeChanged(
                    sender: ObservableArrayList<UserData>?,
                    positionStart: Int,
                    itemCount: Int
                ) {
                    notifyItemRangeChanged(
                        positionStart,
                        itemCount
                    )
                }
            }
        )
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BeaconViewHolder = BeaconViewHolder.create(
        LayoutInflater.from(parent.context), // レイアウトファイルからビューを生成する
        parent,
        /*　Rootで指定したものをviewのルートにしない　*/
        false
    )

    // 抽象メゾット
    override fun getItemCount(): Int = userDataList.size

    // 抽象メゾット
    override fun onBindViewHolder(
        holder: BeaconViewHolder,
        position: Int
    ) {
        holder.bind(userDataList[position])
        holder.binding.root.setOnClickListener {
            val action = BeaconUserListFragmentDirections.actionBeaconUserListFragmentToBeaconSettingFragment(
                userDataList[position].attendanceNumber.value
            )
            navController.navigate(action)
        }
    }
}