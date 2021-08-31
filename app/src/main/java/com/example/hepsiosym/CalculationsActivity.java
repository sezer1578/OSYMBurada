package com.example.hepsiosym;

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

import com.example.hepsiosym.CALCULATIONS.AlesCalculations;
import com.example.hepsiosym.CALCULATIONS.DgsCalculations;
import com.example.hepsiosym.CALCULATIONS.DusCalculations;
import com.example.hepsiosym.CALCULATIONS.TusCalculations;
import com.example.hepsiosym.CALCULATIONS.YdsCalculations;
import com.example.hepsiosym.CALCULATIONS.YksCalculations;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class CalculationsActivity extends AppCompatActivity {

    ListView listView;

    String[] exams = {"YKS","DGS","ALES","YDS","TUS","DUS"};
    Toolbar toolbar;
    TextView toolbarTitle;
    private InterstitialAd mInterstitialAd2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculations_layout);



        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("PUAN HESAPLAMA");
        setSupportActionBar(toolbar);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mInterstitialAd2 = new InterstitialAd(this);
        mInterstitialAd2.setAdUnitId("ca-app-pub-7273254954010969/3288226634");
        mInterstitialAd2.loadAd(new AdRequest.Builder().build());

        mInterstitialAd2.setAdListener(new AdListener(){

            @Override
            public void onAdLoaded() {
                mInterstitialAd2.show();
                super.onAdLoaded();
            }
        });








        listView = findViewById(R.id.listview);

        ListAdapter myadapter = new ArrayAdapter<String>(this, R.layout.row,exams);
        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position==0)
                {
                    Intent intent = new Intent(CalculationsActivity.this, YksCalculations.class);
                    startActivity(intent);
                }
                if(position==1)
                {
                  Intent intent = new Intent(CalculationsActivity.this,DgsCalculations.class);
                    startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent = new Intent(CalculationsActivity.this, AlesCalculations.class);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent = new Intent(CalculationsActivity.this, YdsCalculations.class);
                    startActivity(intent);
                }
                if(position==4)
                {
                    Intent intent = new Intent(CalculationsActivity.this, TusCalculations.class);
                    startActivity(intent);
                }
                if(position==5)
                {
                    Intent intent = new Intent(CalculationsActivity.this, DusCalculations.class);
                    startActivity(intent);
                }


            }
        });



    }

}
