package com.RodrigoCruz1154.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.RodrigoCruz1154.myapplication.utils.AppConstants;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout capa1;         private TextView cont1;         private EditText email;
    private LinearLayout capa2;         private TextView cont2;         private EditText username;
    private LinearLayout capa3;         private TextView cont3;         private Button send;

    private LinearLayout capa4;         private TextView cont4;
    private LinearLayout capa5;         private TextView cont5;
    private LinearLayout capa6;         private TextView cont6;

    private LinearLayout capa7;         private TextView cont7;
    private LinearLayout capa8;         private TextView cont8;
    private LinearLayout capa9;         private TextView cont9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        capa1 = findViewById(R.id.Layout1);         cont1 = findViewById(R.id.Contador1);
        capa2 = findViewById(R.id.Layout2);         cont2 = findViewById(R.id.Contador2);
        capa3 = findViewById(R.id.Layout3);         cont3 = findViewById(R.id.Contador3);

        capa4 = findViewById(R.id.Layout4);         cont4 = findViewById(R.id.Contador4);
        capa5 = findViewById(R.id.Layout5);         cont5 = findViewById(R.id.Contador5);
        capa6 = findViewById(R.id.Layout6);         cont6 = findViewById(R.id.Contador6);

        capa7 = findViewById(R.id.Layout7);         cont7 = findViewById(R.id.Contador7);
        capa8 = findViewById(R.id.Layout8);         cont8 = findViewById(R.id.Contador8);
        capa9 = findViewById(R.id.Layout9);         cont9 = findViewById(R.id.Contador9);

        capa1.setOnClickListener(this);             email = findViewById(R.id.email);
        capa2.setOnClickListener(this);             username = findViewById(R.id.Username);
        capa3.setOnClickListener(this);             send = findViewById(R.id.BtnSend);

        capa4.setOnClickListener(this);
        capa5.setOnClickListener(this);
        capa6.setOnClickListener(this);

        capa7.setOnClickListener(this);
        capa8.setOnClickListener(this);
        capa9.setOnClickListener(this);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent;
                mIntent = new Intent(v.getContext(), Se.class);

                String value1 = cont1.getText().toString();         String value10 = email.getText().toString();
                String value2 = cont2.getText().toString();         String value11 = username.getText().toString();
                String value3 = cont3.getText().toString();

                String value4 = cont4.getText().toString();
                String value5 = cont5.getText().toString();
                String value6 = cont6.getText().toString();

                String value7 = cont7.getText().toString();
                String value8 = cont8.getText().toString();
                String value9 = cont9.getText().toString();


                mIntent.putExtra("caja1",value1);
                mIntent.putExtra("caja2",value2);
                mIntent.putExtra("caja3",value3);

                mIntent.putExtra("caja4",value4);
                mIntent.putExtra("caja5",value5);
                mIntent.putExtra("caja6",value6);

                mIntent.putExtra("caja7",value7);
                mIntent.putExtra("caja8",value8);
                mIntent.putExtra("caja9",value9);

                mIntent.putExtra("caja10",value10);
                mIntent.putExtra("caja11",value11);


                startActivity(mIntent);
            }
        });

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.Layout1:
                int contador = Integer.parseInt(cont1.getText().toString());
                String aux;
                contador++;
                aux = Integer.toString(contador);
                cont1.setText(aux);
                break;
            case R.id.Layout2:
                int contador1 = Integer.parseInt(cont2.getText().toString());
                String aux1;
                contador1++;
                aux1 = Integer.toString(contador1);
                cont2.setText(aux1);
                break;
            case R.id.Layout3:
                int contador2 = Integer.parseInt(cont3.getText().toString());
                String aux2;
                contador2++;
                aux2 = Integer.toString(contador2);
                cont3.setText(aux2);
                break;
            case R.id.Layout4:
                int contador3 = Integer.parseInt(cont4.getText().toString());
                String aux3;
                contador3++;
                aux3 = Integer.toString(contador3);
                cont4.setText(aux3);
                break;
            case R.id.Layout5:
                int contador4 = Integer.parseInt(cont5.getText().toString());
                String aux4;
                contador4++;
                aux4 = Integer.toString(contador4);
                cont5.setText(aux4);
                break;
            case R.id.Layout6:
                int contador5 = Integer.parseInt(cont6.getText().toString());
                String aux5;
                contador5++;
                aux5 = Integer.toString(contador5);
                cont6.setText(aux5);
                break;
            case R.id.Layout7:
                int contador6 = Integer.parseInt(cont7.getText().toString());
                String aux6;
                contador6++;
                aux6 = Integer.toString(contador6);
                cont7.setText(aux6);
                break;
            case R.id.Layout8:
                int contador7 = Integer.parseInt(cont8.getText().toString());
                String aux7;
                contador7++;
                aux7 = Integer.toString(contador7);
                cont8.setText(aux7);
                break;
            case R.id.Layout9:
                int contador8 = Integer.parseInt(cont9.getText().toString());
                String aux8;
                contador8++;
                aux8 = Integer.toString(contador8);
                cont9.setText(aux8);
                break;
        }

    }
}
