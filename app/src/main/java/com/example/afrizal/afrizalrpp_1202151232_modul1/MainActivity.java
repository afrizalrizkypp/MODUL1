package com.example.afrizal.afrizalrpp_1202151232_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText EditMakanan;
    private EditText EditPorsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatbus(View view) {
        EditMakanan = (EditText) findViewById(R.id.textMakan);
        EditPorsi = (EditText) findViewById(R.id.textPorsi);
        String laukpauk = EditMakanan.getText().toString();
        String porsi = EditPorsi.getText().toString();
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("resto","eatbus");
        intent.putExtra("menu",laukpauk);
        intent.putExtra("jumlahporsi",porsi);
        intent.putExtra("totalharga","50000");
        startActivity(intent);

    }

    public void abnormal(View view) {
        EditMakanan = (EditText) findViewById(R.id.textMakan);
        EditPorsi = (EditText) findViewById(R.id.textPorsi);
        String laukpauk = EditMakanan.getText().toString();
        String porsi = EditPorsi.getText().toString();
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("resto","abnormal");
        intent.putExtra("menu",laukpauk);
        intent.putExtra("jumlahporsi",porsi);
        intent.putExtra("totalharga","30000");
        startActivity(intent);

    }
}