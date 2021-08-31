package com.example.hepsiosym.CALCULATIONS;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.hepsiosym.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class YdsCalculations extends AppCompatActivity {

    Toolbar toolbar;
    TextView toolbarTitle;
    TextView  ydsPuani,ydsSeviseyi,ydsNeti,ydshesap;
    EditText dogru;
    GridLayout yds;
    Button ydsHesaplama,ydsTemizleme;

    private AdView mAdView5;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yds_calculation);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("YDS PUAN HESAPLAMA");
        setSupportActionBar(toolbar);

        init();

        mAdView5 = findViewById(R.id.adView_yds);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView5.loadAd(adRequest);
        ydsHesaplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double ydsDogruSayisi,ydstoplamNet,sonuc;

                if(dogru.getText().toString().length() == 0)
                {
                    Toast.makeText(YdsCalculations.this, "Lütfen Doğru Sayısını Giriniz", Toast.LENGTH_SHORT).show();
                    ydsPuani.setText("0");
                    ydsNeti.setText("0");
                }
                else
                {

                    ydsDogruSayisi = Double.parseDouble(dogru.getText().toString());


                    ydsNeti.setText(""+ydsDogruSayisi);


                    sonuc = ydsDogruSayisi*1.25;
                    ydsPuani.setText(""+sonuc);

                    if(sonuc<=100 && sonuc>=90)
                    {
                        ydsSeviseyi.setText("A");
                    }
                    else if(sonuc>=80 && sonuc<=89)
                    {
                        ydsSeviseyi.setText("B");
                    }
                    else if (sonuc>=70 && sonuc<=79)
                    {
                        ydsSeviseyi.setText("C");
                    }
                    else if(sonuc>=60 && sonuc<=69)
                    {
                        ydsSeviseyi.setText("D");
                    }
                    else if(sonuc>=50 && sonuc<=59)
                    {
                        ydsSeviseyi.setText("E");
                    }
                    else
                    {
                        ydsSeviseyi.setText("Barajı Geçemediniz");

                    }

                    ydshesap.setVisibility(View.VISIBLE);
                    yds.setVisibility(View.VISIBLE);


                }




            }
        });

        ydsTemizleme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dogru.setText("");
                ydsNeti.setText("");
                ydsPuani.setText("");
                ydsSeviseyi.setText("");
                ydshesap.setVisibility(View.INVISIBLE);
                yds.setVisibility(View.INVISIBLE);
            }
        });




    }

    public void init()
    {
        dogru = findViewById(R.id.ydsDogru);
        ydsNeti = findViewById(R.id.ydsnet);
        ydsPuani = findViewById(R.id.ydsPuan);
        ydsSeviseyi = findViewById(R.id.ydsSeviye);
        ydsHesaplama = findViewById(R.id.ydsHesapla);
        ydsTemizleme = findViewById(R.id.ydsTemizle);
        ydshesap = findViewById(R.id.ydsHesaplamaSonucu);
        yds = findViewById(R.id.ydsGrid);


        dogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","80")});


    }

    public class InputFilterMinMax implements InputFilter {

        private int min, max;

        public InputFilterMinMax(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public InputFilterMinMax(String min, String max) {
            this.min = Integer.parseInt(min);
            this.max = Integer.parseInt(max);
        }

        @Override
        public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
            try {
                int input = Integer.parseInt(dest.toString() + source.toString());
                if (isInRange(min, max, input))
                    return null;
            } catch (NumberFormatException nfe) { }
            return "";
        }

        private boolean isInRange(int a, int b, int c) {
            return b > a ? c >= a && c <= b : c >= b && c <= a;
        }
    }
}
