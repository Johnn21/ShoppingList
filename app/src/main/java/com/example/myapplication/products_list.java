package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class products_list extends AppCompatActivity {

    @Override
    protected  void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.products_list);

        Button productListButtonBack = (Button) findViewById(R.id.productListButtonBack);
        productListButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(v.getContext(), Activity.class);
                // startActivity(intent);
                finish();
            }
        });
    }


}
