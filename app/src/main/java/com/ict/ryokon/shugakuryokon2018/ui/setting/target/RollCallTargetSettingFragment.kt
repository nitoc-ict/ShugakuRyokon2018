package com.ict.ryokon.shugakuryokon2018.ui.setting.target

<<<<<<< HEAD
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class RollCallTargetSettingFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProviders.of(this).get(RollCallTargetSettingViewModel::class.java)

        return super.onCreateView(
            inflater,
            container,
            savedInstanceState
        )
    }
}
=======
import androidx.fragment.app.Fragment

class RollCallTargetSettingFragment : Fragment()
>>>>>>> gitignore is working
