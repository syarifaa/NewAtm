package com.example.syarifaa.newatm_luthfi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Penyetoran extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnok, btndel;
    EditText editsetor, editsaldo;
    String setor = "";
    int temp;
    int tab = 100000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyetoran);

        setContentView(R.layout.activity_penyetoran);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btndel = (Button) findViewById(R.id.btndel);
        btnok = (Button) findViewById(R.id.btnok);
        editsetor = (EditText) findViewById(R.id.editsetor);
        editsaldo = (EditText) findViewById(R.id.editsaldo);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor += "0";
                editsetor.setText(setor);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor += "1";
                editsetor.setText(setor);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor += "2";
                editsetor.setText(setor);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor += "3";
                editsetor.setText(setor);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor += "4";
                editsetor.setText(setor);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor += "5";
                editsetor.setText(setor);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor += "6";
                editsetor.setText(setor);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor += "7";
                editsetor.setText(setor);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor += "8";
                editsetor.setText(setor);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor += "9";
                editsetor.setText(setor);
            }
        });
        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor = "";
                editsetor.setText(setor);
            }
        });
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean valid;
                if (editsetor.equals("")) {
                    editsetor.setError("Masukkan Jumlah Transfer dengan Benar");
                    valid = (false);
                } else {
                    int e = Integer.parseInt(setor);
                    if (e > tab) {
                        editsetor.setError("Saldo Anda tidak mencukupi");
                        valid = (false);
                    } else {
                        isi(e);
                    }
                }
            }
        });
    }

    private void isi(int uang) {
        int tab = 100000;
        int h1 = Integer.parseInt(String.valueOf(editsetor.getText()));
        int x = tab + h1;
        editsaldo.setText(String.valueOf(x));
    }
}
