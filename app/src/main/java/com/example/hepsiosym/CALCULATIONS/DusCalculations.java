package com.example.hepsiosym.CALCULATIONS;

import android.content.Context;
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
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.hepsiosym.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class DusCalculations extends AppCompatActivity {
    Toolbar toolbar;
    TextView toolbarTitle;
    Context context = this;
    GridLayout netGrid;

    EditText temelDogru,temelYanlis,klinikDogru,klinikYanlis;
    TextView temelNet,klinikNet,dusPuan,dusSonuc,hesaplaTxt;
    Button dusHesapla,dusTemizle;
    private AdView mAdView7;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dus_calculation);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("DUS PUAN HESAPLAMA");
        setSupportActionBar(toolbar);

        init();
        mAdView7= findViewById(R.id.adView_dus);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView7.loadAd(adRequest);

        dusHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                double temelDogruSayisi,temelYanlisSayisi,klinikDogruSayisi,klinikYanlisSayisi;
                double temelNetSonucu,klinikNetSonucu,dusPuani,dusSonucu;



                if(temelDogru.getText().toString().length() == 0 || temelYanlis.getText().toString().length() == 0 || klinikDogru.getText().toString().length() == 0 ||
                klinikYanlis.getText().toString().length() == 0)
                    
                {
                    temelNet.setText("0");
                    klinikNet.setText("0");

                    Toast.makeText(DusCalculations.this, "Lütfen Boş Alanları Doldurunuz", Toast.LENGTH_SHORT).show();
                    
                    
                }
                else
                {
                    temelDogruSayisi = Double.parseDouble(temelDogru.getText().toString());
                    temelYanlisSayisi = Double.parseDouble(temelYanlis.getText().toString());
                    klinikDogruSayisi = Double.parseDouble(klinikDogru.getText().toString());
                    klinikYanlisSayisi = Double.parseDouble(klinikYanlis.getText().toString());

                    temelNetSonucu = temelDogruSayisi -temelYanlisSayisi/4;
                    klinikNetSonucu = klinikDogruSayisi - klinikYanlisSayisi/4;

                    temelNet.setText(""+temelNetSonucu);
                    klinikNet.setText(""+klinikNetSonucu);

                    dusPuani = (temelNetSonucu*0.55) + (klinikNetSonucu*0.77);
                    dusPuan.setText(""+dusPuani);

 
                    if(dusPuani >= 45)
                    {
                        dusSonuc.setText("Baraj puanını geçtiniz.");

                    }
                    else
                    {
                        dusSonuc.setText("Baraj puanını geçemediniz!");
                    }

                    netGrid.setVisibility(View.VISIBLE);
                    hesaplaTxt.setVisibility(View.VISIBLE);



                }
                
                
            }
        });

        dusTemizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                netGrid.setVisibility(View.INVISIBLE);
                hesaplaTxt.setVisibility(View.INVISIBLE);
                temelDogru.setText("");
                temelYanlis.setText("");
                klinikDogru.setText("");
                klinikYanlis.setText("");


            }
        });



    }
    public void init()
    {

        temelDogru = findViewById(R.id.temelBilimlerDogruid);
        temelYanlis = findViewById(R.id.temelBilimlerYanlisid);
        klinikDogru = findViewById(R.id.klinikBilimlerDogruId);
        klinikYanlis = findViewById(R.id.klinikBilimlerYanlisid);
        temelNet = findViewById(R.id.temelBilimlerNetid);
        klinikNet = findViewById(R.id.klinikBilimlerNetid);
        dusPuan = findViewById(R.id.dusPanid);
        dusSonuc = findViewById(R.id.dusSonucid);
        dusHesapla = findViewById(R.id.dusHesaplaid);
        dusTemizle = findViewById(R.id.dusTemizleid);
        netGrid = findViewById(R.id.netGrid);
        hesaplaTxt = findViewById(R.id.dusHesapmaSonuclariTxt);

        temelDogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","40")});
        temelYanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","40")});
        klinikDogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","80")});
        klinikYanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","80")});



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
