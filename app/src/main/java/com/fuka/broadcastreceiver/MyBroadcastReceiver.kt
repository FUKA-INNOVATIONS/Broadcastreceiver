package com.fuka.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyBroadcastReceiver : BroadcastReceiver() {
    val TAG = "MyBroadcastReceiver"

    override fun onReceive(context: Context, intent: Intent) {
        Log.d(TAG, "intent: $intent")
        Log.d(TAG, "intent extras: ${intent.extras}")
        Log.d(TAG, "context: $context")

        StringBuilder().apply {
            append("Action: ${intent.action}\n")
            append("URI: ${intent.toUri(Intent.URI_INTENT_SCHEME)}\n")
            toString().also { log ->
                Log.d(TAG, log)
                Toast.makeText(context, log, Toast.LENGTH_LONG).show()
            }
        }
    }


}