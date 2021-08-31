package com.example.hepsiosym;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.hepsiosym.Questions_class.AlesQuestion;
import com.example.hepsiosym.Questions_class.DgsQuestion;
import com.example.hepsiosym.Questions_class.DusQuestion;
import com.example.hepsiosym.Questions_class.KpssQuestion;
import com.example.hepsiosym.Questions_class.TusQuestion;
import com.example.hepsiosym.Questions_class.YdsQuestios;
import com.example.hepsiosym.Questions_class.OsysQuestion;
import com.example.hepsiosym.Questions_class.YksQuestions;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class QuestionActivity extends AppCompatActivity {
    Toolbar toolbar;
    TextView toolbarTitle;
    ListView listView;
    String[] examNames = {"YKS","DGS","ALES","KPSS","YDS","TUS","DUS","ÖSYS"};
    Context context = this;
    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);


        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("SORULAR");
        setSupportActionBar(toolbar);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7273254954010969/5163580939");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener(){

            @Override
            public void onAdLoaded() {
                mInterstitialAd.show();
                super.onAdLoaded();
            }
        });





        listView = findViewById(R.id.listview);

        ListAdapter myadapter = new ArrayAdapter<String>(this, R.layout.row,examNames);
        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position==0)
                {
                    Intent intent = new Intent(QuestionActivity.this, YksQuestions.class);
                    startActivity(intent);
                }
                if(position==1)
                {
                    Intent intent = new Intent(QuestionActivity.this, DgsQuestion.class);
                    startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent = new Intent(QuestionActivity.this, AlesQuestion.class);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent = new Intent(QuestionActivity.this, KpssQuestion.class);
                    startActivity(intent);
                }
                if(position==4)
                {
                    Intent intent = new Intent(QuestionActivity.this, YdsQuestios.class);
                    startActivity(intent);
                }
                if(position==5)
                {
                    Intent intent = new Intent(QuestionActivity.this, TusQuestion.class);
                    startActivity(intent);
                }
                if(position==6)
                {
                    Intent intent = new Intent(QuestionActivity.this, DusQuestion.class);
                    startActivity(intent);
                }
                if(position==7)
                {
                    Intent intent = new Intent(QuestionActivity.this, OsysQuestion.class);
                    startActivity(intent);
                }




            }
        });





    }


}
