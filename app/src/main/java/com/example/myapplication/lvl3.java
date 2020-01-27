package com.example.myapplication;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class lvl3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl3);

        ImageButton back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(this);

        TextView window = (TextView) findViewById(R.id.window);
        window.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.back:
                Intent intent = new Intent(lvl3.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.window:
                Intent intent1 = new Intent(lvl3.this, window.class);
                startActivity(intent1);
                break;


        }
    }
}
