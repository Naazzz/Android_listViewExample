package com.example.nazrin.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Nazrin on 05.01.2017.
 */

public class Film extends BaseAdapter {
    private int image_id [];
    private String text [];
    private Context context;

    public Film(int[] image_id, String[] text, Context context) {
        this.image_id = image_id;
        this.text = text;
        this.context = context;
    }

    @Override
    public int getCount() {
        return image_id.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        View itemView = view;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view==null){
           itemView = inflater.inflate(R.layout.list_view,null);
        }
        ImageView imageView = (ImageView) itemView.findViewById(R.id.ImageofList);
        TextView textView = (TextView) itemView.findViewById(R.id.TextofList);

        imageView.setImageResource(image_id[i]);
        textView.setText(text[i]);
        return itemView;
    }
}
