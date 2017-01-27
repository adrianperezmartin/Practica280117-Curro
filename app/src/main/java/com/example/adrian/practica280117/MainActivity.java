package com.example.adrian.practica280117;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botonProductos = (Button) findViewById(R.id.botonProductos);
        ListenerBoton listenerBoton = new ListenerBoton(this);
        botonProductos.setOnClickListener(listenerBoton);

    }


}
