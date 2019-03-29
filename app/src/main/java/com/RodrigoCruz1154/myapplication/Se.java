package com.RodrigoCruz1154.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.RodrigoCruz1154.myapplication.utils.AppConstants;

public class Se extends AppCompatActivity {

    private TextView cont1;         private TextView cont4;
    private TextView cont2;         private TextView cont5;
    private TextView cont3;         private TextView cont6;

    private TextView cont7;         private TextView cont10;
    private TextView cont8;         private TextView cont11;
    private TextView cont9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent mIntent = getIntent();

        cont1 = findViewById(R.id.Contador11);      cont4 = findViewById(R.id.Contador44);
        cont2 = findViewById(R.id.Contador22);      cont5 = findViewById(R.id.Contador55);
        cont3 = findViewById(R.id.Contador33);      cont6 = findViewById(R.id.Contador66);

        cont7 = findViewById(R.id.Contador77);      cont10 = findViewById(R.id.emailRecived);
        cont8 = findViewById(R.id.Contador88);      cont11 = findViewById(R.id.UsernameRecived);
        cont9 = findViewById(R.id.Contador99);


        cont1.setText(mIntent.getStringExtra("caja1"));
        cont2.setText(mIntent.getStringExtra("caja2"));
        cont3.setText(mIntent.getStringExtra("caja3"));
        cont4.setText(mIntent.getStringExtra("caja4"));
        cont5.setText(mIntent.getStringExtra("caja5"));
        cont6.setText(mIntent.getStringExtra("caja6"));
        cont7.setText(mIntent.getStringExtra("caja7"));
        cont8.setText(mIntent.getStringExtra("caja8"));
        cont9.setText(mIntent.getStringExtra("caja9"));

        cont10.setText(mIntent.getStringExtra("caja10"));
        cont11.setText(mIntent.getStringExtra("caja11"));


    }
}
