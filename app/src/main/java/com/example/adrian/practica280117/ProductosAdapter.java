package com.example.adrian.practica280117;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by aperez on 27/01/2017.
 */

public class ProductosAdapter extends BaseAdapter{

    private Context context;

    private String[] nombreElementos;

    private Integer[] imagenesProductos;

    public ProductosAdapter(Context context, String[] nombreElementos, Integer[] imagenesProductos) {
        this.context = context;
        this.nombreElementos =  nombreElementos;
        this.imagenesProductos = imagenesProductos;
    }


    @Override
    public int getCount() {
        return nombreElementos.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int pos, View vista, ViewGroup parent) {

        View filaInflada = null;
        Activity activity = (Activity) context;
        LayoutInflater layoutInflater = activity.getLayoutInflater();

        if(vista==null){
            filaInflada = layoutInflater.inflate(R.layout.elemento,parent,false);
        }
        else
        {
            filaInflada = vista;
        }

        ImageView imagenProducto = (ImageView) filaInflada.findViewById(R.id.imagenProducto);
        imagenProducto.setImageResource(imagenesProductos[pos]);
        TextView textoProducto = (TextView) filaInflada.findViewById(R.id.textoProducto);
        textoProducto.setText(nombreElementos[pos].toString());
        return filaInflada;
    }
}
