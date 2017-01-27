package com.example.adrian.practica280117;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

/**
 * Created by aperez on 27/01/2017.
 */

public class ListenerBoton implements View.OnClickListener{

    private Context context;

    public ListenerBoton(Context context) {
        this.context = context;
    }

    public void onClick(View v){
        Intent intent = new Intent(context,ListaProductosActivity.class);
        context.startActivity(intent);
    }
}
