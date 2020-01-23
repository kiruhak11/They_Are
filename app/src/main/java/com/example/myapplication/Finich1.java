package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Finich1 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finich1);

        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(this);

        TextView help = (TextView) findViewById(R.id.help);
        help.setOnClickListener(this);
    }


    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.back:

                Intent intent = new Intent(Finich1.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.help:
                Intent intent1 = new Intent(Finich1.this, help.class);
                startActivity(intent1);
                break;


        }
    }
}
