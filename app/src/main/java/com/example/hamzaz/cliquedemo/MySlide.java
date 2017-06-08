package com.example.hamzaz.cliquedemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MySlide extends Fragment {

    String slideText = "Hello";
    public MySlide() {
        // Required empty public constructor
    }

    public void setSlideText(String slideText) {
        this.slideText = slideText;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v  = inflater.inflate(R.layout.fragment_my_slide, container, false);
        ((TextView)v.findViewById(R.id.slideTextTv)).setText(this.slideText+"Hello Screen");
        return v;
    }

}
