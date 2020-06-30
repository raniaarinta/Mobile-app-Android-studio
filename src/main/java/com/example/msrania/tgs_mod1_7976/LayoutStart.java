package com.example.msrania.tgs_mod1_7976;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LayoutStart extends AppCompatActivity {
  Button calc,data_diri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_start);

        //isi =(Button) findViewById(R.id.btnisi);
        calc=(Button) findViewById(R.id.btncalc);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LayoutCalc.class);
                startActivity(intent);

            }
        });

        data_diri=(Button) findViewById(R.id.btndata);
        data_diri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LayoutDataDiri.class);
                startActivity(intent);
            }
        });

    }
}
