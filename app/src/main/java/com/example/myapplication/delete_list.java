package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class delete_list extends AppCompatActivity {

    @Override
    protected  void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm_delete_list);

        Button deleteListNOButton = (Button) findViewById(R.id.deleteListNOButton);
        deleteListNOButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(v.getContext(), Activity.class);
                // startActivity(intent);
                finish();
            }
        });
    }


}
