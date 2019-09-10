package com.example.myactivityjorge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(this);

        View btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        Toast toast = Toast.makeText( this, "Toast Simple", Toast.LENGTH_LONG );
        toast.show();
    }
    //Este es el evento del boton 2
    public void boton2 (View view)
    {
        Toast toast = Toast.makeText( this, "Toast Simple", Toast.LENGTH_LONG );
        //Aqui modificamos la propiedad gravity del Toast
        //Recibe 3 parametros enteros, donde el 2do y 3cero son la posicion
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0 ,0);
        toast.show();
    }


}

