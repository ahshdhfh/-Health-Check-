package com.example.ooori.healthcheck;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calcuActivity extends AppCompatActivity {
    int kg;
    int time;

    TextView t1;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcu);
        setTitle("Health Check");

        Button b1 = (Button)findViewById(R.id.button); //걷기2
        Button b2 = (Button)findViewById(R.id.button2); //등산7.5
        Button b3 = (Button)findViewById(R.id.button3); //수영6
        Button b4 = (Button)findViewById(R.id.button4); // 줄넘기3
        Button b5 = (Button)findViewById(R.id.button5); //스쿼트6
        Button b6 = (Button)findViewById(R.id.button6); //윗몸 일으키기3
        Button b7 = (Button)findViewById(R.id.button7); //에어로빅3.5
        Button b8 = (Button)findViewById(R.id.button8); //속보4
        Button b9 = (Button)findViewById(R.id.button9); //런닝머신10
        Button b10 = (Button)findViewById(R.id.button10); //사이클8

        t1 = findViewById(R.id.calcukcal); //칼로리
        e1 = findViewById(R.id.calcuweight); // 몸무게
        e2 = findViewById(R.id.calcurun); //운동시간

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().equals("") && e2.getText().toString().equals("")){}
                else {
                    int MET = 2;
                    kg = Integer.parseInt(e1.getText().toString());
                    time = Integer.parseInt(e2.getText().toString());
                    int res = (int) ((MET * ((3.5 * kg * time) * 5)) / 1000);
                    t1.setText(String.valueOf(res+"Kcal"));
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().equals("") && e2.getText().toString().equals("")){}
                else {
                    float MET = (float) 7.5;
                    kg = Integer.parseInt(e1.getText().toString());
                    time = Integer.parseInt(e2.getText().toString());
                    int res = (int) ((MET * ((3.5 * kg * time) * 5)) / 1000);
                    t1.setText(String.valueOf(res+"Kcal"));
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().equals("") && e2.getText().toString().equals("")){}
                else {
                    int MET = 6;
                    kg = Integer.parseInt(e1.getText().toString());
                    time = Integer.parseInt(e2.getText().toString());
                    int res = (int) ((MET * ((3.5 * kg * time) * 5)) / 1000);
                    t1.setText(String.valueOf(res+"Kcal"));
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().equals("") && e2.getText().toString().equals("")){}
                else {
                    int MET = 3;
                    kg = Integer.parseInt(e1.getText().toString());
                    time = Integer.parseInt(e2.getText().toString());
                    int res = (int) ((MET * ((3.5 * kg * time) * 5)) / 1000);
                    t1.setText(String.valueOf(res+"Kcal"));
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().equals("") && e2.getText().toString().equals("")){}
                else {
                    int MET = 6;
                    kg = Integer.parseInt(e1.getText().toString());
                    time = Integer.parseInt(e2.getText().toString());
                    int res = (int) ((MET * ((3.5 * kg * time) * 5)) / 1000);
                    t1.setText(String.valueOf(res+"Kcal"));
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().equals("") && e2.getText().toString().equals("")){}
                else {
                    int MET = 3;
                    kg = Integer.parseInt(e1.getText().toString());
                    time = Integer.parseInt(e2.getText().toString());
                    int res = (int) ((MET * ((3.5 * kg * time) * 5)) / 1000);
                    t1.setText(String.valueOf(res+"Kcal"));
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().equals("") && e2.getText().toString().equals("")){}
                else {
                    float MET = (float) 3.5;
                    kg = Integer.parseInt(e1.getText().toString());
                    time = Integer.parseInt(e2.getText().toString());
                    int res = (int) ((MET * ((3.5 * kg * time) * 5)) / 1000);
                    t1.setText(String.valueOf(res+"Kcal"));
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().equals("") && e2.getText().toString().equals("")){}
                else {
                    int MET = 4;
                    kg = Integer.parseInt(e1.getText().toString());
                    time = Integer.parseInt(e2.getText().toString());
                    int res = (int) ((MET * ((3.5 * kg * time) * 5)) / 1000);
                    t1.setText(String.valueOf(res+"Kcal"));
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().equals("") && e2.getText().toString().equals("")){}
                else {
                    int MET = 10;
                    kg = Integer.parseInt(e1.getText().toString());
                    time = Integer.parseInt(e2.getText().toString());
                    int res = (int) ((MET * ((3.5 * kg * time) * 5)) / 1000);
                    t1.setText(String.valueOf(res+"Kcal"));
                }
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().equals("") && e2.getText().toString().equals("")){}
                else {
                    int MET = 8;
                    kg = Integer.parseInt(e1.getText().toString());
                    time = Integer.parseInt(e2.getText().toString());
                    int res = (int) ((MET * ((3.5 * kg * time) * 5)) / 1000);
                    t1.setText(String.valueOf(res+"Kcal"));
                }
            }
        });

        Button calcureturnbutton = (Button) findViewById(R.id.calcureturnbutton);
        calcureturnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
