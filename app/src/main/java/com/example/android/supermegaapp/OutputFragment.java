package com.example.android.supermegaapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class OutputFragment extends Fragment {
    private TextView textView;

    public OutputFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_output, container, false);
       textView=v.findViewById(R.id.textViewActivity2);
        return v;

    }

    public void displayFio(MyObjectNameAge myObjectNameAge) {
Log.d("main_out",myObjectNameAge.name);
        textView.setText(myObjectNameAge.lastName+" "+myObjectNameAge.name+" "+myObjectNameAge.age);
    }


}
