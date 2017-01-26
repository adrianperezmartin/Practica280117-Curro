package com.example.adrian.practica280117;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Adrian on 25/01/2017.
 */

public class ListaProductosActivity extends Activity {

    static final Integer[] LISTA_PRODUCTOS = {
            R.drawable.abrazadera,
            R.drawable.abrazaderacremallera,
            R.drawable.bombillahalogena,
            R.drawable.bombillaled,
            R.drawable.bombillahalogena,
            R.drawable.brida,
            R.drawable.cable,
            R.drawable.cajaestanca,
            R.drawable.canaleta,
            R.drawable.clemas,
            R.drawable.diferencial,
            R.drawable.enchufe,
            R.drawable.enrollacables,
            R.drawable.halogeno,
            R.drawable.halogenoled,
            R.drawable.interruptor,
            R.drawable.programador,
            R.drawable.prolongador,
            R.drawable.regleta,
            R.drawable.terminales,
            R.drawable.termostatoanalogico,
            R.drawable.termostatodigital,
            R.drawable.transformador,
            R.drawable.tuboflexible,
            R.drawable.tuborigido
    };

    ListView listViewProductos;

    @Override

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_productos);

        Resources resources=this.getResources();
        String[] nombreProductos = resources.getStringArray(R.array.arrayProductos);

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,R.layout.lista_productos,nombreProductos);

        listViewProductos = (ListView)findViewById(R.id.listaProductos);
        listViewProductos.setAdapter(aa);

        //
        listViewProductos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {

            }
        });
        ;


    }



}
