package com.example.eronmac.shome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {
    //create button here
    Button thermostatbtn;
    Button monitor;
    Button Lighttbn;
    Button Tasktbn;
    Button Setttingsbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        // test line

        //Link button to layout button
        thermostatbtn=(Button) findViewById(R.id.Thermostatbutton);
        monitor=(Button) findViewById(R.id.Monitorbutton);
        Lighttbn=(Button) findViewById(R.id.Lightingbutton);
        Tasktbn=(Button) findViewById(R.id.Taskbutton);
        Setttingsbtn=(Button) findViewById(R.id.Settingsbutton);


        //thermostat
        //Onclick listener in which it will take the button to another screen
        thermostatbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //only change Thermostatscreen
                Intent i=new Intent (HomeScreen.this,ThermostatScreen.class);
                startActivity(i);
            }
        });

        //monitor
        monitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x=new Intent(HomeScreen.this,Monitor.class);
                startActivity(x);

            }
        });

        //Lighting
        Lighttbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x=new Intent(HomeScreen.this,Lighting.class);
                startActivity(x);
            }
        });

        //task
        Tasktbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x=new Intent(HomeScreen.this,Tasks.class);
                startActivity(x);
            }
        });

        //Settings
        Setttingsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x=new Intent(HomeScreen.this,Settings.class);
                startActivity(x);
            }
        });



    }


}
