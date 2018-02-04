package com.example.afrizal.afrizalrpp_1202151232_modul1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private TextView resto;
    private TextView menu;
    private TextView jumlahporsi;
    private TextView totalharga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        resto = (TextView) findViewById(R.id.resto);
        menu = (TextView) findViewById(R.id.menu);
        jumlahporsi = (TextView) findViewById(R.id.jumlahporsi);
        totalharga = (TextView) findViewById(R.id.totalharga);
        Intent intent = getIntent();
        String varresto= intent.getStringExtra("resto");
        String varmenu= intent.getStringExtra("menu");
        String varjumlahporsi= intent.getStringExtra("jumlahporsi");
        String vartotalharga= intent.getStringExtra("totalharga");
        int jumlahharga = Integer.valueOf(vartotalharga)*Integer.valueOf(varjumlahporsi);

        resto.setText(varresto);
        menu.setText(varmenu);
        jumlahporsi.setText(varjumlahporsi);
        totalharga.setText(String.valueOf(jumlahharga));



        if(jumlahharga > 65000){
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Jangan makan disini,Asli, daripada ntar ngutang deh...", Toast.LENGTH_LONG);
            toast.show();
        }else{
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Makan disini aeeee",Toast.LENGTH_LONG);
            toast.show();

        }

    }
}
