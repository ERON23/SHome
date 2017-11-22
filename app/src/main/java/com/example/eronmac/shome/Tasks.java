package com.example.eronmac.shome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tasks extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);

        button1 = findViewById(R.id.buttonT1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTaskT1();
            }
        });
        button2 = findViewById(R.id.buttonT2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTaskT2();
            }
        });
        button3 = findViewById(R.id.buttonT3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTaskT3();
            }
        });
        button4 = findViewById(R.id.buttonT4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTaskT4();
            }
        });

    }
    public void openTaskT1(){
        Intent intent1 = new Intent(this, TasksT1.class);
        startActivity(intent1);
    }
    public void openTaskT2(){
        Intent intent1 = new Intent(this, TasksT2.class);
        startActivity(intent1);
    }
    public void openTaskT3(){
        Intent intent1 = new Intent(this, TasksT3.class);
        startActivity(intent1);
    }
    public void openTaskT4(){
        Intent intent1 = new Intent(this, TasksT4.class);
        startActivity(intent1);
    }
}
