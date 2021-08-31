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

public class TusCalculations extends AppCompatActivity {

    Toolbar toolbar;
    TextView toolbarTitle;
    TextView temelTıpNet,klinikTıpNet, kPuan, tPuan,k2Puan,ailePuani;
    EditText temelTıpDogru, temelTıpYanlis,klinikTıpDogru,klinikTıpYanlis;
    TextView hesaplamaSonucTxt, mezun1txt,mezun2txt;
    GridLayout netGrid,puan1Grid,puan2Grid;
    Button tipHesapla,tipTemizle;

    private AdView mAdView6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tus_calculation);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("TUS PUAN HESAPLAMA");
        setSupportActionBar(toolbar);

        init();
        mAdView6 = findViewById(R.id.adView_tus);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView6.loadAd(adRequest);

        tipHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double temeltipDogruSayisi,temelTipYanlisSayisi,klinikTipDogruSayisi,klinikTipYanlisSayisi;
                double temelNetSonucu,klinikNetSonucu, k1Puan,t1Puan,aPuan,k2Puani;

                if(temelTıpDogru.getText().toString().length() == 0 || temelTıpYanlis.getText().toString().length() == 0 || klinikTıpDogru.getText().toString().length() == 0 ||

                klinikTıpYanlis.getText().toString().length() == 0)
                {

                    temelTıpNet.setText("0");
                    klinikTıpNet.setText("0");

                    Toast.makeText(TusCalculations.this, "Lütfen Boş Alanları Doldurunuz", Toast.LENGTH_SHORT).show();

                }
                else
                {

                    temeltipDogruSayisi = Double.parseDouble(temelTıpDogru.getText().toString());
                    temelTipYanlisSayisi = Double.parseDouble(temelTıpYanlis.getText().toString());
                    klinikTipDogruSayisi = Double.parseDouble(klinikTıpDogru.getText().toString());
                    klinikTipYanlisSayisi = Double.parseDouble(klinikTıpYanlis.getText().toString());

                    temelNetSonucu = temeltipDogruSayisi -temelTipYanlisSayisi/4;
                    klinikNetSonucu = klinikTipDogruSayisi -klinikTipYanlisSayisi/4;

                    temelTıpNet.setText(""+temelNetSonucu);
                    klinikTıpNet.setText(""+klinikNetSonucu);

                    k1Puan =   (temelNetSonucu*0.4) + (klinikNetSonucu*0.4);
                    kPuan.setText(""+k1Puan);
                    t1Puan =  (temelNetSonucu*0.5) + (klinikNetSonucu*0.3);

                    tPuan.setText(""+t1Puan);

                    aPuan = klinikNetSonucu*0.84;
                    ailePuani.setText(""+aPuan);

                    k2Puani = temelNetSonucu*0.83;
                    k2Puan.setText(""+k2Puani);


                    hesaplamaSonucTxt.setVisibility(View.VISIBLE);
                    mezun1txt.setVisibility(View.VISIBLE);
                    mezun2txt.setVisibility(View.VISIBLE);
                    netGrid.setVisibility(View.VISIBLE);
                    puan1Grid.setVisibility(View.VISIBLE);
                    puan2Grid.setVisibility(View.VISIBLE);



                }

            }
        });

        tipTemizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                hesaplamaSonucTxt.setVisibility(View.INVISIBLE);
                mezun1txt.setVisibility(View.INVISIBLE);
                mezun2txt.setVisibility(View.INVISIBLE);
                netGrid.setVisibility(View.INVISIBLE);
                puan1Grid.setVisibility(View.INVISIBLE);
                puan2Grid.setVisibility(View.INVISIBLE);
                temelTıpDogru.setText("");
                temelTıpYanlis.setText("");
                klinikTıpYanlis.setText("");
                klinikTıpDogru.setText("");
            }
        });





    }




    public void init()

    {

        temelTıpDogru = findViewById(R.id.temelTıpDogruId);
        temelTıpYanlis = findViewById(R.id.temelTıpYanlisId);
        klinikTıpDogru = findViewById(R.id.klinikTıpDogruId);
        klinikTıpYanlis = findViewById(R.id.klinikTıpYanlisId);
        temelTıpNet = findViewById(R.id.temelTıpNetid);
        klinikTıpNet = findViewById(R.id.klinikTıpNetid);
        kPuan = findViewById(R.id.kPuaniid);
        tPuan = findViewById(R.id.tPuaniid);
        ailePuani = findViewById(R.id.ailePuanid);
        k2Puan = findViewById(R.id.k2Puanid);
        tipHesapla = findViewById(R.id.tıpHesapla);
        tipTemizle = findViewById(R.id.tipTemizle);
        hesaplamaSonucTxt = findViewById(R.id.tusHesapmaSonuclariTxt);
        mezun1txt = findViewById(R.id.mezun1Txt);
        mezun2txt = findViewById(R.id.mezun2Txt);
        netGrid = findViewById(R.id.netGrid);
        puan1Grid = findViewById(R.id.puan1Grid);
        puan2Grid = findViewById(R.id.puan2Grid);

        temelTıpDogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","120")});
        temelTıpYanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","120")});
        klinikTıpDogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","120")});
        klinikTıpYanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","120")});


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
            } catch (NumberFormatException nfe) {
            }
            return "";
        }

        private boolean isInRange(int a, int b, int c) {
            return b > a ? c >= a && c <= b : c >= b && c <= a;
        }
    }
}
