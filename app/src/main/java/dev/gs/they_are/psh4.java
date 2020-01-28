package dev.gs.they_are;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class psh4 extends AppCompatActivity implements View.OnClickListener{




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psh4);

        ImageButton back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(this);

        TextView rubillex = (TextView) findViewById(R.id.rubillex);
        rubillex.setOnClickListener(this);



    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.back:

                Intent intent = new Intent(psh4.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;

            case R.id.rubillex:


                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/rubillex"));
                startActivity(browserIntent);





        }
    }
}
