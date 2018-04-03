package edu.monash.fit3027.news;

/**
 * Created by hemanth kumar pujari on 23/03/2018.
 *
 * This class handles all the diseases information by retriving data from the database
 *
 *
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;


class ListNewsAdapter extends BaseAdapter {
    private Activity activity;
    private ArrayList<HashMap<String, String>> data;

    public ListNewsAdapter(Activity a, ArrayList<HashMap<String, String>> d) {
        activity = a;
        data=d;
    }
    public int getCount() {
        return data.size();
    }
    public Object getItem(int position) {
        return position;
    }
    public long getItemId(int position) {
        return position;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        ListNewsViewHolder holder = null;
        if (convertView == null) {
            holder = new ListNewsViewHolder();
            convertView = LayoutInflater.from(activity).inflate(
                    R.layout.header_news_layout, parent, false);
            holder.galleryImage = (ImageView) convertView.findViewById(R.id.galleryImage);
            holder.title = (TextView) convertView.findViewById(R.id.title);
            holder.sdetails = (TextView) convertView.findViewById(R.id.sdetails);
                convertView.setTag(holder);
        } else {
            holder = (ListNewsViewHolder) convertView.getTag();
        }
        holder.galleryImage.setId(position);
        holder.title.setId(position);
        holder.sdetails.setId(position);

        HashMap<String, String> song = new HashMap<String, String>();
        song = data.get(position);

        try{
            // removing the word "medical new today" in the title
            if(song.get(MainActivity.KEY_TITLE).contains("Medical News Today")) {
                String orginalTitle = song.get(MainActivity.KEY_TITLE);
                String [] arr = orginalTitle.split(" ", 2);
                String [] arry = arr[1].split(" ", 2);
                String [] finalTitle = arry[1].split(" ", 2);


                holder.title.setText(finalTitle[1]);
            }
            else
            holder.title.setText(song.get(MainActivity.KEY_TITLE));

            holder.sdetails.setText(song.get(MainActivity.KEY_DESCRIPTION));

            if(song.get(MainActivity.KEY_URLTOIMAGE).toString().length() < 5)
            {
                holder.galleryImage.setVisibility(View.GONE);
            }else{
                Picasso.with(activity)
                        .load(song.get(MainActivity.KEY_URLTOIMAGE).toString())
                        .resize(2200, 600)
                        .into(holder.galleryImage);
            }
        }catch(Exception e) {}
        return convertView;
    }
}

class ListNewsViewHolder {
    ImageView galleryImage;
    TextView  title, sdetails;
}