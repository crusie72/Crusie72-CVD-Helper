package edu.monash.fit3027.news;
/**
 * Created by hemanth kumar pujari on 23/03/2018.
 *
 * This file about the about function
 *
 * */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class AboutPageFragment extends Fragment {

    View myView;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.about_info, container, false);

        TextView about = (TextView)myView.findViewById(R.id.abouctContentID);
        String aboutContent = "\nCVD Helper is one mobile application that educate people about what they can do to prevent cardiovascular disease and provide heart-healthy living guidance. By using CVD Helper, the users will understand about different types of cardiovascular diseases but also learn how to prevent from the disease. Additionally, they can also easily find the nearest hospitals if needed on the appointment. \n"+"\n@Build Version: 1.0 \n"+"Released Date : 29/03/2018";

        about.setText(aboutContent);
        return myView;


    }
}


