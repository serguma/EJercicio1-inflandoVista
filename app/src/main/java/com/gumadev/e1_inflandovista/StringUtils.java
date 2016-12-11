package com.gumadev.e1_inflandovista;

/**
 * Created by Sergio on 11/12/2016.
 */

public class StringUtils {

    public static String mensajeSalida (String nombre) {
        //Devuelve la longitud del nombre
        String mensaje = null;

        mensaje = "El nombre tiene " +nombre.length() + " letras";

        return mensaje;
    }

    public static String mensajeAlrevesFor (String nombre) {
        //Devuelve el nombre al revés utilizando un for

        String mensaje = null;
        String cadenaReves = "";

        for (int i = nombre.length() -1; i >= 0; i-- ){
            cadenaReves = cadenaReves + nombre.charAt(i);
        }

        mensaje = "Tu nombre al revés es: "+cadenaReves+ "\n Y su longitud es: " + nombre.length();

        return mensaje;
    }


    public static String mensajeAlreves (String nombre) {
        //Devuelve el nombre al revés

        String mensaje = null;

        // reverse() devuelve la cadena al revés utilizando la clase StringBuilder (secuencia de caracteres mutable)
        StringBuilder  stringBuilder = new StringBuilder (nombre);
        mensaje = "Tu nombre al revés es: "+stringBuilder.reverse().toString()+ "\n Y su longitud es: " + nombre.length();

        return mensaje;
    }





}
