package com.example.darklord.blinklauncher;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by darklord on 20/08/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class DrawerAdapter extends BaseAdapter{
    Context mContext;
    Pac[] pacsForAdapter;

    public DrawerAdapter (Context c, Pac pacs[]){
        mContext =c;
        pacsForAdapter = pacs;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return pacsForAdapter.length;
    }

    @Override
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    static class ViewHolder{
        TextView text;
        ImageView icon;
    }
    @Override
    public View getView(int pos, View convertView, ViewGroup arg2) {
        // TODO Auto-generated method stub
        ViewHolder viewHolder;
        LayoutInflater li = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView==null){
            convertView = li.inflate(R.layout.drawable_item, null);

            viewHolder = new ViewHolder();
            viewHolder.text= (TextView)convertView.findViewById(R.id.icon_text);
            viewHolder.icon= (ImageView)convertView.findViewById(R.id.icon_image);

            convertView.setTag(viewHolder);
        }
        else
            viewHolder = (ViewHolder) convertView.getTag();

        System.out.println("asmmmmmmmmmmmmmmm");
        viewHolder.text.setText(pacsForAdapter[pos].label);
        viewHolder.icon.setImageDrawable(pacsForAdapter[pos].icon);

        return convertView;
    }

}