package com.example.ooori.healthcheck;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class standardActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton man, girl;
    Button bmiresult;
    EditText heighttext, weighttext;
    TextView standardtext,standardtext1,standardtext2;
    String height, weight;
    Integer result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standard);
        setTitle("Health Check");

        rg = (RadioGroup)findViewById(R.id.rg);
        man = (RadioButton)findViewById(R.id.man);
        girl = (RadioButton)findViewById(R.id.girl);

        bmiresult = (Button)findViewById(R.id.bmiresult);
        standardtext = (TextView)findViewById(R.id.standardtextview);
        standardtext1 = (TextView)findViewById(R.id.standardtextview2);
        standardtext2 = (TextView)findViewById(R.id.standardtextview3);

        heighttext = (EditText)findViewById(R.id.heighttext);
        weighttext = (EditText)findViewById(R.id.weighttext);

        bmiresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String height =heighttext.getText().toString();
                String weight =weighttext.getText().toString();

                            /*weighttext.getText().toString();*/
                if (height != null && !"".equals(height)
                        && weight != null  &&  !"".equals(weight)) {
                    float heightValue = Float.parseFloat(height) / 100;
                    float weightValue = Float.parseFloat(weight);

                    float bmi = weightValue / (heightValue * heightValue);

                    switch(rg.getCheckedRadioButtonId()){
                        case R.id.man:
                            float bminomalm = 22 * (heightValue * heightValue);
                            standardtext2.setText("" +String.format("%.2f",bminomalm));
                            break;
                        case R.id.girl:
                            float bminomalg = 21 * (heightValue * heightValue);
                            standardtext2.setText("" + String.format("%.2f",bminomalg));
                            break;


                    }
                    float bminomal = 22 * (heightValue * heightValue);
                            /*bmi Label*/
                    if (Float.compare(bmi, 16f) <= 0) {
                        standardtext1.setText("very_underweight" );
                    }  else if (Float.compare(bmi, 16f) > 0  &&  Float.compare(bmi, 18.5f) <= 0) {
                        standardtext1.setText("UNDERWEIGHT" );
                    } else if (Float.compare(bmi, 18.5f) > 0  &&  Float.compare(bmi, 25f) <= 0) {
                        standardtext1.setText("NORMAL" );
                    } else if (Float.compare(bmi, 25f) > 0  &&  Float.compare(bmi, 30f) <= 0) {
                        standardtext1.setText("OVERWEIGHT" );
                    } else if (Float.compare(bmi, 30f) > 0  &&  Float.compare(bmi, 35f) <= 0) {
                        standardtext1.setText("OBESE" );
                    } else if (Float.compare(bmi, 35f) > 0  &&  Float.compare(bmi, 40f) <= 0) {
                        standardtext1.setText("EXTREMLY OBESE" );
                    } else {
                        standardtext1.setText("obese_class_iii" );
                    }


                    result = Integer.parseInt(weight) / Integer.parseInt(height);
                    standardtext.setText(""+ String.format("%.2f",bmi));
                }
            }
        });

        Button standardreturnbtn = (Button)findViewById(R.id.standardreturnbutton);

        standardreturnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
