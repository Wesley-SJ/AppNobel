package com.example.appnobel;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Button btnR1 = (Button) findViewById(R.id.btnR1);
        btnR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent win1 = new Intent(QuizActivity1.this,ErroActivity.class);
                startActivity(win1);
                btnR1.setBackgroundColor(Color.RED);
            }
        });
        Button btnR2 = (Button) findViewById(R.id.btnR2);

        btnR2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent win2 = new Intent(QuizActivity1.this,WinActivity.class);
                startActivity(win2);
                btnR2.setBackgroundColor(Color.GREEN);
            }

        });
        Button btnR3 = (Button) findViewById(R.id.btnR3);
        btnR3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent win3 = new Intent(QuizActivity1.this,ErroActivity.class);
                startActivity(win3);
                btnR3.setBackgroundColor(Color.RED);
            }
        });
        Button btnR4 = (Button) findViewById(R.id.btnR4);
        btnR4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent win4 = new Intent(QuizActivity1.this,ErroActivity.class);
                startActivity(win4);
                btnR4.setBackgroundColor(Color.RED);
            }
        });

    }
}
