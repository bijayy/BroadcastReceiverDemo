package com.onlinenepalese.broadcastreceiverdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.nfc.Tag
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.ResultReceiver
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	private val TAG = MainActivity::class.java.simpleName

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		Log.d(TAG, "onCreate() running in thread: ${Thread.currentThread().name}")
	}

	fun sendBroadCast(view: View) {

		val intent = Intent(this, MyBroadCastReceiver::class.java)
		sendBroadcast(intent)

		Log.d(TAG, "BroadCast sent to MyBroadCastReceiver from sendBroadCast() running in thread: ${Thread.currentThread().name}")
	}

}
