package com.example.testing_sql_uploading.ui.login;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

//Checks whether the device is connected to internet or not

public class CheckNetworkStatus {

    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}