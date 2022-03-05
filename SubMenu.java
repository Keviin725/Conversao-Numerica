package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SubMenu extends AppCompatActivity {

    private Button voltar;
    private TextView resultado;
    private RadioButton decimal;
    private RadioButton romana;
    private EditText valor_inserido;
    private Button converter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu);

        resultado = findViewById(R.id.resultado);
        decimal = findViewById(R.id.decimal);
        romana = findViewById(R.id.romana);
        valor_inserido = findViewById(R.id.editText);
        converter =findViewById(R.id.converter);
        voltar = findViewById(R.id.voltar);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent troca = new Intent(SubMenu.this, MainActivity.class);
                startActivity(troca);
            }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                converter.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String t2 = String.valueOf(valor_inserido.getText().toString());
                        if (decimal.isChecked()){
                            if (t2.equals("I")) {
                                resultado.setText("Resultado: "+"1");
                            } else if (t2.equals("V")) {

                                resultado.setText("Resultado: "+"5");
                            } else if (t2.equals("X")) {

                                resultado.setText("Resultado: " + "10");
                            } else if (t2.equals("L")) {

                                resultado.setText("Resultado: "+"50");
                            } else if (t2.equals("C")) {

                                resultado.setText("Resultado: "+"100");
                            } else if (t2.equals("D")) {

                                resultado.setText("Resultado: "+"500");
                            } else if (t2.equals("M")) {

                                resultado.setText("Resultado: "+"1000");
                            } else {
                                resultado.setText("Conversao Impossivel");
                            }
                        }
                    }
                });


            }
        });
        romana.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                converter.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double t1 = Double.valueOf(valor_inserido.getText().toString());
                        if (romana.isChecked()){
                            if (t1 == 1) {
                                resultado.setText("Resultado: "+"I");
                            } else if (t1 == 5) {

                                resultado.setText("Resultado: "+"V");
                            } else if (t1 == 10) {

                                resultado.setText("Resultado: "+"X");
                            } else if (t1 == 50) {

                                resultado.setText("Resultado: "+"L");
                            } else if (t1 == 100) {

                                resultado.setText("Resultado: "+"C");
                            } else if (t1 == 500) {

                                resultado.setText("Resultado: "+"D");
                            } else if (t1 == 1000) {

                                resultado.setText("Resultado: "+"M");
                            } else {
                                resultado.setText("Nao e possivel Converter");
                            }
                        }
                    }
                });



            }
        });


    }
}