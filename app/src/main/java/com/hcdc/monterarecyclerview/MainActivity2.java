package com.hcdc.monterarecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.view.View.*;

public class MainActivity2 extends AppCompatActivity {

    TextView pnameHolder;
    TextView courseHolder;
    ImageView imageholder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        pnameHolder = findViewById(R.id.textView3);
        courseHolder = findViewById(R.id.textView4);
        imageholder = findViewById(R.id.imageView2);
        Intent intent = getIntent();
        pnameHolder.setText(intent.getStringExtra("name"));
        courseHolder.setText(intent.getStringExtra("courses"));
        imageholder.setImageResource(intent.getIntExtra("image", 0));
    }
}