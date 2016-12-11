package com.gumadev.e1_inflandovista;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Sergio on 11/12/2016.
 */

public class EscuchaBoton implements View.OnClickListener{

    private Context ct;

    public EscuchaBoton (Context context){
        this.ct = context;
    }

    @Override
    public void onClick(View vista){

        Log.d(getClass().getCanonicalName(), "Ha pulsado el botón");

        Activity activity = (Activity) ct;

        EditText nombreUsuraio = (EditText) activity.findViewById(R.id.revesTV);
        String nombre = nombreUsuraio.getText().toString();
        Log.d(getClass().getCanonicalName(), "Ha introducido el nombre = " + nombre);

        String mensaje = StringUtils.mensajeAlreves(nombre);
        //String mensaje = StringUtils.mensajeAlrevesFor(nombre);

        Log.d(getClass().getCanonicalName(), "El nombre al revés = " + mensaje );

        ViewGroup contenedorResultado =  (ViewGroup) activity.findViewById(R.id.resultado);

        if (contenedorResultado.getChildCount() > 0){
            //La vista ya ha sido inflada

            TextView texto = (TextView) activity.findViewById(R.id.mensaje_salida);
            texto.setText(mensaje);

        }else{
            LayoutInflater layoutInflater = activity.getLayoutInflater();
            View vistaInflada = layoutInflater.inflate(R.layout.mensaje_salida, contenedorResultado);
            TextView texto = (TextView) vistaInflada.findViewById(R.id.mensaje_salida);
            texto.setText(mensaje);
        }

    }

}
