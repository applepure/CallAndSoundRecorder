package com.ism.awesomerecorder.deviceadmin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Dor on 7/10/2017.
 */

public class BootUp extends BroadcastReceiver {

    private static final String TAG = "myTag";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        Log.v(TAG, "Hooray! Received boot! :) "); //Sadly I am not getting this message

        Intent startServiceIntent = new Intent(context, TService.class);
        context.startService(startServiceIntent);



    }
}
