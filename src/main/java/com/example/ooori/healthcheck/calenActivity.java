package com.example.ooori.healthcheck;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class calenActivity extends AppCompatActivity {

    DatePicker dp;
    EditText edtDiary;
    Button btnWrite;
    String fimeName;
    String go;

    String readDiary(String fName){
        String diaryStr = null;
        FileInputStream inFs;
        try {
            inFs = openFileInput(fName);
            byte[] txt = new byte[500];
            inFs.read(txt);
            diaryStr = (new String(txt)).trim();
            btnWrite.setText("수정하기");
        } catch (IOException e) {
            edtDiary.setHint("일정 없음");
            btnWrite.setText("새로 저장");
        }
        return diaryStr;
    }



    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.calen);
        setTitle("Health Check");

        dp = (DatePicker) findViewById(R.id.datepicker1);
        edtDiary = (EditText) findViewById(R.id.edtdiary);
        btnWrite = (Button) findViewById(R.id.write);

        Calendar cal = Calendar.getInstance();
        int Cyear = cal.get(Calendar.YEAR);
        int CMonth = cal.get(Calendar.MONTH);
        int CDay = cal.get(Calendar.DAY_OF_MONTH);

        dp.init(Cyear, CMonth, CDay, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {

                fimeName = Integer.toString(year) + "_" + Integer.toString(monthOfYear + 1) + "_" + Integer.toString(dayOfMonth) + ".txt";
                String str = readDiary(fimeName);
                edtDiary.setText(str);
                btnWrite.setEnabled(true);
            }
        });





        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    FileOutputStream outFs = openFileOutput(fimeName, Context.MODE_PRIVATE);
                    String str = edtDiary.getText().toString();
                    outFs.write(str.getBytes());
                    outFs.close();
                    Toast.makeText(getApplicationContext(), fimeName + "이 저장됨", Toast.LENGTH_SHORT).show();
                }catch (IOException e) {

                }
            }
        });




        final CalendarView calendar = (CalendarView) findViewById(R.id.calendar);
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            public void onSelectedDayChange(CalendarView view, int year,
                                            int month, int dayOfMonth) {
               try {
                   FileInputStream inFs = openFileInput(year+"_"+(month+1)+"_"+dayOfMonth+".txt");
                   byte[] txt = new byte[60];
                   inFs.read(txt);
                   go = new String(txt);
                   inFs.close();
               } catch (IOException e) {

                   go = "일정 없음";
               }

                AlertDialog.Builder dlg = new AlertDialog.Builder(calenActivity.this);
                dlg.setTitle(year + "년"+(month+1)+"월"+dayOfMonth+"일");
                dlg.setMessage(go);
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("확인", null);
                dlg.show();
                Toast.makeText(calenActivity.this, "" + year + "/" +
                        (month + 1) + "/" + dayOfMonth, 0).show();
            }
        });

        Button calenreturnbutton = (Button)findViewById(R.id.calenreturnbutton);
        calenreturnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
