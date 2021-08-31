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

import com.example.hepsiosym.Ales_Questions.Ales_2014;
import com.example.hepsiosym.Ales_Questions.Ales_2015;
import com.example.hepsiosym.Ales_Questions.Ales_2016;
import com.example.hepsiosym.Ales_Questions.Ales_2017;
import com.example.hepsiosym.Ales_Questions.Ales_2018;
import com.example.hepsiosym.Ales_Questions.Ales_2019;
import com.example.hepsiosym.Ales_Questions.Ales_2020_1;
import com.example.hepsiosym.R;

public class AlesQuestion extends AppCompatActivity {
    ListView listView;
    String[] years ={"2020","2019","2018","2017","2016","2015","2014"};
    Toolbar toolbar;
    TextView toolbarTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ales_layout);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("ALES SINAVLARI");
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.listview_ales);
        ListAdapter alesAdapter = new ArrayAdapter<String>(this,R.layout.row,years);
        listView.setAdapter(alesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position==0)
                {
                    Intent intent = new Intent(AlesQuestion.this, Ales_2020_1.class);
                    startActivity(intent);
                }
                if(position==1)
                {
                    Intent intent = new Intent(AlesQuestion.this, Ales_2019.class);
                    startActivity(intent);
                }

                if(position==2)
                {
                    Intent intent = new Intent(AlesQuestion.this, Ales_2018.class);
                    startActivity(intent);
                }

                if(position==3)
                {
                    Intent intent = new Intent(AlesQuestion.this, Ales_2017.class);
                    startActivity(intent);
                }

                if(position==4)
                {
                    Intent intent = new Intent(AlesQuestion.this, Ales_2016.class);
                    startActivity(intent);

                }
                if(position==5)
                {
                    Intent intent = new Intent(AlesQuestion.this, Ales_2015.class);
                    startActivity(intent);

                }

                if(position==6)
                {
                    Intent intent = new Intent(AlesQuestion.this, Ales_2014.class);
                    startActivity(intent);
                }


            }
        });





    }
}
