package com.example.ooori.healthcheck;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class foodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food);
        setTitle("Health Check");

        final String[] food = {"바나나(30kal, 동물성 단백질 풍부)","고구마( 10kcal, 포만감 높음)",
                "아몬드 (5kcal, 식물성 단백질 풍부, 아침대용)","닭가슴살(50kcal, 고 단백질 )",
                "콩(10kcal, 단백질 풍부, 포만감 높음)","두부(4kcal,칼로리가 적음 )",
                "아메리카노(5kcal,운동 전 마시면 칼로리 소모량 증가)","사과(52kcal,대표적인 고탄수화물 저지방)",
                "통밀빵(247kcal,운동 중 혈당을 안정적으로 유지시키는 데 효과적)",
                "저지방 그릭 요거트(135kcal,단백질 함유량이 높고, 나트륨과 당 함유량이 낮은 편)",
                "흰 살 생선(172kcal,칼로리가 낮고, 비타민과 칼슘, 마그네슘을 풍부)",
                "포도(66kcal,유기산, 안토시아닌 성분을 함유)","오렌지 주스(44kcal,오렌지 주스 속의 구연산 성분은 운동 중 손실된 근 글리코겐의 저장량을 회복)",
                "연어(120kcal,단백질과 오메가3 지방산, 비타민 D가 풍부하게 함유)"};
        ListView list = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String>adapter= new ArrayAdapter<String>(this, R.layout.simple_food ,food);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), food[i],Toast.LENGTH_SHORT).show();
            }
        });


        Button foodreturnbutton =(Button)findViewById(R.id.foodreturnbutton);
        foodreturnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
