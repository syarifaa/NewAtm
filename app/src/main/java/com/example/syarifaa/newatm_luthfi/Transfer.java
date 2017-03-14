package com.example.syarifaa.newatm_luthfi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Transfer extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnok, btndel;
    EditText edittransfer, editsaldo;
    String transfer = "";
    int temp;
    int tab = 100000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        setContentView(R.layout.activity_transfer);
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
        edittransfer = (EditText) findViewById(R.id.edittransfer);
        editsaldo = (EditText) findViewById(R.id.editsaldo);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "0";
                edittransfer.setText(transfer);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "1";
                edittransfer.setText(transfer);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "2";
                edittransfer.setText(transfer);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "3";
                edittransfer.setText(transfer);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "4";
                edittransfer.setText(transfer);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "5";
                edittransfer.setText(transfer);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "6";
                edittransfer.setText(transfer);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "7";
                edittransfer.setText(transfer);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "8";
                edittransfer.setText(transfer);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer += "9";
                edittransfer.setText(transfer);
            }
        });
        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer = "";
                edittransfer.setText(transfer);
            }
        });
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean valid;
                if (edittransfer.equals("")) {
                    edittransfer.setError("Masukkan Jumlah Transfer dengan Benar");
                    valid = (false);
                } else {
                    int e = Integer.parseInt(transfer);
                    if (e > tab) {
                        edittransfer.setError("Saldo Anda tidak mencukupi");
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
        int h1 = Integer.parseInt(String.valueOf(edittransfer.getText()));
        int x = tab - h1;
        editsaldo.setText(String.valueOf(x));
    }
}
