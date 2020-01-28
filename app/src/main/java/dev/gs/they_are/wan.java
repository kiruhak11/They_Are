package dev.gs.they_are;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class wan extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wan);

        ImageButton back = (ImageButton) findViewById(R.id.back);
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
                Intent intent = new Intent(wan.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;

            case R.id.window:
                Intent intent1 = new Intent(wan.this, window.class);
                startActivity(intent1);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;

            case R.id.call:
                Intent intent11 = new Intent(wan.this, call.class);
                startActivity(intent11);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
        }


    }
}
