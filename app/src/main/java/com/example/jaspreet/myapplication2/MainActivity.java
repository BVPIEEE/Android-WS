package com.example.jaspreet.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
static String first="firstActivityValue";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText=findViewById(R.id.editText);
        Button b=findViewById(R.id.button);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

Intent i=new Intent(MainActivity.this,Main2Activity.class);
i.putExtra("key","value");
getApplicationContext().startActivity(i);

//         startActivity(new Intent(MainActivity.this,Main2Activity.class));

            }
        });

    }
}
