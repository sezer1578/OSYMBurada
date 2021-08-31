package com.example.hepsiosym;

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

import com.example.hepsiosym.YKS_Questions_2018.Ayt_2018;
import com.example.hepsiosym.YKS_Questions_2018.Tyt_2018;
import com.example.hepsiosym.YKS_Questions_2018.Ydt_Almanca_2018;
import com.example.hepsiosym.YKS_Questions_2018.Ydt_Arapca_2018;
import com.example.hepsiosym.YKS_Questions_2018.Ydt_Fransızca_2018;
import com.example.hepsiosym.YKS_Questions_2018.Ydt_Ingilizce_2018;
import com.example.hepsiosym.YKS_Questions_2018.Ydt_Rusca_2018;


public class tyt_ayt_Question2018 extends AppCompatActivity {
    ListView listView;
    String[] exams = {"TYT SORU VE CEVAPLARI", "AYT SORU VE CEVAPLARI","YDT(ALMANCA)","YDT(ARAPÇA)","YDT(FRANSIZCA)","YDT(İNGİLİZCE)","YDT(RUSÇA)"};
    Toolbar toolbar;
    TextView toolbarTitle;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tyt_ayt_layout_2018);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("YKS 2018 SORULARI");
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.listview);

        ListAdapter myadapter = new ArrayAdapter<String>(this, R.layout.row,exams);
        listView.setAdapter(myadapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position == 0)
                {
                    Intent intent = new Intent(tyt_ayt_Question2018.this, Tyt_2018.class);
                    startActivity(intent);

                }
                if(position == 1)
                {
                    Intent intent = new Intent(tyt_ayt_Question2018.this, Ayt_2018.class);
                    startActivity(intent);

                }
                if(position == 2)
                {
                    Intent intent = new Intent(tyt_ayt_Question2018.this, Ydt_Almanca_2018.class);
                    startActivity(intent);

                }
                if(position == 3)
                {
                    Intent intent = new Intent(tyt_ayt_Question2018.this, Ydt_Arapca_2018.class);
                    startActivity(intent);

                }
                if(position == 4)
                {
                    Intent intent = new Intent(tyt_ayt_Question2018.this, Ydt_Fransızca_2018.class);
                    startActivity(intent);

                }
                if(position == 5)
                {
                    Intent intent = new Intent(tyt_ayt_Question2018.this, Ydt_Ingilizce_2018.class);
                    startActivity(intent);

                }
                if(position == 6)
                {
                    Intent intent = new Intent(tyt_ayt_Question2018.this, Ydt_Rusca_2018.class);
                    startActivity(intent);

                }



            }
        });



    }
}
