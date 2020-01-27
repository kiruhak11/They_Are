package dev.gs.they_are;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class lvl4 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl4);

        ImageButton back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(this);

        TextView textView = (TextView) findViewById(R.id.nowanich);
        textView.setOnClickListener(this);

        TextView textView2 = (TextView) findViewById(R.id.wanich);
        textView2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.back:
                Intent intent = new Intent(lvl4.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.nowanich:
                Intent intent1 = new Intent(lvl4.this, nowan.class);
                startActivity(intent1);
                break;

            case R.id.wanich:
                Intent intent2 = new Intent(lvl4.this, wan.class);
                startActivity(intent2);
                break;


        }
    }
}
