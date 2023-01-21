package com.example.ooori.healthcheck;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class proteinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.protein);
        setTitle("Health Check");

        final GridView gv = (GridView)findViewById(R.id.gridview);
        MyGridAdapter gAdapter = new MyGridAdapter(this);
        gv.setAdapter(gAdapter);
        Button proreturn = (Button)findViewById(R.id.proreturn);

        proreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
    public class MyGridAdapter extends BaseAdapter {
        Context context;
        public MyGridAdapter(Context c) {
            context = c;

        }
        public  int getCount() {
            return posterID.length;
        }
        public Object getItem(int arg0) {
            return  null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }
        Integer[] posterID = {
                R.drawable.pro1, R.drawable.pro2, R.drawable.pro4, R.drawable.pro5, R.drawable.pro6,
                R.drawable.pro7, R.drawable.pro8, R.drawable.pro9, R.drawable.pro10, R.drawable.pro11,
                R.drawable.pro12, R.drawable.pro13, R.drawable.pro14, R.drawable.pro15, R.drawable.pro16
        };

        public View getView(int position, View convertView, ViewGroup parent){

            View gView = (View) View.inflate(proteinActivity.this, R.layout.dialog, null);
            ImageView gPoster = (ImageView) gView.findViewById(R.id.poster);
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams( 400,500));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(5, 5, 5, 5);

            final int pos = position;
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    View dialogView = (View) View.inflate(proteinActivity.this, R.layout.dialog, null);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(proteinActivity.this);
                    ImageView ivPoster = (ImageView) dialogView.findViewById(R.id.poster);
                    ivPoster.setImageResource(posterID[pos]);
                    dlg.setTitle("자세히 보기");
                    dlg.setIcon(R.drawable.power);
                    dlg.setView(dialogView);
                    dlg.setNegativeButton("닫기", null);
                    dlg.show();
                }
            });

            imageView.setImageResource(posterID[position]);

            return imageView;
        }
    }
}

