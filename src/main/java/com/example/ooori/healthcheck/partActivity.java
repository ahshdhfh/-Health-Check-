package com.example.ooori.healthcheck;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;


public class partActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.part);
        setTitle("Health Check");

        TabHost tabHost1 = (TabHost) findViewById(R.id.tabHost1) ;
        tabHost1.setup() ;

        // 첫 번째 Tab. (탭 표시 텍스트:"TAB 1"), (페이지 뷰:"content1")
        TabHost.TabSpec ts1 = tabHost1.newTabSpec("Tab Spec 1") ;
        ts1.setContent(R.id.content1) ;
        ts1.setIndicator("Shou lder") ;
        tabHost1.addTab(ts1);


        // 두 번째 Tab. (탭 표시 텍스트:"TAB 2"), (페이지 뷰:"content2")
        TabHost.TabSpec ts2 = tabHost1.newTabSpec("Tab Spec 2") ;
        ts2.setContent(R.id.content2) ;
        ts2.setIndicator("Chest") ;
        tabHost1.addTab(ts2) ;

        // 세 번째 Tab. (탭 표시 텍스트:"TAB 3"), (페이지 뷰:"content3")
        TabHost.TabSpec ts3 = tabHost1.newTabSpec("Tab Spec 3") ;
        ts3.setContent(R.id.content3) ;
        ts3.setIndicator("back") ;
        tabHost1.addTab(ts3) ;

        // 네 번째 Tab. (탭 표시 텍스트:"TAB 3"), (페이지 뷰:"content3")
        TabHost.TabSpec ts4 = tabHost1.newTabSpec("Tab Spec 4") ;
        ts4.setContent(R.id.content4) ;
        ts4.setIndicator("lowerbody") ;
        tabHost1.addTab(ts4) ;

        // 다섯 번째 Tab. (탭 표시 텍스트:"TAB 3"), (페이지 뷰:"content5")
        TabHost.TabSpec ts5 = tabHost1.newTabSpec("Tab Spec 5") ;
        ts5.setContent(R.id.content5) ;
        ts5.setIndicator("arm") ;
        tabHost1.addTab(ts5) ;



        Button partreturnbutton = (Button) findViewById(R.id.partreturnbutton);
        partreturnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}











