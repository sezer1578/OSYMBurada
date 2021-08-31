package com.example.hepsiosym.YDSQuestions2018;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.hepsiosym.R;

public class YdsQuestions2018 extends AppCompatActivity {

    ListView listView;

    String[] exams = {"İlkbahar Dönemi(Almanca)","İlkbahar Dönemi(Arapça)","İlkbahar Dönemi(Fransızca)","İlkbahar Dönemi(İngilizce)","İlkbahar Dönemi(Rusça)",
    "Sonbahar Dönemi(Almanca)","Sonbahar Dönemi(Arapça)","Sonbahar Dönemi(Fransızca)","Sonbahar Dönemi(İngilizce)","Sonbahar Dönemi(Rusça)","YDS/3(İngilizce)"};
    Toolbar toolbar;
    TextView toolbarTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ydsques);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("YDS 2018 SINAVLARI");
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.listview);

        ListAdapter myadapter = new ArrayAdapter<String>(this, R.layout.row,exams);
        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position==0)
                {
                 Intent intent = new Intent(YdsQuestions2018.this,Yds_ilkAlman2018.class);
                 startActivity(intent);
                }
                if(position==1)
                {
                    Intent intent = new Intent(YdsQuestions2018.this,Yds_ilkarap2018.class);
                    startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent = new Intent(YdsQuestions2018.this,Yds_ilkfra2018.class);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent = new Intent(YdsQuestions2018.this,Yds_ilking2018.class);
                    startActivity(intent);
                }
                if(position==4)
                {
                    Intent intent = new Intent(YdsQuestions2018.this,Yds_ilkrus2018.class);
                    startActivity(intent);
                }
                if(position==5)
                {
                    Intent intent = new Intent(YdsQuestions2018.this,Yds_sonAlm2018.class);
                    startActivity(intent);
                }
                if(position==6)
                {
                    Intent intent = new Intent(YdsQuestions2018.this,Yds_sonArap2018.class);
                    startActivity(intent);
                }
                if(position==7)
                {
                    Intent intent = new Intent(YdsQuestions2018.this,Yds_sonFra2018.class);
                    startActivity(intent);
                }
                if(position==8)
                {
                    Intent intent = new Intent(YdsQuestions2018.this,Yds_sonİng2018.class);
                    startActivity(intent);
                }
                if(position==9)
                {
                    Intent intent = new Intent(YdsQuestions2018.this,Yds_sonRus2018.class);
                    startActivity(intent);
                }
                if(position==10)
                {
                    Intent intent = new Intent(YdsQuestions2018.this,Yds3_2018.class);
                    startActivity(intent);
                }

            }
        });


    }
}
