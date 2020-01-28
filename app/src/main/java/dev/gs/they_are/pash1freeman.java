package dev.gs.they_are;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class pash1freeman extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pash1freeman);

        ImageButton back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.back:

                Intent intent = new Intent(pash1freeman.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;





        }
    }
}
