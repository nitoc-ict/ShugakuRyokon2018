package com.ict.ryokon.shugakuryokon2018.ui

import android.bluetooth.BluetoothManager
import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.ict.ryokon.shugakuryokon2018.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bluetoothManager= getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
        val bluetoothAdapter = bluetoothManager.adapter

        if (!bluetoothAdapter.isEnabled) {
            AlertDialog.Builder(this)
                .setTitle(getString(R.string.bluetooth_alert_title))
                .setMessage(getString(R.string.bluetooth_alert_body))
                .setPositiveButton(getString(R.string.bluetooth_alert_ok)) { _, _ ->
                }
                .show()
            bluetoothAdapter.enable()
        }
    }

    override fun onSupportNavigateUp() = findNavController(R.id.navhost).navigateUp()
}
