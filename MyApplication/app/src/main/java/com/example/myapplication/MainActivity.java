package com.example.myapplication;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    Integer redval = 0;
    Integer greenval = 0;
    Integer blueval = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar sb3 = findViewById(R.id.seekBar3);
        SeekBar sb2 = findViewById(R.id.seekBar2);
        SeekBar sb1 = findViewById(R.id.seekBar);
        final TextView tv = findViewById(R.id.textView);
        final ConstraintLayout cl = findViewById(R.id.Layout1);

        sb3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                redval = progress;
                tv.setText(redval.toString() + " " + greenval.toString() + " " + blueval.toString());
                cl.setBackgroundColor(Color.rgb(redval, greenval, blueval));
                tv.setTextColor(Color.rgb(255 - redval, 255 - greenval, 255 - blueval));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                greenval = progress;
                tv.setText(redval.toString() + " " + greenval.toString() + " " + blueval.toString());
                cl.setBackgroundColor(Color.rgb(redval, greenval, blueval));
                tv.setTextColor(Color.rgb(255 - redval, 255 - greenval, 255 - blueval));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                blueval = progress;
                tv.setText(redval.toString() + " " + greenval.toString() + " " + blueval.toString());
                cl.setBackgroundColor(Color.rgb(redval, greenval, blueval));
                tv.setTextColor(Color.rgb(255 - redval, 255 - greenval, 255 - blueval));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }


}
