package com.example.appandro;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //создали связь кнопки с объектом
        final Button b = findViewById(R.id.button);
        final TextView tv = findViewById(R.id.textView);
        final EditText et = findViewById(R.id.editText2);
        final TextView tv3 = findViewById(R.id.textView3);

        b.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                //создаем намерение: обратиться к другому окну
                Intent intentSecond = new Intent(MainActivity.this, SecondActivity.class);

                intentSecond.putExtra("text", et.getText().toString());
                //активауия намерения

                startActivity(intentSecond);
            }
        });

    }
}
