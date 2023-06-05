package com.sla.myapplication


import android.annotation.SuppressLint
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage


@SuppressLint("MissingFirebaseInstanceTokenRefresh")
class CloudMessaging : FirebaseMessagingService() {
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        // Handle FCM messages here.
        val messageBody = remoteMessage.notification?.body
        val messageTitle = remoteMessage.notification?.title

        val notificationHelper = NotificationHelper(this)
        notificationHelper.showNotification(messageTitle, messageBody)
    }
}