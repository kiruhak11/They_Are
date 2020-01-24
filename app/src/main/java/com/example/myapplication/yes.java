package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class yes extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yes);

        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(this);

        TextView window = (TextView) findViewById(R.id.window);
        window.setOnClickListener(this);

        TextView call = (TextView) findViewById(R.id.call);
        call.setOnClickListener(this);

    }
    @Override
    public void onClick(View view)
    {
        switch (view.getId()){

            case R.id.back:
                Intent intent = new Intent(yes.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.window:
                Intent intent1 = new Intent(yes.this, window.class);
                startActivity(intent1);
                break;

            case R.id.call:
                Intent intent11 = new Intent(yes.this, not.class);
                startActivity(intent11);
                break;
        }


    }
}



