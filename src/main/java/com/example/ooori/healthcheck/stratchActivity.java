package com.example.ooori.healthcheck;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class stratchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stratch);
        setTitle("Health Check");

        Button stratchprev, stratchnext;
        final ViewFlipper vFlipper;

        stratchprev = (Button)findViewById(R.id.stratchprev);
        stratchnext = (Button)findViewById(R.id.stratchnext);
        vFlipper = (ViewFlipper)findViewById(R.id.viewFlipper);

        stratchprev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.showPrevious();
            }
        });
        stratchnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.showNext();
            }
        });

        Button stratchreturnbutton = (Button)findViewById(R.id.stratchreturnbutton);
        stratchreturnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
