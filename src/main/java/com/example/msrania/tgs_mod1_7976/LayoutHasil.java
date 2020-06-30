package com.example.msrania.tgs_mod1_7976;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class LayoutHasil extends AppCompatActivity {
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_hasil);
        text =(TextView) findViewById(R.id.textView);
        Bundle b = getIntent().getExtras();

        String nama = b.getString("nama");
        String alamat= b.getString("alamat");
        String umur= b.getString("umur");
        String email= b.getString("email");
        text.setText("Nama: " +nama+
                "Alamat:" +alamat+
                "Umur:" +umur+
                "Email:" +email+
                "jenis kelamin:  ");

        Intent i = new Intent(getApplicationContext(),LayoutHasil.class);
        startActivity(i);




    }
}
