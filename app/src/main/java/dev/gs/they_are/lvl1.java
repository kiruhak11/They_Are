package dev.gs.they_are;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class lvl1 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl1);

        ImageButton back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(this);

        TextView call = (TextView) findViewById(R.id.call);
        call.setOnClickListener(this);

        TextView sleep = (TextView) findViewById(R.id.sleep);
        sleep.setOnClickListener(this);

        TextView jobs = (TextView) findViewById(R.id.jobs);
        jobs.setOnClickListener(this);

    }
    @Override
    public void onClick(View view)
    {
        switch (view.getId()){

            case R.id.back:
                Intent intent = new Intent(lvl1.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.call:
                Intent intentq = new Intent(lvl1.this, lvl2.class);
                startActivity(intentq);
                break;

            case R.id.sleep:
                Intent sleep = new Intent(lvl1.this, lvl3.class);
                startActivity(sleep);
                break;

            case R.id.jobs:
                Intent jobs = new Intent(lvl1.this, lvl4.class);
                startActivity(jobs);
                break;



        }


    }

}
