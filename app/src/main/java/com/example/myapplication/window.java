package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class window extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window);

        ImageButton back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(this);

        TextView home = (TextView) findViewById(R.id.home);
        home.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.back:
                Intent intent = new Intent(window.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.home:
                Intent intent1 = new Intent(window.this, home.class);
                startActivity(intent1);
                break;


        }
    }
}
