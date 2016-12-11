package com.gumadev.e1_inflandovista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.v(this.getClass().getCanonicalName(), "Ha entrado en el OnCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = (Button) findViewById(R.id.buttonUno);

        EscuchaBoton escuchaBoton = new EscuchaBoton(this);
        boton.setOnClickListener(escuchaBoton);
    }
}
