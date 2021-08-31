package com.example.hepsiosym.BASEPOINTS;

import android.content.Context;
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
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class BasePoints extends AppCompatActivity {
    Toolbar toolbar;
    TextView toolbarTitle;
    ListView listView;
    String[] examNames = {"YKS(TABLO-3)","YKS(TABLO-4)","DGS","KPSS LİSANS","KPSS ÖNLİSANS","KPSS ORTAÖĞRETİM"};
    private InterstitialAd mInterstitialAd3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basepoints_layout);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("TABAN PUANLAR");
        setSupportActionBar(toolbar);



        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mInterstitialAd3 = new InterstitialAd(this);
        mInterstitialAd3.setAdUnitId("ca-app-pub-7273254954010969/4049330885");
        mInterstitialAd3.loadAd(new AdRequest.Builder().build());

        mInterstitialAd3.setAdListener(new AdListener(){

            @Override
            public void onAdLoaded() {
                mInterstitialAd3.show();
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
                    Intent intent = new Intent(BasePoints.this,YksBasePoints3.class);
                    startActivity(intent);
                }

                if(position==1)
                {
                    Intent intent = new Intent(BasePoints.this,YksBasePoints4.class);
                    startActivity(intent);
                }

                if(position==2)
                {
                    Intent intent = new Intent(BasePoints.this,DgsBasePoints.class);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent = new Intent(BasePoints.this,KpssLisansBasePoints.class);
                    startActivity(intent);
                }
                if(position==4)
                {
                    Intent intent = new Intent(BasePoints.this,KpssOnlisansBasePoints.class);
                    startActivity(intent);
                }
                if(position==5)
                {
                    Intent intent = new Intent(BasePoints.this,KpssOrtaBasePoints.class);
                    startActivity(intent);
                }


            }
        });


    }

}
