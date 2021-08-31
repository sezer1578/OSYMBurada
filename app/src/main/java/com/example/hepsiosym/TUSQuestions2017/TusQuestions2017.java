package com.example.hepsiosym.TUSQuestions2017;

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

public class TusQuestions2017 extends AppCompatActivity {

    ListView listView;
    String[] exams ={"İlkbahar Dönemi Temel Tıp Bilimleri","İlkbahar Dönemi Klinik Tıp Bilimleri","Sonbahar Dönemi Temel Tıp Bilimleri","Sonbahar Dönemi Klinik Tıp Bilimleri"};
    Toolbar toolbar;
    TextView toolbarTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tus_ques);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("TUS 2017 SINAVLARI");
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.listview);

        ListAdapter myadapter = new ArrayAdapter<String>(this, R.layout.row,exams);
        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position==0)
                {
                    Intent intent = new Intent(TusQuestions2017.this, Tıpilk_2017.class);
                    startActivity(intent);
                }
                if(position==1)
                {
                    Intent intent = new Intent(TusQuestions2017.this, Klinikilk_2017.class);
                    startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent = new Intent(TusQuestions2017.this, TıpSon_2017.class);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent = new Intent(TusQuestions2017.this, KlinikSon_2017.class);
                    startActivity(intent);
                }



            }
        });


    }
}
