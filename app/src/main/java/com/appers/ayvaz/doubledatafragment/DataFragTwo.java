package com.appers.ayvaz.doubledatafragment;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DataFragTwo extends Fragment {
TextView textView;

    public DataFragTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("Mydata", Context.MODE_PRIVATE);
        String s = sharedPreferences.getString("GOT","DEF");
        Toast.makeText(this.getActivity().getApplicationContext(), s, Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_data_frag_two, container, false);
    }


}
