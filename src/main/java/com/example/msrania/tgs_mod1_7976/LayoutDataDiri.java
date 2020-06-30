package com.example.msrania.tgs_mod1_7976;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class LayoutDataDiri extends AppCompatActivity {
    EditText nama,alamat,umur,email;
    Button send;
    RadioButton male,female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_data_diri);

        send =(Button) findViewById(R.id.btnsend);
        nama=(EditText) findViewById(R.id.editText_nama);
        alamat=(EditText) findViewById(R.id.editText_alamat);
        umur = (EditText) findViewById(R.id.editText_age);
        email = (EditText) findViewById(R.id.editText_email);
        male = (RadioButton) findViewById(R.id.radioButton_male);
        female =(RadioButton) findViewById(R.id.radioButton_female);

        //hasil.setOnClickListener(new View.OnClickListener()
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                //b.putString("nama",edit_nama.getText().toString());
                b.putString("nama",nama.getText().toString());
                b.putString("alamat",alamat.getText().toString());
                b.putString("umur",umur.getText().toString());
                b.putString("email",email.getText().toString());
                Intent i = new Intent(getApplicationContext(),LayoutHasil.class);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}
