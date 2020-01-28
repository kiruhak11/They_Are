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

        //Находим объекты по айдишникам(wall_ЧИСЛО)___первая строка
        //Говорим что этот объект кликабелен____вторая строка

        //ImageView ИМЯ В КОДЕ КОТОРОЕ ТЫ БУДЕШЬ ИСПОЛЬЗОВАТЬ САМ = (ImageView) findViewById(R.id.АЙДИШНИК ИЗ РАЗМЕТКИ КОТОРЫЙ ТЫ САМ ПРИДУМАЛ);, где ImageView- это вид объекта также из разметки
        //ИМЯ В КОДЕ.setOnClickListener(this);
//
//        ImageView wall_1 = (ImageView) findViewById(R.id.wall_1);
//        wall_1.setOnClickListener(this);
//
//        ImageView wall_2 = (ImageView) findViewById(R.id.wall_2);
//        wall_2.setOnClickListener(this);
//
//        ImageView wall_3 = (ImageView) findViewById(R.id.wall_3);
//        wall_3.setOnClickListener(this);
//
//        ImageView wall_4 = (ImageView) findViewById(R.id.wall_4);
//        wall_4.setOnClickListener(this);
//

        ImageButton start = (ImageButton) findViewById(R.id.start);
        start.setOnClickListener(this);

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setOnClickListener(this);

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(this);

        TextView text1 = (TextView) findViewById(R.id.text1);
        text1.setOnClickListener(this);


    }


    //функция которая вызывается при нажатии на что-то( ДЛЯ ТОГО ЧТОБЫ МОЖНО БЫЛО НАЖИМАТЬ)
    @Override
    public void onClick(View view)
    {

        //это для того чтобы переходить между окнами(Активити)
        //если тебе ничего не надо передавать между окнами, то скипай весь этот код и смотри следующий коментарий





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





        //для пеерхода используй вот этот код:
        //  Intent intent = new Intent(MainActivity.this, wallpaper.class);
        // ПОЯСНЕНИЕ!!!

        // Intent intent = new Intent(имя ДАННОГО ФАЙЛА.this, "ИМЯ .java файла, в который ты идёшь".class);
        //startActivity(intent); - это так и копируешь

        //ВСЁ ЭТО В ФУНКЦИИ ВЫШЕ( с 49 строки до 91)

    }



}
