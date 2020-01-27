package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class lvl2 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl2);

        TextView lala = (TextView) findViewById(R.id.lvl1q);
        lala.setOnClickListener(this);

        ImageButton back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        switch (view.getId()){

            case R.id.lvl1q:
                Intent lala = new Intent(lvl2.this, lvl1.class);
                startActivity(lala);
                break;

            case R.id.back:
                Intent back = new Intent(lvl2.this, MainActivity.class);
                startActivity(back);
                break;

        }


    }

}
