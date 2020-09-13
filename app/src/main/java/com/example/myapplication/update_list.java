package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class update_list extends AppCompatActivity {

    @Override
    protected  void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update_list);

        ImageButton addProductButton = (ImageButton) findViewById(R.id.addProductButton);
        addProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(v.getContext(), Activity.class);
                // startActivity(intent);
                Intent intent = new Intent(update_list.this, add_product.class);
                startActivity(intent);
            }
        });

        ImageButton deleteProductButton = (ImageButton) findViewById(R.id.deleteProductButton);
        deleteProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(v.getContext(), Activity.class);
                // startActivity(intent);
                Intent intent = new Intent(update_list.this, delete_product.class);
                startActivity(intent);
            }
        });

        ImageButton deleteListButton = (ImageButton) findViewById(R.id.deleteListButton);
        deleteListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(v.getContext(), Activity.class);
                // startActivity(intent);
                Intent intent = new Intent(update_list.this, delete_list.class);
                startActivity(intent);
            }
        });

        ImageButton backToMainButton = (ImageButton) findViewById(R.id.backToMainButton);
        backToMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(v.getContext(), Activity.class);
                // startActivity(intent);
                finish();

            }
        });
    }


}
