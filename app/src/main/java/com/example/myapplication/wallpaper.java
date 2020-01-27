package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class wallpaper extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.wallpaper_activity);

        ImageButton back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(this);

        TextView q1 = (TextView) findViewById(R.id.q1);
        q1.setOnClickListener(this);

        TextView q2 = (TextView) findViewById(R.id.q2);
        q2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.back:

                Intent intent = new Intent(wallpaper.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.q1:
                Intent intent1 = new Intent(wallpaper.this, start.class);
                startActivity(intent1);
                break;

            case R.id.q2:
                Intent intent3 = new Intent(wallpaper.this, lvl1.class);
                startActivity(intent3);


        }




    }
}
