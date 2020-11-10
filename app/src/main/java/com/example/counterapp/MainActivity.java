package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public  class MainActivity extends AppCompatActivity {
    int my_count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btminus,btplus;
        final TextView text,txreset;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btminus=findViewById(R.id.btminus);
        btplus=findViewById(R.id.btplus);
        text=findViewById(R.id.text);
        txreset=findViewById(R.id.txreset);

        btminus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                my_count=my_count-1;
                text.setText(my_count+ "");
            }



        });

        btplus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
              my_count=my_count+1;
                text.setText(my_count+ "");
            }



        });

        txreset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
              my_count=0;
                text.setText(my_count+ "");
            }



        });



    }
}