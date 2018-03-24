package com.onlinenepalese.broadcastreceiverdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

/**
 * Created by Bijay on 3/24/2018.
 */
class MyBroadCastReceiver: BroadcastReceiver() {

	private val TAG = MyBroadCastReceiver::class.java.simpleName

	override fun onReceive(context: Context?, intent: Intent?) {
		Log.d(TAG, "onReceive() running in thread: ${Thread.currentThread().name}")
		Toast.makeText(context, "BroadCast Received", Toast.LENGTH_SHORT).show()
	}

}