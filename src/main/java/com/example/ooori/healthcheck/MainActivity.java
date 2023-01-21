package com.example.ooori.healthcheck;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    LinearLayout base,basebuttonset,baseicon;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.option , menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.itemred:
                base.setBackgroundColor(Color.RED);
                return true;
            case R.id.itemgreen:
                base.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.itemblue:
                base.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.itemyellow:
                base.setBackgroundColor(Color.YELLOW);
                return true;
            case R.id.finishoption:
                finish();
                return true;
            case R.id.restartoption:
                recreate();
                return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Health Check");
        base = (LinearLayout)findViewById(R.id.base);
        basebuttonset = (LinearLayout)findViewById(R.id.basebuttonset);
        baseicon = (LinearLayout)findViewById(R.id.baseicon);


        /*여기는 액티비티 호출 코드입니다*/
        Button imminsubutton = (Button) findViewById(R.id.imminsubutton);
        imminsubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imminsu = new Intent(getApplicationContext(),imminsuActivity.class);
                startActivity(imminsu);
            }
        });

        Button stratchbutton = (Button)findViewById(R.id.stratchbutton);
        stratchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Istratch = new Intent(getApplicationContext(),stratchActivity.class);
                startActivity(Istratch);
            }
        });

        Button proteinbutton = (Button)findViewById(R.id.proteinbutton);
        proteinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iprotein = new Intent(getApplicationContext(),proteinActivity.class);
                startActivity(iprotein);
            }
        });
        Button partbutton = (Button)findViewById(R.id.partbutton);

        partbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ipart = new Intent(getApplicationContext(),partActivity.class);
                startActivity(ipart);
            }
        });

        Button foodbutton = (Button)findViewById(R.id.foodbutton);

        foodbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ifood = new Intent(getApplicationContext(),foodActivity.class);
                startActivity(ifood);
            }
        });


        Button standardbutton = (Button)findViewById(R.id.standardbutton);

        standardbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent istandard = new Intent(getApplicationContext(),standardActivity.class);
                startActivity(istandard);
            }
        });

        Button timericon = (Button)findViewById(R.id.timericon);

        timericon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itimer = new Intent(getApplicationContext(),timerActivity.class);
                startActivity(itimer);
            }
        });


        Button watchicon = (Button)findViewById(R.id.watchicon);

        watchicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iwatch = new Intent(getApplicationContext(),watchActivity.class);
                startActivity(iwatch);
            }
        });

        Button calcuicon = (Button)findViewById(R.id.calcuicon);

        calcuicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent icalcu = new Intent(getApplicationContext(),calcuActivity.class);
                startActivity(icalcu);
            }
        });

        Button calenicon = (Button)findViewById(R.id.calenicon);

        calenicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent icalen = new Intent(getApplicationContext(),calenActivity.class);
                startActivity(icalen);
            }
        });

        /*여기는 액티비티 호출 코드입니다*/

    }
}
