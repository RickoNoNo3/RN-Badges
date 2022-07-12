package com.reactlibrary;

import android.app.Notification;
import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class BadgesModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public BadgesModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "Badges";
    }

    @ReactMethod
    public void setNotificationBadge(int count) {
        Notification notification = new NotificationCompat.Builder(reactContext)
                .setSmallIcon(R.drawable.ic_notification)
                .setNumber(count)
                .setPriority(NotificationCompat.PRIORITY_MIN)
                .build();
    }
}
