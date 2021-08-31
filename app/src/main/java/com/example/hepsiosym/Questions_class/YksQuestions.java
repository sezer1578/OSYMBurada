package com.example.hepsiosym.Questions_class;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



import com.example.hepsiosym.R;
import com.example.hepsiosym.YKS_Questions_2021.tyt_ayt_Question2021;
import com.example.hepsiosym.tyt_ayt_Question2018;
import com.example.hepsiosym.YKS_Questions_2020.tyt_ayt_Question2020;
import com.example.hepsiosym.tyt_ayt_Question_2019;

public class YksQuestions extends AppCompatActivity {
    ListView listView;
    String[] years = {"2021","2020","2019","2018"};
    Toolbar toolbar;
    TextView toolbarTitle;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yks_layout);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("YKS SINAVLARI");
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.listview_yks);

        ListAdapter myadapter = new ArrayAdapter<String>(this, R.layout.row,years);
        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position == 0)
                {
                    Intent intent = new Intent(YksQuestions.this, tyt_ayt_Question2021.class);
                    startActivity(intent);
                }
            if(position == 1)
            {
                Intent intent = new Intent(YksQuestions.this, tyt_ayt_Question2020.class);
                startActivity(intent);
            }
            if(position == 2)
            {
                Intent intent = new Intent(YksQuestions.this,tyt_ayt_Question_2019.class);
                startActivity(intent);
            }

                if(position == 3)
                {
                    Intent intent = new Intent(YksQuestions.this,tyt_ayt_Question2018.class);
                    startActivity(intent);
                }
            }
        });


    }
}
