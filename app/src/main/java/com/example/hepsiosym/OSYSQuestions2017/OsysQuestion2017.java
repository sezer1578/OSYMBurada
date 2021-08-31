package com.example.hepsiosym.OSYSQuestions2017;

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

public class OsysQuestion2017 extends AppCompatActivity {

    ListView listView;

    String[] exams = {"YGS","LYS/1(Matematik)","LYS/2(Fizik)","LYS/2(Kimya)","LYS/2(Biyoloji)","LYS/3(Türk Dili ve Edebiyatı)","LYS/3(Coğrafya-1)","LYS/4(Tarih)",
    "LYS/4(Coğrafya-2)","LYS/4(Felsefe - Din Kültürü ve Ahlak Bilgisi)","LYS/5(Almanca)","LYS/5(Fransızca)","LYS/5(İngilizce)"};
    Toolbar toolbar;
    TextView toolbarTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.osys_ques);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("ÖSYS 2017 SINAVLARI");
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.listview);
        ListAdapter myadapter = new ArrayAdapter<String>(this, R.layout.row,exams);
        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position==0)
                {
                    Intent intent = new Intent(OsysQuestion2017.this,Ygs2017.class);
                    startActivity(intent);
                }

                if(position==1)
                {
                    Intent intent = new Intent(OsysQuestion2017.this,mat2017.class);
                    startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent = new Intent(OsysQuestion2017.this,fizik2017.class);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent = new Intent(OsysQuestion2017.this,kimya2017.class);
                    startActivity(intent);
                }
                if(position==4)
                {
                    Intent intent = new Intent(OsysQuestion2017.this,biyo2017.class);
                    startActivity(intent);
                }
                if(position==5)
                {
                    Intent intent = new Intent(OsysQuestion2017.this,tukdil2017.class);
                    startActivity(intent);
                }
                if(position==6)
                {
                    Intent intent = new Intent(OsysQuestion2017.this,cog1_2017.class);
                    startActivity(intent);
                }
                if(position==7)
                {
                    Intent intent = new Intent(OsysQuestion2017.this,tarih2017.class);
                    startActivity(intent);
                } if(position==8)
                {
                    Intent intent = new Intent(OsysQuestion2017.this,cog2_2017.class);
                    startActivity(intent);

                } if(position==9)
                {
                    Intent intent = new Intent(OsysQuestion2017.this,felsefe2017.class);
                    startActivity(intent);
                }
                if(position==10)
                {
                    Intent intent = new Intent(OsysQuestion2017.this,alm2017.class);
                    startActivity(intent);
                }
                if(position==11)
                {
                    Intent intent = new Intent(OsysQuestion2017.this,fra2017.class);
                    startActivity(intent);
                }
                if(position==12)
                {
                    Intent intent = new Intent(OsysQuestion2017.this,ing2017.class);
                    startActivity(intent);
                }



            }
        });


    }
}
