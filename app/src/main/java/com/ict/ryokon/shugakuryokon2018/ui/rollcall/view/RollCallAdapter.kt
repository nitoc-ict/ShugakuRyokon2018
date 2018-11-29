package com.ict.ryokon.shugakuryokon2018.ui.rollcall.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableList
import androidx.recyclerview.widget.RecyclerView
import com.ict.ryokon.shugakuryokon2018.model.UserData

class RollCallAdapter(private val userDataList: ObservableArrayList<UserData>) :
    RecyclerView.Adapter<RollCallViewHolder>() {

    init {
        userDataList.addOnListChangedCallback(object :
            ObservableList.OnListChangedCallback<ObservableArrayList<UserData>>() {
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
        })
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RollCallViewHolder =
        RollCallViewHolder.create(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

    override fun getItemCount(): Int = userDataList.size

    override fun onBindViewHolder(
        holder: RollCallViewHolder,
        position: Int
    ) {
        holder.bind(userDataList[position])
    }
}