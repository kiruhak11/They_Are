package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(this);

        TextView textView = (TextView) findViewById(R.id.war);
        textView.setOnClickListener(this);

        TextView scd = (TextView) findViewById(R.id.scd);
        scd.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.back:

                Intent intent = new Intent(home.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.scd:
                Intent intent1 = new Intent(home.this, Finich1.class);
                startActivity(intent1);
                break;

            case R.id.textView:
                Intent intent2 = new Intent(home.this, war.class);
                startActivity(intent2);
                break;



        }
    }
}
