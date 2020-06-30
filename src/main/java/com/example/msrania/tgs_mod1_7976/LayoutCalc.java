package com.example.msrania.tgs_mod1_7976;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;

public class LayoutCalc extends AppCompatActivity {
    EditText nilai1,nilai2;
    Button kali,bagi,tambah,kurang;
    Bundle b;
    Double hasil;
    TextView text;
    String nilai_awal,nilai_Kedua;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_calc);
        //hasil =(Button) findViewById(R.id.btnlihat);
        nilai1 =(EditText) findViewById(R.id.editText_nilai1);
        nilai2 =(EditText) findViewById(R.id.editText_nilai2);
        kali =(Button) findViewById(R.id.btnkali);
        bagi =(Button) findViewById(R.id.btnbagi);
        tambah =(Button) findViewById(R.id.btntambah);
        kurang =(Button) findViewById(R.id.btnkurang);
        text =(TextView) findViewById(R.id.txthasil);
        b = new Bundle();

//        b.putString("nilai_awal",nilai1.getText().toString());
//        b.putString("nilai_kedua",nilai2.getText().toString());
//        String nilai_awal = b.getString("nilai_awal");
//        String nilai_Kedua = b.getString("nilai_kedua");



        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.putString("nilai_awal",nilai1.getText().toString());
                b.putString("nilai_kedua",nilai2.getText().toString());
                 nilai_awal = b.getString("nilai_awal");
                 nilai_Kedua = b.getString("nilai_kedua");
                hasil=Double.parseDouble(nilai_awal)*Double.parseDouble(nilai_Kedua);
                text.setText("Hasil: " +hasil);
                Intent i = new Intent(getApplicationContext(),LayoutCalc.class);
                startActivity(i);


            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b.putString("nilai_awal",nilai1.getText().toString());
                b.putString("nilai_kedua",nilai2.getText().toString());
                nilai_awal = b.getString("nilai_awal");
                nilai_Kedua = b.getString("nilai_kedua");
                hasil=Double.parseDouble(nilai_awal)/Double.parseDouble(nilai_Kedua);
                if (Double.parseDouble(nilai_Kedua) == 0)
                {
                    text.setText("tidak bisa melakukan pembagian dengan 0");
                }
                else
                {
                    text.setText("Hasil: " + hasil);
                }
                Intent i = new Intent(getApplicationContext(),LayoutCalc.class);
                startActivity(i);

            }
        });
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b.putString("nilai_awal",nilai1.getText().toString());
                b.putString("nilai_kedua",nilai2.getText().toString());
               nilai_awal = b.getString("nilai_awal");
              nilai_Kedua = b.getString("nilai_kedua");
                hasil=Double.parseDouble(nilai_awal)+Double.parseDouble(nilai_Kedua);
                text.setText("Hasil: " +hasil);
                Intent i = new Intent(getApplicationContext(),LayoutCalc.class);
                startActivity(i);

            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b.putString("nilai_awal",nilai1.getText().toString());
                b.putString("nilai_kedua",nilai2.getText().toString());
               nilai_awal = b.getString("nilai_awal");
               nilai_Kedua = b.getString("nilai_kedua");
                hasil=Double.parseDouble(nilai_awal)-Double.parseDouble(nilai_Kedua);
                text.setText("Hasil: " +hasil);
                Intent i = new Intent(getApplicationContext(),LayoutCalc.class);
                startActivity(i);

            }
        });
    }
}
