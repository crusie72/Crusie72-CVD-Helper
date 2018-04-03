package edu.monash.fit3027.news;
/**
 * Created by hemanth kumar pujari on 23/03/2018.
 *
 *
 * This java class provide the CVD types page which helps the user to select the particular dieases
 *
 * */

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class CVDTypesFragment extends Fragment {


    View myView;
    ListView list;
    ArrayList<String> data= new ArrayList<>();
    ArrayAdapter<String> adapter1;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.activity_types_home_page, container, false);
        list = (ListView)myView.findViewById(R.id.typeslist);
        // adding the diseases names to the list
        data.add("Coronary heart disease");
        data.add("Rheumatic heart disease");
        data.add("Cerebrovascular disease");
        data.add("Congenital heart disease");
        data.add("Peripheral arterial disease");
        data.add("Deep vein thrombosis and pulmonary embolism");
        adapter1 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
        list.setAdapter(adapter1);
        // creating clickable function to the list items
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String selectedOption = adapter1.getItem(position);
                // checking selected function and sending to diseases information page
                if(selectedOption.equalsIgnoreCase("Coronary heart disease")){
                    Intent i = new Intent(getActivity(),DiseasesTypeInfo.class);
                    // sending selected list name to diseases info class for retrive data based on name
                    i.putExtra("itemname" , selectedOption);
                    startActivity(i);
                }
                // checking selected function and sending to diseases information page
                if(selectedOption.equalsIgnoreCase("Rheumatic heart disease")){
                    Intent i = new Intent(getActivity(),DiseasesTypeInfo.class);
                    // sending selected list name to diseases info class for retrive data based on name
                    i.putExtra("itemname" , selectedOption);
                    startActivity(i);
                }
                // checking selected function and sending to diseases information page
                if(selectedOption.equalsIgnoreCase("congenital heart disease")){
                    Intent i = new Intent(getActivity(),DiseasesTypeInfo.class);
                    // sending selected list name to diseases info class for retrive data based on name
                    i.putExtra("itemname" , selectedOption);
                    startActivity(i);

                }
                // checking selected function and sending to diseases information page
                if(selectedOption.equalsIgnoreCase("peripheral arterial disease")){
                    Intent i = new Intent(getActivity(),DiseasesTypeInfo.class);
                    // sending selected list name to diseases info class for retrive data based on name
                    i.putExtra("itemname" , selectedOption);
                    startActivity(i);
                }
                // checking selected function and sending to diseases information page
                if(selectedOption.equalsIgnoreCase("cerebrovascular disease")){
                    Intent i = new Intent(getActivity(),DiseasesTypeInfo.class);
                    // sending selected list name to diseases info class for retrive data based on name
                    i.putExtra("itemname" , selectedOption);
                    startActivity(i);

                }
                // checking selected function and sending to diseases information page
                if(selectedOption.equalsIgnoreCase("deep vein thrombosis and pulmonary embolism")){
                    Intent i = new Intent(getActivity(),DiseasesTypeInfo.class);
                    // sending selected list name to diseases info class for retrive data based on name
                    i.putExtra("itemname" , selectedOption);
                    startActivity(i);


                }


            }
        });
        getActivity().setTitle("CVD Types");
        return myView;
    }
}
