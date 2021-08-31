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

public class Ales_2017 extends AppCompatActivity {

    ListView listView;
    String[] exams ={"2017 İlkbahar Dönemi","2017 Sonbahar Dönemi"};
    Toolbar toolbar;
    TextView toolbarTitle;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ales_ques_2017);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("ALES 2017 SORULARI");
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.listview);

        ListAdapter myadapter = new ArrayAdapter<String>(this, R.layout.row,exams);
        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position == 0)
                {
                    Intent intent = new Intent(Ales_2017.this, Ales_2017_ik.class);
                    startActivity(intent);

                }
                if(position==1)
                {
                    Intent intent = new Intent(Ales_2017.this,Ales_2017_sb.class);
                    startActivity(intent);
                }
            }
        });
    }
}
