package dev.gs.they_are;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class war extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_war);

        ImageButton back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(this);

        TextView og = (TextView) findViewById(R.id.og);
        og.setOnClickListener(this);

        TextView hl = (TextView) findViewById(R.id.hl);
        hl.setOnClickListener(this);

    }
    @Override
    public void onClick(View view)
    {
        switch (view.getId()){

            case R.id.back:
                Intent intent = new Intent(war.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;

            case R.id.og:
                Intent intent1 = new Intent(war.this, og.class);
                startActivity(intent1);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;

            case R.id.hl:
                Intent intent11 = new Intent(war.this, hl.class);
                startActivity(intent11);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
        }


    }
}


