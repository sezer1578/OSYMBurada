package com.example.hepsiosym.YKS_Questions_2021;

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
import com.example.hepsiosym.YKS_Questions_2020.Ayt2020;
import com.example.hepsiosym.YKS_Questions_2020.Tyt2020;
import com.example.hepsiosym.YKS_Questions_2020.ydt_almanca_2020;
import com.example.hepsiosym.YKS_Questions_2020.ydt_arapca_2020;
import com.example.hepsiosym.YKS_Questions_2020.ydt_fransızca_2020;
import com.example.hepsiosym.YKS_Questions_2020.ydt_ing_2020;
import com.example.hepsiosym.YKS_Questions_2020.ydt_rus_2020;


public class tyt_ayt_Question2021 extends AppCompatActivity {

    ListView listView;
    String[] exams = {"TYT SORU VE CEVAPLARI", "AYT SORU VE CEVAPLARI","YDT(ALMANCA)","YDT(ARAPÇA)","YDT(FRANSIZCA)","YDT(İNGİLİZCE)","YDT(RUSÇA)"};
    Toolbar toolbar;
    TextView toolbarTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tyt_ayt_layout2020);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("YKS 2021 SORULARI");
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.listview_tyt_ayt);

        ListAdapter myadapter = new ArrayAdapter<String>(this, R.layout.row,exams);
        listView.setAdapter(myadapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position == 0)
                {
                    Intent intent = new Intent(tyt_ayt_Question2021.this, Tyt2021.class);
                    startActivity(intent);

                }
                if(position == 1)
                {
                    Intent intent = new Intent(tyt_ayt_Question2021.this, Ayt2021.class);
                    startActivity(intent);

                }
                if(position == 2)
                {
                    Intent intent = new Intent(tyt_ayt_Question2021.this, ydt_almanca_2021.class);
                    startActivity(intent);

                }
                if(position == 3)
                {
                    Intent intent = new Intent(tyt_ayt_Question2021.this, ydt_arapca_2021.class);
                    startActivity(intent);

                }
                if(position == 4)
                {
                    Intent intent = new Intent(tyt_ayt_Question2021.this, ydt_fransızca_2021.class);
                    startActivity(intent);

                }
                if(position == 5)
                {
                    Intent intent = new Intent(tyt_ayt_Question2021.this, ydt_ing_2021.class);
                    startActivity(intent);

                }
                if(position == 6)
                {
                    Intent intent = new Intent(tyt_ayt_Question2021.this, ydt_rus_2021.class);
                    startActivity(intent);

                }



            }
        });


    }
}
