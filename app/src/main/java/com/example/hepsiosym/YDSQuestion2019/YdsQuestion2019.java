package com.example.hepsiosym.YDSQuestion2019;

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

public class YdsQuestion2019 extends AppCompatActivity {

    ListView listView;

    String[] exams = {"YDS/1(Almanca)","YDS/1(Arapça)","YDS/1(Bulgarca)","YDS/1(Farsça)","YDS/1(Fransızca)","YDS/1(İngilizce)","YDS/1(İspanyolca)","YDS/1(İtanlanca)",
    "YDS/1(Rusça)","YDS/1(Yunanca)","YDS/2(Almanca)","YDS/2(Arapça)","YDS/2(Fransızca)","YDS/2(İngilizce)","YDS/2(Rusça)","YDS/3(İngilizce)"};
    Toolbar toolbar;
    TextView toolbarTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ydsques);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("YDS 2019 SINAVLARI");
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.listview);
        ListAdapter myadapter = new ArrayAdapter<String>(this, R.layout.row,exams);
        listView.setAdapter(myadapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position==0)
                {
                    Intent intent = new Intent(YdsQuestion2019.this,Yds1_Alm2019.class);
                    startActivity(intent);
                }
                if(position==1)
                {
                    Intent intent = new Intent(YdsQuestion2019.this,Yds1_arap2019.class);
                    startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent = new Intent(YdsQuestion2019.this,Yds1_bulgar2019.class);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent = new Intent(YdsQuestion2019.this,Yds1_farsca2019.class);
                    startActivity(intent);
                }
                if(position==4)
                {
                    Intent intent = new Intent(YdsQuestion2019.this,Yds1_fra2019.class);
                    startActivity(intent);
                }
                if(position==5)
                {
                    Intent intent = new Intent(YdsQuestion2019.this,Yds1_ing2019.class);
                    startActivity(intent);
                }
                if(position==6)
                {
                    Intent intent = new Intent(YdsQuestion2019.this,Yds1_isp2019.class);
                    startActivity(intent);
                }
                if(position==7)
                {
                    Intent intent = new Intent(YdsQuestion2019.this,Yds1_ita2019.class);
                    startActivity(intent);
                }
                if(position==8)
                {
                    Intent intent = new Intent(YdsQuestion2019.this,Yds1_rus2019.class);
                    startActivity(intent);
                }
                if(position==9)
                {
                    Intent intent = new Intent(YdsQuestion2019.this,Yds1_yunan2019.class);
                    startActivity(intent);
                }
                if(position==10)
                {
                    Intent intent = new Intent(YdsQuestion2019.this,Yds2_alm2019.class);
                    startActivity(intent);
                }
                if(position==11)
                {
                    Intent intent = new Intent(YdsQuestion2019.this,Yds2_arap2019.class);
                    startActivity(intent);
                }
                if(position==12)
                {
                    Intent intent = new Intent(YdsQuestion2019.this,Yds2_fra2019.class);
                    startActivity(intent);
                }
                if(position==13)
                {
                    Intent intent = new Intent(YdsQuestion2019.this,Yds2_ing2019.class);
                    startActivity(intent);

                }
                if(position==14)

                {
                    Intent intent = new Intent(YdsQuestion2019.this,Yds2_rus2019.class);
                    startActivity(intent);
                }
                if(position==15)

                {
                    Intent intent = new Intent(YdsQuestion2019.this,Yds3_ing2019.class);
                    startActivity(intent);
                }


            }
        });



    }
}
