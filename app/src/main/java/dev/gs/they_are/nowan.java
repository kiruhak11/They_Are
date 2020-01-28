package dev.gs.they_are;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class nowan extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowan);

        ImageButton back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(this);

        TextView yes = (TextView) findViewById(R.id.yes);
        yes.setOnClickListener(this);

        TextView not = (TextView) findViewById(R.id.not);
        not.setOnClickListener(this);

    }
    @Override
    public void onClick(View view)
    {
        switch (view.getId()){

            case R.id.back:
                Intent intent = new Intent(nowan.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;

            case R.id.yes:
                Intent intent1 = new Intent(nowan.this, yes.class);
                startActivity(intent1);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;

            case R.id.not:
                Intent intent11 = new Intent(nowan.this, not.class);
                startActivity(intent11);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
        }


    }
}
