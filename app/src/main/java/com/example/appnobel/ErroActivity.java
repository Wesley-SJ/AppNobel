package com.example.appnobel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ErroActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);

        Button btnRecomecar = (Button) findViewById(R.id.btnRecomecar);
        btnRecomecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltar = new Intent(ErroActivity.this, MenuActivity.class);
                startActivity(voltar);
            }
        });
    }
}
