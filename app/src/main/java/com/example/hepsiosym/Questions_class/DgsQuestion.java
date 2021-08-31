package com.example.hepsiosym.Questions_class;

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

import com.example.hepsiosym.DGS_Questions.Dgs_2014;
import com.example.hepsiosym.DGS_Questions.Dgs_2015;
import com.example.hepsiosym.DGS_Questions.Dgs_2016;
import com.example.hepsiosym.DGS_Questions.Dgs_2017;
import com.example.hepsiosym.DGS_Questions.Dgs_2018;
import com.example.hepsiosym.DGS_Questions.Dgs_2019_say;
import com.example.hepsiosym.DGS_Questions.Dgs_2019_soz;
import com.example.hepsiosym.DGS_Questions.Dgs_2020_say;
import com.example.hepsiosym.DGS_Questions.Dgs_2020_soz;
import com.example.hepsiosym.R;
import com.example.hepsiosym.tyt_ayt_Question2018;
import com.example.hepsiosym.tyt_ayt_Question_2019;

public class DgsQuestion extends AppCompatActivity {

    ListView listView;
    String[] years = {"2020(Sayısal)","2020(Sözel)","2019(Sayısal)","2019(Sözel)","2018","2017","2016","2015","2014"};
    Toolbar toolbar;
    TextView toolbarTitle;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dgs_layout);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("DGS SINAVLARI");
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.listview_dgs);

        ListAdapter dgsAdapter = new ArrayAdapter<String>(this,R.layout.row,years);
        listView.setAdapter(dgsAdapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


                if(position==0)
                {
                    Intent intent = new Intent(DgsQuestion.this, Dgs_2020_say.class);
                    startActivity(intent);
                }
                if(position==1)
                {
                    Intent intent = new Intent(DgsQuestion.this, Dgs_2020_soz.class);
                    startActivity(intent);
                }


                if(position==2)
                {
                    Intent intent = new Intent(DgsQuestion.this, Dgs_2019_say.class);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent = new Intent(DgsQuestion.this, Dgs_2019_soz.class);
                    startActivity(intent);
                }
                if(position==4)
                {
                    Intent intent = new Intent(DgsQuestion.this, Dgs_2018.class);
                    startActivity(intent);
                }
                if(position==5)
                {
                    Intent intent = new Intent(DgsQuestion.this, Dgs_2017.class);
                    startActivity(intent);
                }
                if(position==6)
                {
                    Intent intent = new Intent(DgsQuestion.this, Dgs_2016.class);
                    startActivity(intent);
                }
                if(position==7)
                {
                    Intent intent = new Intent(DgsQuestion.this, Dgs_2015.class);
                    startActivity(intent);
                }
                if(position==8)
                {
                    Intent intent = new Intent(DgsQuestion.this, Dgs_2014.class);
                    startActivity(intent);
                }


            }
        });




    }
}
