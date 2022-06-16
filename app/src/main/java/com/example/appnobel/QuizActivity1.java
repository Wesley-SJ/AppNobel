package com.example.appnobel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Button btnResposta1 = (Button) findViewById(R.id.btnResposta1);
        btnResposta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent win1 = new Intent(QuizActivity1.this,WinActivity.class);
                startActivity(win1);
            }
        });
        Button btnResposta2 = (Button) findViewById(R.id.btnResposta2);
        btnResposta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent win2 = new Intent(QuizActivity1.this,WinActivity.class);
                startActivity(win2);
            }
        });
        Button btnResposta3 = (Button) findViewById(R.id.btnResposta3);
        btnResposta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent win3 = new Intent(QuizActivity1.this,WinActivity.class);
                startActivity(win3);
            }
        });
        Button btnResposta4 = (Button) findViewById(R.id.btnResposta4);
        btnResposta4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent win4 = new Intent(QuizActivity1.this,WinActivity.class);
                startActivity(win4);
            }
        });

    }
}
