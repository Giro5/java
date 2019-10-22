package com.example.appandro;

import android.app.Application;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button b = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);

        TextView tv = findViewById(R.id.textView2);
        Intent intentAccept = getIntent();
        tv.setText(intentAccept.getStringExtra("text"));

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //создаем намерение: обратиться к другому окну
                Intent intentMain = new Intent(SecondActivity.this, MainActivity.class);
                //активауия намерения
                startActivity(intentMain);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
