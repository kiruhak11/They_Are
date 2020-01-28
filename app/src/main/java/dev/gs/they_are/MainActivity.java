package dev.gs.they_are;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

//__________________________________________________implements View.OnClickListener == подключение отслеживания нажатия в коде
public class MainActivity extends AppCompatActivity implements View.OnClickListener{








    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton start = (ImageButton) findViewById(R.id.start);
        start.setOnClickListener(this);

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setOnClickListener(this);

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(this);

        TextView text1 = (TextView) findViewById(R.id.text1);
        text1.setOnClickListener(this);


    }


    @Override
    public void onClick(View view)
    {

        switch (view.getId())
        {
            case R.id.start:
                Intent intent = new Intent(MainActivity.this, wallpaper.class);
                startActivity(intent);
                break;
            case R.id.textView2:
            Intent info = new Intent(MainActivity.this, info.class);
            startActivity(info);
            break;

            case R.id.textView3:
                Intent help = new Intent(MainActivity.this, help.class);
                startActivity(help);
                break;

            case R.id.text1:
                Intent text1 = new Intent(MainActivity.this, pash1freeman.class);
                startActivity(text1);
                break;
        }

    }



}
