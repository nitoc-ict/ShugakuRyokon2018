package com.ict.ryokon.shugakuryokon2018.ui

import android.Manifest
import android.bluetooth.BluetoothManager
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.ict.ryokon.shugakuryokon2018.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        val bluetoothManager = getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
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

        // Check device what enabled BLE
        if (!packageManager.hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE)) {
            Toast.makeText(
                this,
                "",
                Toast.LENGTH_SHORT
            ).show()
        }
        // API 23 or more?
        if (Build.VERSION.SDK_INT >= 23) {
            checkPermission()
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun checkPermission() {
        if (checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(
                arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION),
                0
            )
        }
    }

    override fun onSupportNavigateUp() = findNavController(R.id.navhost).navigateUp()
}
