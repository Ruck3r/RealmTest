package ru.rucker.realmtest;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by Rucker on 08.12.2017.
 */

public class RealmApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);

    }
}
