package com.appers.ayvaz.doubledatafragment;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class DataFragOne extends Fragment {


    public DataFragOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        SharedPreferences preferences = this.getActivity().getSharedPreferences("Mydata", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("GOT", "GGGGGGG");
        editor.commit();
        return inflater.inflate(R.layout.fragment_data_frag_one, container, false);
    }




}
