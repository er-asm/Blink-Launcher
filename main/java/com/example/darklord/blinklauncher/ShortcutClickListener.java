package com.example.darklord.blinklauncher;

/**
 * Created by darklord on 20/08/2017.
 */

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class ShortcutClickListener implements OnClickListener {
    Context mContext;

    public ShortcutClickListener(Context ctxt){
        mContext = ctxt;
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        Intent data;
        data= (Intent) v.getTag();
        mContext.startActivity(data);

    }
    public void OnLongClickListener(View v){

    }

}