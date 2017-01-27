package com.example.adrian.practica280117;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;

/**
 * Created by aperez on 27/01/2017.
 */

public class ListenerProductos implements AdapterView.OnItemClickListener{

    private Context context;

    public ListenerProductos(Context context) {
        this.context = context;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {

    }
}
