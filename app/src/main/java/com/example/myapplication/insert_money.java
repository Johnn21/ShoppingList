package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class insert_money extends AppCompatActivity {



    TextView tvv;

    Button b;
    EditText et;
    DatabaseHelper moneyDb;


    @Override
    protected  void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insert_money);

        moneyDb = new DatabaseHelper(this);


        Button insertMoneyButtonBack = (Button) findViewById(R.id.insertMoneyButtonBack);
        insertMoneyButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(v.getContext(), Activity.class);
                // startActivity(intent);
               finish();
            }
        });

        b = (Button) findViewById(R.id.confirmInsertMoneyButton);
        et = (EditText) findViewById(R.id.insertMoneyField);

       b.setOnClickListener(new View.OnClickListener() {

         @Override
         public void onClick(View v){
             setContentView(R.layout.activity_main);
             String value= et.getText().toString();
             int finalValue=Integer.parseInt(value);

         }
       });





    }


}
