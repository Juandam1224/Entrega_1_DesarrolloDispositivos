package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MostrarDatos extends AppCompatActivity {

    TextView D_nombre,D_apellido,D_edad,D_correo,D_direccion,D_telefono;
    Button finalizar;
    String TAG = "Test";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar_datos);

        D_nombre=(TextView) findViewById(R.id.F_Nombre);
        D_apellido=(TextView) findViewById(R.id.F_Apellido);
        D_edad=(TextView) findViewById(R.id.F_Edad);
        D_correo=(TextView) findViewById(R.id.F_Correo);
        D_direccion=(TextView) findViewById(R.id.F_Direccion);
        D_telefono=(TextView) findViewById(R.id.F_Telefono);
        finalizar=(Button) findViewById(R.id.finalizado);

        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MostrarDatos.this, MainActivity.class);
                startActivity(intent);
            }
        });
        mostrarDato();
    }
    private void  mostrarDato(){
        Bundle datos= this.getIntent().getExtras();
        String name = datos.getString("Nombre");
        String lastname = datos.getString("Apellido");
        String age = datos.getString("Edad");
        String email = datos.getString("Correo");
        String adress = datos.getString("Direccion");
        String phone = datos.getString("Telefono");

        D_nombre.setText(name);
        D_apellido.setText(lastname);
        D_edad.setText(age);
        D_correo.setText(email);
        D_direccion.setText(adress);
        D_telefono.setText(phone);
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
