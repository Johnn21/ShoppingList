package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvv;


    @Override
    protected  void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageButton moneyButton = (ImageButton) findViewById(R.id.insertMoneyButton);
        moneyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(v.getContext(), Activity.class);
               // startActivity(intent);
                 Intent intent = new Intent(MainActivity.this, insert_money.class);
                 startActivity(intent);
            }
        });

        ImageButton productsListButton = (ImageButton) findViewById(R.id.productsListButton);
        productsListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(v.getContext(), Activity.class);
                // startActivity(intent);
                Intent intent = new Intent(MainActivity.this, products_list.class);
                startActivity(intent);
            }
        });

        ImageButton updateListButton = (ImageButton) findViewById(R.id.updateListButton);
        updateListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(v.getContext(), Activity.class);
                // startActivity(intent);
                Intent intent = new Intent(MainActivity.this, update_list.class);
                startActivity(intent);
            }
        });

        ImageButton exitAppButton = (ImageButton) findViewById(R.id.exitAppButton);
        exitAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(v.getContext(), Activity.class);
                // startActivity(intent);
                finish();
                System.exit(0);
            }
        });


       // TextView textView = (TextView) findViewById(R.id.textViewSSID);
       // textView.setText("ceva");





    }


}
