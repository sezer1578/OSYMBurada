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

public class AlesCalculations extends AppCompatActivity {
    Toolbar toolbar;
    TextView toolbarTitle;
    EditText alesTrDogru,alesTrYanlis,alesMatDogru,alesMatYanlis;
    TextView alesTurkceNetSayisi,alesMatematikNetSayisi,alesSayPuan,alesSozPuan,alesEsitPuan,alesHesapSonuc;
    GridLayout alesNetSoonuc;
    Button alesHesaplama,alesTemizleme;
    private AdView mAdView4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ales_calculation);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("ALES PUAN HESAPLAMA");
        setSupportActionBar(toolbar);
        init();

        mAdView4 = findViewById(R.id.adView_ales);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView4.loadAd(adRequest);


        alesHesaplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                     double matDogru,matYanlis,turkceDogru,turkceYanlis;
                     double matematikNet,turkceNet;
                     double sayisalPuan,sozelPuan,esitPuan;

                     if(alesTrDogru.getText().toString().length() == 0 || alesTrYanlis.getText().toString().length() == 0 ||
                     alesMatDogru.getText().toString().length() == 0 || alesMatYanlis.getText().toString().length() == 0)
                     {

                         Toast.makeText(AlesCalculations.this, "Lütfen Boş Alanları Doldurunuz", Toast.LENGTH_SHORT).show();

                         alesMatematikNetSayisi.setText("0");
                         alesTurkceNetSayisi.setText("0");


                     }
                     else
                     {
                         turkceDogru = Double.parseDouble(alesTrDogru.getText().toString());
                         turkceYanlis = Double.parseDouble(alesTrYanlis.getText().toString());
                         matDogru = Double.parseDouble(alesMatDogru.getText().toString());
                         matYanlis = Double.parseDouble(alesMatYanlis.getText().toString());


                         turkceNet = turkceDogru-turkceYanlis/4;
                         matematikNet = matDogru-matYanlis/4;

                         alesTurkceNetSayisi.setText(""+turkceNet);
                         alesMatematikNetSayisi.setText(""+matematikNet);

                         sayisalPuan = 52 +(matematikNet*0.7) + (turkceNet/4);
                         sozelPuan = 52 +(matematikNet/4) +(turkceNet*0.7);
                         esitPuan = 50 +(matematikNet/2) +(turkceNet/2);

                         alesSayPuan.setText(""+sayisalPuan);
                         alesSozPuan.setText(""+sozelPuan);
                         alesEsitPuan.setText(""+esitPuan);

                         alesNetSoonuc.setVisibility(View.VISIBLE);
                         alesHesapSonuc.setVisibility(View.VISIBLE);






                     }


            }
        });

        alesTemizleme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alesTrDogru.setText("");
                alesTrYanlis.setText("");
                alesMatDogru.setText("");
                alesMatYanlis.setText("");
                alesTurkceNetSayisi.setText("");
                alesMatematikNetSayisi.setText("");
                alesSayPuan.setText("");
                alesSozPuan.setText("");
                alesEsitPuan.setText("");
                alesNetSoonuc.setVisibility(View.INVISIBLE);
                alesHesapSonuc.setVisibility(View.INVISIBLE);





            }
        });



    }

    public void init()
    {
        alesTrDogru = findViewById(R.id.trAlesDogru);
        alesTrYanlis = findViewById(R.id.trAlesYanlis);
        alesMatDogru = findViewById(R.id.matAlesDogru);
        alesMatYanlis = findViewById(R.id.matAlesYanlis);
        alesTurkceNetSayisi = findViewById(R.id.alesSozelNet);
        alesMatematikNetSayisi = findViewById(R.id.alesSayisalNet);
        alesSayPuan = findViewById(R.id.alesSayisalPuan);
        alesSozPuan = findViewById(R.id.alesSozelPuan);
        alesEsitPuan = findViewById(R.id.alesEsitPuan);
        alesNetSoonuc = findViewById(R.id.alesNetSonuclari);
        alesHesaplama = findViewById(R.id.alesHesapla);
        alesTemizleme = findViewById(R.id.alesTemizle);
        alesHesapSonuc = findViewById(R.id.alesHesaplamaSonucu);

        alesTrDogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","50")});
        alesTrYanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","50")});
        alesMatDogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","50")});
        alesMatYanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","50")});



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
