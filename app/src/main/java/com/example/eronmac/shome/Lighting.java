package com.example.eronmac.shome;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Lighting extends AppCompatActivity {

    ToggleButton lightbttn;

    Button addbttn;
    Button selectbttn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lighting);



        lightbttn=(ToggleButton) findViewById(R.id.toggleButton6);
        lightbttn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //Toast message for lightbutton
                Context context = getApplicationContext();
                CharSequence text = "Light Turns ON!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        addbttn=(Button) findViewById(R.id.addbutton);
        addbttn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //Toast message for lightbutton
                Context context = getApplicationContext();
                CharSequence text = "Not implemented yet";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });


        selectbttn=(Button) findViewById(R.id.selectbutton);
        selectbttn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //Toast message for lightbutton
                Context context = getApplicationContext();
                CharSequence text = "Not implemented yet";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

    }
}
