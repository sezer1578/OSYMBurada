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

import com.example.hepsiosym.KpssQuestions2019.KpssQuestions2019;
import com.example.hepsiosym.KpssQuestions_2016.KpssQuestions2016;
import com.example.hepsiosym.KpssQuestions_2017.KpssQuestions2017;
import com.example.hepsiosym.KpssQuestions_2018.KpssQuestions2018;
import com.example.hepsiosym.KpssQuestions_2018.Kpss_orta_2018;
import com.example.hepsiosym.R;

public class KpssQuestion extends AppCompatActivity {
    ListView listView;
    String[] years = {"2019","2018","2017","2016"};
    Toolbar toolbar;
    TextView toolbarTitle;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kpss_layout);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("KPSS SINAVLARI");
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.listview_kpss);
        ListAdapter kpssAdapter = new ArrayAdapter<String>(this,R.layout.row,years);
        listView.setAdapter(kpssAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position==0)
                {
                    Intent intent = new Intent(KpssQuestion.this, KpssQuestions2019.class);
                    startActivity(intent);
                }

                if(position == 1)
                {
                    Intent intent = new Intent(KpssQuestion.this, KpssQuestions2018.class);
                    startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent = new Intent(KpssQuestion.this, KpssQuestions2017.class);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent = new Intent(KpssQuestion.this, KpssQuestions2016.class);
                    startActivity(intent);
                }


            }
        });




    }
}
