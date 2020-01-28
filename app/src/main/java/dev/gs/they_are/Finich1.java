package dev.gs.they_are;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Finich1 extends AppCompatActivity implements View.OnClickListener{




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finich1);

        ImageButton back = (ImageButton) findViewById(R.id.back);
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
