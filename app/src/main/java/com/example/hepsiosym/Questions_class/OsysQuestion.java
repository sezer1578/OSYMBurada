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

import com.example.hepsiosym.OSYSQuestions2015.OsysQuestion2015;
import com.example.hepsiosym.OSYSQuestions2016.OsysQuestion2016;
import com.example.hepsiosym.OSYSQuestions2017.OsysQuestion2017;
import com.example.hepsiosym.R;

public class OsysQuestion extends AppCompatActivity {
    ListView listView;
    String[] years = {"2017","2016","2015"};
    Toolbar toolbar;
    TextView toolbarTitle;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ygs_layout);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("ÖSYS SINAVLARI");
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.listview_ygs);
        ListAdapter ygsAdapter = new ArrayAdapter<String>(this,R.layout.row,years);
        listView.setAdapter(ygsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position==0)
                {

                    Intent intent = new Intent(OsysQuestion.this, OsysQuestion2017.class);
                    startActivity(intent);
                }

                if(position==1)
                {

                    Intent intent = new Intent(OsysQuestion.this, OsysQuestion2016.class);
                    startActivity(intent);
                }
                if(position==2)
                {

                    Intent intent = new Intent(OsysQuestion.this, OsysQuestion2015.class);
                    startActivity(intent);
                }



            }
        });



    }
}
