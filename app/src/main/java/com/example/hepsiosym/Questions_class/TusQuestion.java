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

import com.example.hepsiosym.R;
import com.example.hepsiosym.TUSQuestions2015.TusQuestion2015;
import com.example.hepsiosym.TUSQuestions2016.TusQuestions2016;
import com.example.hepsiosym.TUSQuestions2017.TusQuestions2017;
import com.example.hepsiosym.TUSQuestions2018.TUSQuestions2018;
import com.example.hepsiosym.TUSQuestions2019.TusQuestion2019;

public class TusQuestion extends AppCompatActivity {

    ListView listView;
    String[] years = {"2019","2018","2017","2016","2015"};
    Toolbar toolbar;
    TextView toolbarTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tus_layout);

        listView = findViewById(R.id.listview_tus);

        ListAdapter tusAdapter = new ArrayAdapter<String>(this,R.layout.row,years);
        listView.setAdapter(tusAdapter);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("TUS SINAVLARI");
        setSupportActionBar(toolbar);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position==0)
                {
                    Intent intent = new Intent(TusQuestion.this, TusQuestion2019.class);
                    startActivity(intent);
                }

                if(position==1)
                {
                    Intent intent = new Intent(TusQuestion.this, TUSQuestions2018.class);
                    startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent = new Intent(TusQuestion.this, TusQuestions2017.class);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent = new Intent(TusQuestion.this, TusQuestions2016.class);
                    startActivity(intent);
                }
                if(position==4)
                {
                    Intent intent = new Intent(TusQuestion.this, TusQuestion2015.class);
                    startActivity(intent);
                }

            }
        });

    }
}
