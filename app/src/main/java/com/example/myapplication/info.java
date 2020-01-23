package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class info extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(this);

        TextView psh2 = (TextView) findViewById(R.id.psh2);
        psh2.setOnClickListener(this);

        TextView psh3 = (TextView) findViewById(R.id.psh3);
        psh3.setOnClickListener(this);

        TextView psh4 = (TextView) findViewById(R.id.psh4);
        psh3.setOnClickListener(this);

        TextView psh5 = (TextView) findViewById(R.id.psh5);
        psh3.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.back:

                Intent intent = new Intent(info.this, MainActivity.class);
                startActivity(intent);
                break;


            case R.id.psh2:
                Intent intent1 = new Intent(info.this, psh2.class);
                startActivity(intent1);
                break;

            case R.id.psh3:
                Intent intent2 = new Intent(info.this, psh3.class);
                startActivity(intent2);
                break;

            case R.id.psh4:
                Intent intent3 = new Intent(info.this, psh4.class);
                startActivity(intent3);
                break;

            case R.id.psh5:
                Intent intent4 = new Intent(info.this, psh5.class);
                startActivity(intent4);
                break;
        }
    }
}
