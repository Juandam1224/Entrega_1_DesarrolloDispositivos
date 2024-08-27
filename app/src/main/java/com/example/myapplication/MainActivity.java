package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nombre,apellido,edad,correo,direccion,telefono;
    Button enviar,eliminar;
    String TAG = "Test";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=(EditText) findViewById(R.id.Nombre);
        apellido=(EditText) findViewById(R.id.Apellido);
        edad=(EditText) findViewById(R.id.Edad);
        correo=(EditText) findViewById(R.id.Correo);
        direccion=(EditText) findViewById(R.id.Direccion);
        telefono=(EditText) findViewById(R.id.Telefono);
        enviar=(Button) findViewById(R.id.Enviar);
        eliminar=(Button) findViewById(R.id.Eliminar);


        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String name = nombre.getText().toString();
                String lastname = apellido.getText().toString();
                String age = edad.getText().toString();
                String email = correo.getText().toString();
                String adress = direccion.getText().toString();
                String phone = telefono.getText().toString();

                Intent i = new Intent(MainActivity.this, MostrarDatos.class);
                i.putExtra("Nombre", name);
                i.putExtra("Apellido", lastname);
                i.putExtra("Edad", age);
                i.putExtra("Correo", email);
                i.putExtra("Direccion", adress);
                i.putExtra("Telefono", phone);

                startActivity(i);

            }
        });
        eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre.setText("");
                apellido.setText("");
                edad.setText("");
                correo.setText("");
                direccion.setText("");
                telefono.setText("");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Estoy en OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"Estoy en OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Estoy en OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Estoy en OnStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"Estoy en OnRestar");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Estoy en OnDestroy");
    }
}
