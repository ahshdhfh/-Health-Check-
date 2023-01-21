package com.example.ooori.healthcheck;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class watchActivity extends AppCompatActivity {
    Button watchgo1,watchgo2,watchgo3,watchgo4,watchgo5,watchgo6,watchgo7,watchgo8,watchgo9,watchgo10,watchgo11,watchgo12,watchgo13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.watch);
        setTitle("Health Check");

        watchgo1 = (Button)findViewById(R.id.watchgo1);
        watchgo2 = (Button)findViewById(R.id.watchgo2);
        watchgo3 = (Button)findViewById(R.id.watchgo3);
        watchgo4 = (Button)findViewById(R.id.watchgo4);
        watchgo5 = (Button)findViewById(R.id.watchgo5);
        watchgo6 = (Button)findViewById(R.id.watchgo6);
        watchgo7 = (Button)findViewById(R.id.watchgo7);
        watchgo8 = (Button)findViewById(R.id.watchgo8);
        watchgo9 = (Button)findViewById(R.id.watchgo9);
        watchgo10 = (Button)findViewById(R.id.watchgo10);
        watchgo11 = (Button)findViewById(R.id.watchgo11);
        watchgo12 = (Button)findViewById(R.id.watchgo12);
        watchgo13 = (Button)findViewById(R.id.watchgo13);

        watchgo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/channel/UCLG1XzhSPuuJ6hqaHhQaFkA");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        watchgo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/channel/UCygs-_iDpCJOnhuCZibK7JQ");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        watchgo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/user/TeamAirwave");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        watchgo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/channel/UCDQ94nUOUel-hB4BHCZ6d5w");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        watchgo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/channel/UCB7A0Php3CJg4uH4HavVy-w");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        watchgo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/channel/UCQ4eZwsMew7ZaV_HKXnQLGg");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        watchgo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/channel/UCEyXB3mjiTlZXJn_j1aKM7A");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        watchgo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/channel/UCMY_lKUu8yGZaVsu_9lPIGg");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        watchgo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/channel/UCdtRAcd3L_UpV4tMXCw63NQ");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        watchgo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/channel/UCoyogo_Fg-Z5jDOQz6Rt6eA");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        watchgo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/channel/UCt-3dAKgx9VT59D0pbneKTQ");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        watchgo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/channel/UChBKRycwLWou13wTAF--_mw");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        watchgo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/channel/UCrFFbADYO1jrXxefP9MivWA");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });






        Button watchreturnbutton = (Button)findViewById(R.id.watchreturnbutton);
        watchreturnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
