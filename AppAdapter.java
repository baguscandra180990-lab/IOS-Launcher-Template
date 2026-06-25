package com.ios.launcher;

import android.content.Context;
import android.view.*;
import android.widget.*;
import java.util.*;

public class AppAdapter extends BaseAdapter {

    Context c;
    List<AppModel> apps;

    public AppAdapter(Context c, List<AppModel> a){
        this.c=c;
        this.apps=a;
    }

    public int getCount(){ return apps.size(); }
    public Object getItem(int i){ return apps.get(i); }
    public long getItemId(int i){ return i; }

    public View getView(int i, View v, ViewGroup g){
        ImageView img;

        if(v==null){
            img = new ImageView(c);
            img.setLayoutParams(new GridView.LayoutParams(200,200));
            img.setPadding(20,20,20,20);
        } else img=(ImageView)v;

        img.setImageDrawable(apps.get(i).icon);
        return img;
    }
}
