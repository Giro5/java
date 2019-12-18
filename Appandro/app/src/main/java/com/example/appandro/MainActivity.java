package com.example.appandro;



import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.KeyEvent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.database.sqlite.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private static final int CAMERA_REQUEST = 0;
    private ImageView iw;
    private ConstraintLayout cl;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //создали связь кнопки с объектом
        final Button b = findViewById(R.id.button);
        et = findViewById(R.id.editText2);
        final TextView tv3 = findViewById(R.id.textView3);
        final Button b36 = findViewById(R.id.button36);
        iw = findViewById(R.id.imageView);
        cl = findViewById(R.id.Layout1);

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

        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
                //intent.setAction(Intent.ACTION_CAMERA_BUTTON);
                //intent.putExtra(Intent.EXTRA_KEY_EVENT, new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_CAMERA));
                //sendOrderedBroadcast(intent, null);
            }
        });

        SQLiteDatabase db = openOrCreateDatabase("app.db", MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS users (name TEXT, age INTEGER);");
        //db.execSQL("insert into users values('oleg', 34);");
        Cursor query = db.rawQuery("select * from users;", null);
        if (query.moveToFirst()){
            et.setText(query.getString(0) + " " + query.getInt(1));
        }
        //et.setText(db.getPath());
    }

    String mCurrentPhotoPath;
    private File createImg() throws IOException{
        String timeStamp = new SimpleDateFormat("yyyyMdd_HHmmss").format(new Date());
        String imageFileName = "JPEG_" + timeStamp+"_";
        File storageDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        File image = File.createTempFile(imageFileName,".jpg",storageDir);
        mCurrentPhotoPath = "file:"+image.getAbsolutePath();
        return image;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CAMERA_REQUEST && resultCode == RESULT_OK){

            Bitmap pic = (Bitmap) data.getExtras().get("data");
            //et.setText(pic.getWidth() + " " + pic.getHeight());
//            et.setText();
            //pic = Bitmap.createScaledBitmap(pic, 3000, 4000, true);
//            iw.setMinimumHeight(4000);
//            iw.setMinimumWidth(3000);
//            et.setText(pic.getWidth() + " " + pic.getHeight());
//            Bitmap pic = Bitmap.createScaledBitmap(oldpic, 3000, 5400, false);
//            int picw = pic.getWidth(), pich = pic.getHeight();
//            et.setText(picw + " " + pich);
//            for (int i = 0; i < picw; i++){
//                for (int j = 0; j < pich; j++){
//                    float[] curcol = new float[3];
//                    Color.colorToHSV(pic.getPixel(i, j), curcol);
//                    curcol[1] = 0;
//                    pic.setPixel(i, j, Color.HSVToColor(curcol));
//                }
//            }
            //Drawable dr = new BitmapDrawable(pic);
//            cl.setBackground(dr);

            iw.setImageBitmap(pic);
        }
    }
}
