package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Operacoes extends AppCompatActivity {
    private Button voltar;
    private Button operar;
    private RadioButton som;
    private RadioButton subtracao;
    private RadioButton multiplicacao;
    private RadioButton divisao;
    private EditText val1;
    private EditText val2;
    private TextView resp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operacoes);

        voltar = findViewById(R.id.voltar2);
        operar = findViewById(R.id.operar);
        val1 = findViewById(R.id.val1);
        val2 = findViewById(R.id.val2);
        resp = findViewById(R.id.resp);
        som=findViewById(R.id.somar);
        subtracao=findViewById(R.id.subtracao);
        multiplicacao=findViewById(R.id.multiplicacao);
        divisao=findViewById(R.id.divisao);


        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent troca = new Intent(Operacoes.this, MainActivity.class);
                startActivity(troca);
            }
        });

      operar.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View view) {
				double va = Double.valueOf(val1.getText().toString());
				double vb = Double.valueOf(val2.getText().toString());

                if(som.isChecked()){
					double soma = va + vb;
                    resp.setText("Resultado: "+soma);
                }

				else if (subtracao.isChecked()){
					double subtracao = va - vb;
                    resp.setText("Resultado: "+subtracao);
                }

                else if (multiplicacao.isChecked()){
					double multiplicacao = va*vb;
					resp.setText("Resultado: "+multiplicacao);
                }

                else if (divisao.isChecked()){
                    double divisao = va/vb;
                    resp.setText("Resultado: "+divisao);
                }
				else{
					resp.setText("Escolhe a operacao");
				}
			}
		});
	}
}