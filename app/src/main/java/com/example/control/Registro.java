package com.example.control;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;

public class Registro extends AppCompatActivity {

    private EditText nombre;
    private EditText cedula;
    private EditText f_ingreso;
    private EditText temperatura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombre=(EditText)findViewById(R.id.nombre);
        cedula=(EditText)findViewById(R.id.cedula);
        f_ingreso=(EditText)findViewById(R.id.f_ingreso);
        temperatura=(EditText)findViewById(R.id.temperatura);
    }

    public void onClick(View view) {

        Intent miIntent=new Intent(Registro.this,visualizar.class);
        miIntent.putExtra("d1", nombre.getText().toString());
        miIntent.putExtra("d2", cedula.getText().toString());
        miIntent.putExtra("d3", f_ingreso.getText().toString());
        miIntent.putExtra("d4", temperatura.getText().toString());

        startActivity(miIntent);
    }
}
