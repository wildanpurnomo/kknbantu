package com.kkndesasendang.sendangsmartlearning.helper;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Helper {
    public static void logMessage(String message, String className) {
        Log.w(className, message);
    }

    public static void popToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
