package com.purushottam.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView lengthcount;
    CardView frequencycount;
    CardView weightcount;
    CardView tempcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lengthcount=findViewById(R.id.cardView_length);
        frequencycount=findViewById(R.id.cardView_frequency);
        weightcount=findViewById(R.id.cardView_weight);
        tempcount=findViewById(R.id.cardView_temp);

        lengthcount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,lengthActivity.class);
                startActivity(intent);
            }
        });

        frequencycount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,frequencyActivtity.class);
                startActivity(intent);
            }
        });

        weightcount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,weightActivity.class);
                startActivity(intent);
            }
        });

        tempcount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,tempAcitvity.class);
                startActivity(intent);
            }
        });


    }
}