package com.example.tpeea.se0909;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Slider.SliderChangeListener{

    private Slider monSlider;
    private float value;
    private TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        monSlider= findViewById(R.id.monSlider);
        mTextView=findViewById(R.id.textview);
        monSlider.setListener(this);
    }


    @Override
    public void onChange(float value) {
        mTextView.setText(String.valueOf(value));
    }
}


