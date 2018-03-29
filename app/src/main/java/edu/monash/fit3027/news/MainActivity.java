package edu.monash.fit3027.news;
/**
 * Created by hemanth kumar pujari on 23/03/2018.
 *
 * This function handles the lunching page of the application and also moves this page to application menu page
 *
 *
 */
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import static android.net.sip.SipErrorCode.TIME_OUT;

public class MainActivity extends AppCompatActivity {


    ArrayList<HashMap<String, String>> dataList = new ArrayList<HashMap<String, String>>();
    static final String KEY_AUTHOR = "author";
    static final String KEY_TITLE = "title";
    static final String KEY_DESCRIPTION = "description";
    static final String KEY_URL = "url";
    static final String KEY_URLTOIMAGE = "urlToImage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                // moving activity to menu activity
                Intent intent = new Intent(MainActivity.this, AppMenuActivity.class);
                startActivity(intent);
            }
        }, 1000);



    }


}