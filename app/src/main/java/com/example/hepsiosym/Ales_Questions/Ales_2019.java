package com.example.hepsiosym.Ales_Questions;

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

public class Ales_2019 extends AppCompatActivity {
    ListView listView;
    String[] exams ={"2019 ALES/1(SAYISAL) ", "2019 ALES/1(SÖZEL)","2019 ALES/2","2019 ALES/3"};
    Toolbar toolbar;
    TextView toolbarTitle;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ales_ques_2019);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("ALES 2019 SORULARI");
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.listview);

        ListAdapter myadapter = new ArrayAdapter<String>(this, R.layout.row,exams);
        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position == 0)
                {
                    Intent intent = new Intent(Ales_2019.this, Ales_2019_1_say.class);
                    startActivity(intent);

                }
                if(position==1)
                {
                    Intent intent = new Intent(Ales_2019.this,Ales_2019_1_soz.class);
                    startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent = new Intent(Ales_2019.this,Ales_2019_2.class);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent = new Intent(Ales_2019.this,Ales_2019_3.class);
                    startActivity(intent);
                }
            }
        });


    }
}
