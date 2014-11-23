package com.bartek.example.broadcastreceiverexample;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class PowerConnectedReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("PowerConnecetdREceiver", "onReceive");
        Notification.Builder builder = new Notification.Builder(context);
        builder.setSmallIcon(R.drawable.ic_launcher);
        builder.setContentTitle("Power connection changed");
        builder.setContentText("Detected power connection changed");

        NotificationManager notificationService = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationService.notify(1, builder.build());


    }
}
