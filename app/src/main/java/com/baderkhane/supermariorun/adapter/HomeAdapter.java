package com.baderkhane.supermariorun.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.baderkhane.supermariorun.MainActivity;
import com.baderkhane.supermariorun.R;
import com.baderkhane.supermariorun.ViewHolder;
import com.baderkhane.supermariorun.model.Article;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by baderkhaneoussama@gmail.com on 19/12/2016.
 */

public class HomeAdapter extends BaseAdapter {
    private final String TAG="HomeAdapter";
    private final LayoutInflater inflater;
    private ArrayList<Article> data;
    private Context context;

    public HomeAdapter(Context context, ArrayList<Article> data) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        //Arrays.copyOf(pcituresList, pcituresList.length);
        this.data = data;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = inflater
                    .inflate(R.layout.item_level, parent, false);
        }
        LinearLayout container = ViewHolder.get(convertView, R.id.container);
        ImageView itemImageView = ViewHolder.get(convertView, R.id.itemImageView);
        itemImageView.setImageResource(data.get(position).imgSrc);
        Log.v(TAG,data.get(position).imgSrc+" ");
        container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)context).startDetail(data.get(position));
            }
        });

        return convertView;
    }

    @Override
    public int getCount() {
        return data != null ? data.size(): 0;
    }
}
