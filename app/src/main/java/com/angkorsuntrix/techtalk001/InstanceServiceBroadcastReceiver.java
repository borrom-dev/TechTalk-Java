package com.angkorsuntrix.techtalk001;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class InstanceServiceBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (!isInstanceServiceRunning(context)) {
            context.startActivity(new Intent(context, InstanceService.class));
        }

    }

    private static boolean isInstanceServiceRunning(Context context) {
        ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
            if (InstanceService.class.getName().equals(service.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

}
