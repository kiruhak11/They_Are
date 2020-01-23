package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class psh5 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psh5);
        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(this);

        Button back1 = (Button) findViewById(R.id.back1);
        back1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.back:

                Intent intent = new Intent(psh5.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.back1:

                Intent intent1 = new Intent(psh5.this, info.class);
                startActivity(intent1);
                break;





        }
    }
}
