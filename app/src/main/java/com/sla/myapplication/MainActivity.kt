package com.sla.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonHelloWorld: Button = findViewById(R.id.buttonHelloWorld)
        val textView: TextView = findViewById(R.id.textView)

        buttonHelloWorld.setOnClickListener {
            textView.text = getString(R.string.hello_world)
        }

        val buttonSendNotification: Button = findViewById(R.id.buttonPushNotification)
        val notificationHelper = NotificationHelper(this)

        buttonSendNotification.setOnClickListener {
            notificationHelper.showNotification("FCM Push", "This is a FCM push notification")
        }
    }

}
