package com.ios.launcher;

import android.graphics.drawable.Drawable;

public class AppModel {
    public String name;
    public String pkg;
    public Drawable icon;

    public AppModel(String n, String p, Drawable i){
        name=n; pkg=p; icon=i;
    }
}
