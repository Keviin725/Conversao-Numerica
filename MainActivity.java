package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button conversao;
    private Button operacoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conversao = findViewById(R.id.conversao);
        operacoes = findViewById(R.id.operacoes);

        conversao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent troca = new Intent(MainActivity.this, SubMenu.class);
                startActivity(troca);
            }
        });
        operacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent troca = new Intent(MainActivity.this, Operacoes.class);
                startActivity(troca);
            }
        });
    }
}