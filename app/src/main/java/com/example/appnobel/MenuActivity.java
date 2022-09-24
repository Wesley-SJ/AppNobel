package com.example.appnobel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    ImageButton button_location;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



        Button btnComecar = (Button) findViewById(R.id.btnComecar);
        btnComecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quiz = new Intent(MenuActivity.this,QuizActivity1.class);
                startActivity(quiz);
            }
        });
        Button btnInstru = (Button) findViewById(R.id.btnInstru);
        btnInstru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent instru = new Intent(MenuActivity.this,InstActivity.class);
                startActivity(instru);
            }
            /*
        });
        Button btnEstats = (Button) findViewById(R.id.btnEstats);
        btnEstats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent estats = new Intent(MenuActivity.this,StatsActivity.class);
                startActivity(estats);
            }
        });
            */
        });


    }
}
