package com.example.myapplication;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class start extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ImageButton back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(this);

        TextView starter = (TextView) findViewById(R.id.starter);
        starter.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.starter:

                Intent intent = new Intent(start.this, lvl1.class);
                startActivity(intent);
                break;
            case R.id.back:

                Intent intent1 = new Intent(start.this, MainActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
