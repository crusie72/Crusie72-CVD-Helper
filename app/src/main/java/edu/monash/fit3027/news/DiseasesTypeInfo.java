package edu.monash.fit3027.news;
/**
 * Created by hemanth kumar pujari on 23/03/2018.
 *
 * This class handles all the diseases information by retriving data from the database
 *
 *
 */

import android.database.Cursor;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DiseasesTypeInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseases_type_info);

        //creating textview objects

        TextView typename = (TextView)findViewById(R.id.typetextid);
        TextView des = (TextView)findViewById(R.id.dsccontentid);
        TextView caus= (TextView)findViewById(R.id.CausecontentID);
        TextView sym = (TextView)findViewById(R.id.SymptomcontentID);
        TextView preve = (TextView)findViewById(R.id.PreventioncontentID);
        TextView source = (TextView)findViewById(R.id.textView13);
        String name = getIntent().getExtras().getString("itemname");
        ImageView img = (ImageView)findViewById(R.id.imageView);

        // checking the diseases name and display the related picture

        if(name.equalsIgnoreCase("Coronary heart disease"))
            img.setImageResource(R.drawable.corner);

        else if(name.equalsIgnoreCase("Rheumatic heart disease"))
            img.setImageResource(R.drawable.rhem);

        else if(name.equalsIgnoreCase("congenital heart disease"))
            img.setImageResource(R.drawable.conge);
        else if(name.equalsIgnoreCase("peripheral arterial disease"))
            img.setImageResource(R.drawable.pe1);
        else if(name.equalsIgnoreCase("cerebrovascular disease"))
            img.setImageResource(R.drawable.cardiova);
        else if(name.equalsIgnoreCase("deep vein thrombosis and pulmonary embolism"))
            img.setImageResource(R.drawable.deepvein);

        // setting up conncetion to database

        DataBaseConn db = new DataBaseConn(this);
        Cursor cursor = db.getselectedData(name);
        System.out.println(cursor);
        cursor.moveToFirst();

        // after retrive the data and set the data to related text views to make it content displaty

        typename.setPaintFlags(typename.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        typename.setText(cursor.getString(0));
        des.setText(cursor.getString(1));
        caus.setText(cursor.getString(2));
        sym.setText(cursor.getString(3));
        preve.setText(cursor.getString(4));
        source.setText(cursor.getString(5));



    }
}
