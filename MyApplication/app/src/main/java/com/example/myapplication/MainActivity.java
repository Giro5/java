package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.*;
import android.os.Build;
import android.view.Window;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    private Integer redval = 0;
    private Integer greenval = 0;
    private Integer blueval = 0;

    private Integer hueval = 0;
    private Integer saturationval = 0;
    private Integer valueval = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ConstraintLayout cl = findViewById(R.id.Layout1);

        final TextView tv1 = findViewById(R.id.textView);
        final TextView tv2 = findViewById(R.id.textView2);
        final TextView tv3 = findViewById(R.id.textView3);
        final TextView tv4 = findViewById(R.id.textView4);

        final SeekBar sbred = findViewById(R.id.seekBar3);
        final SeekBar sbgreen = findViewById(R.id.seekBar2);
        final SeekBar sbblue = findViewById(R.id.seekBar);

        final SeekBar sbhue = findViewById(R.id.seekBar6);
        final SeekBar sbsat = findViewById(R.id.seekBar5);
        final SeekBar sbval = findViewById(R.id.seekBar4);

        sbred.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                redval = progress;

                if(fromUser) {
                    int col = Color.rgb(redval, greenval, blueval);
                    int altcol = Color.rgb(255 - redval, 255 - greenval, 255 - blueval);
                    float[] hsv = new float[3];
                    Color.colorToHSV(col, hsv);

                    cl.setBackgroundColor(col);

                    tv1.setText(redval + " " + greenval + " " + blueval);
                    tv1.setTextColor(altcol);

                    hueval = Math.round(hsv[0]);
                    saturationval = Math.round(hsv[1] * 100);
                    valueval = Math.round(hsv[2] * 100);

                    tv2.setText(hueval + " " + saturationval + " " + valueval);
                    tv2.setTextColor(altcol);

                    sbhue.setProgress(hueval);
                    sbsat.setProgress(saturationval);
                    sbval.setProgress(valueval);

                    tv3.setTextColor(altcol);
                    tv4.setTextColor(altcol);
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        sbgreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                greenval = progress;

                if(fromUser) {
                    cl.setBackgroundColor(Color.rgb(redval, greenval, blueval));

                    int col = Color.rgb(redval, greenval, blueval);
                    int altcol = Color.rgb(255 - redval, 255 - greenval, 255 - blueval);
                    float[] hsv = new float[3];
                    Color.colorToHSV(col, hsv);

                    tv1.setText(redval + " " + greenval + " " + blueval);
                    tv1.setTextColor(altcol);

                    hueval = Math.round(hsv[0]);
                    saturationval = Math.round(hsv[1] * 100);
                    valueval = Math.round(hsv[2] * 100);

                    tv2.setText(hueval + " " + saturationval + " " + valueval);
                    tv2.setTextColor(altcol);

                    sbhue.setProgress(hueval);
                    sbsat.setProgress(saturationval);
                    sbval.setProgress(valueval);

                    tv3.setTextColor(altcol);
                    tv4.setTextColor(altcol);
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        sbblue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                blueval = progress;

                if(fromUser) {
                    cl.setBackgroundColor(Color.rgb(redval, greenval, blueval));

                    int col = Color.rgb(redval, greenval, blueval);
                    int altcol = Color.rgb(255 - redval, 255 - greenval, 255 - blueval);
                    float[] hsv = new float[3];
                    Color.colorToHSV(col, hsv);

                    tv1.setText(redval + " " + greenval + " " + blueval);
                    tv1.setTextColor(altcol);

                    hueval = Math.round(hsv[0]);
                    saturationval = Math.round(hsv[1] * 100);
                    valueval = Math.round(hsv[2] * 100);

                    tv2.setText(hueval + " " + saturationval + " " + valueval);
                    tv2.setTextColor(altcol);

                    sbhue.setProgress(hueval);
                    sbsat.setProgress(saturationval);
                    sbval.setProgress(valueval);

                    tv3.setTextColor(altcol);
                    tv4.setTextColor(altcol);
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        sbhue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                hueval = progress;

                if(fromUser) {
                    float[] hsv = {((float) hueval), ((float) saturationval) / 100, ((float) valueval) / 100};
                    int col = Color.HSVToColor(hsv);
                    int altcol = Color.rgb(255 - redval, 255 - greenval, 255 - blueval);

                    cl.setBackgroundColor(col);

                    redval = Color.red(col);
                    greenval = Color.green(col);
                    blueval = Color.blue(col);

                    tv1.setText(redval + " " + greenval + " " + blueval);
                    tv1.setTextColor(altcol);

                    tv2.setText(hueval + " " + saturationval + " " + valueval);
                    tv2.setTextColor(altcol);

                    sbred.setProgress(redval    );
                    sbgreen.setProgress(greenval);
                    sbblue.setProgress(blueval  );

                    tv3.setTextColor(altcol);
                    tv4.setTextColor(altcol);
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (sbhue.getProgress() == 360){
                    sbhue.setProgress(0);
                }
            }
        });

        sbsat.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                saturationval = progress;

                if(fromUser) {
                    float[] hsv = {((float) hueval), ((float) saturationval) / 100, ((float) valueval) / 100};
                    int col = Color.HSVToColor(hsv);
                    int altcol = Color.rgb(255 - redval, 255 - greenval, 255 - blueval);

                    cl.setBackgroundColor(col);

                    redval = Color.red(col);
                    greenval = Color.green(col);
                    blueval = Color.blue(col);

                    tv1.setText(redval + " " + greenval + " " + blueval);
                    tv1.setTextColor(altcol);

                    tv2.setText(hueval + " " + saturationval + " " + valueval);
                    tv2.setTextColor(altcol);

                    sbred.setProgress(redval    );
                    sbgreen.setProgress(greenval);
                    sbblue.setProgress(blueval  );

                    tv3.setTextColor(altcol);
                    tv4.setTextColor(altcol);
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        sbval.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                valueval = progress;

                if(fromUser) {
                    float[] hsv = {((float) hueval), ((float) saturationval) / 100, ((float) valueval) / 100};
                    int col = Color.HSVToColor(hsv);
                    int altcol = Color.rgb(255 - redval, 255 - greenval, 255 - blueval);

                    cl.setBackgroundColor(col);

                    redval = Color.red(col);
                    greenval = Color.green(col);
                    blueval = Color.blue(col);

                    tv1.setText(redval + " " + greenval + " " + blueval);
                    tv1.setTextColor(altcol);

                    tv2.setText(hueval + " " + saturationval + " " + valueval);
                    tv2.setTextColor(altcol);

                    sbred.setProgress(redval    );
                    sbgreen.setProgress(greenval);
                    sbblue.setProgress(blueval  );

                    tv3.setTextColor(altcol);
                    tv4.setTextColor(altcol);
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        GradientDrawable drawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,
             new int[] { Color.RED, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.RED });

        sbhue.setBackground(drawable);
    }


}
