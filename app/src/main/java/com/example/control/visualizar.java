package com.example.control;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class visualizar extends AppCompatActivity {
TextView v1,v2,v3,v4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar);
        recibirDatos();
    }
    public void recibirDatos(){
        Bundle extras=getIntent().getExtras();
        String d1=extras.getString("d1");
        String d2=extras.getString("d2");
        String d3=extras.getString("d3");
        String d4=extras.getString("d4");

        v1=(TextView)findViewById(R.id.v1);
        v1.setText("Nombre: " + d1);
        v2 = (TextView) findViewById(R.id.v2);
        v2.setText("Cedula: " + d2);
        v3 = (TextView) findViewById(R.id.v3);
        v3.setText("Fecha de Ingreso: " + d3);
        v4 = (TextView) findViewById(R.id.v4);
        v4.setText("Temperatura: " + d4);


    }

    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
}