package com.example.hepsiosym.CALCULATIONS;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
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

public class DgsCalculations extends AppCompatActivity {
    Toolbar toolbar;
    TextView toolbarTitle;
    EditText trDogru,trYanlis,matDogru,matYanlis,obbasariPuani;
    TextView turkceNetSayisi,matematilNetSayisi,sayPuan,sozPuan,esitPuan,hesapSonuc;
    CheckBox dgscheckBox;
    GridLayout netSoonuc;
    Button hesapla,temizle;
    private AdView mAdView3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dgs_calculation);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("DGS PUAN HESAPLAMA");
        setSupportActionBar(toolbar);

        init();
        mAdView3 = findViewById(R.id.adView_dgs);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView3.loadAd(adRequest);


        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                double matDogruSayisi,matYanlisSayisi,matematikNet;
                double turkceDogruSayisi,turkceYanlisSayisi,turkceNet;
                double obp;
                double sayisalPuan,sozelPuan,esitPuani;




                if(trDogru.getText().toString().length() == 0 || trYanlis.getText().toString().length()== 0 || matDogru.getText().toString().length() == 0
                || matYanlis.getText().toString().length() == 0 || obbasariPuani.getText().toString().length() == 0)
                {
                    turkceNetSayisi.setText("0");
                    matematilNetSayisi.setText("0");
                    Toast.makeText(DgsCalculations.this, "Lütfen Boş Alanları Doldurunuz", Toast.LENGTH_SHORT).show();



                }
                else if (dgscheckBox.isChecked()==true)
                {

                    turkceDogruSayisi = Double.parseDouble(trDogru.getText().toString());
                    turkceYanlisSayisi = Double.parseDouble(trYanlis.getText().toString());
                    matDogruSayisi = Double.parseDouble(matDogru.getText().toString());
                    matYanlisSayisi = Double.parseDouble(matYanlis.getText().toString());
                    obp = Double.parseDouble(obbasariPuani.getText().toString());

                    turkceNet = turkceDogruSayisi-turkceYanlisSayisi/4;
                    matematikNet = matDogruSayisi-matYanlisSayisi/4;
                    matematilNetSayisi.setText(""+matematikNet);
                    turkceNetSayisi.setText(""+turkceNet);

                   sayisalPuan = 134.536 + (turkceNet*0.6) +(matematikNet*3) +(obp*0.45);
                   sozelPuan = 120.747 + (turkceNet*3) +(matematikNet*0.6) +(obp*0.45);
                    esitPuani = 136.642 + (turkceNet*1.8) +(matematikNet*1.8) +(obp*0.45);

                   sayPuan.setText(""+sayisalPuan);
                   sozPuan.setText(""+sozelPuan);
                   esitPuan.setText(""+esitPuani);

                    hesapSonuc.setVisibility(View.VISIBLE);
                    netSoonuc.setVisibility(View.VISIBLE);




                }
                else
                {
                    turkceDogruSayisi = Double.parseDouble(trDogru.getText().toString());
                    turkceYanlisSayisi = Double.parseDouble(trYanlis.getText().toString());
                    matDogruSayisi = Double.parseDouble(matDogru.getText().toString());
                    matYanlisSayisi = Double.parseDouble(matYanlis.getText().toString());
                    obp = Double.parseDouble(obbasariPuani.getText().toString());

                    turkceNet = turkceDogruSayisi-turkceYanlisSayisi/4;
                    matematikNet = matDogruSayisi-matYanlisSayisi/4;
                    matematilNetSayisi.setText(""+matematikNet);
                    turkceNetSayisi.setText(""+turkceNet);

                    sayisalPuan = 134.536 + (turkceNet*0.6) +(matematikNet*3) +(obp*0.6);
                    sozelPuan = 120.747 + (turkceNet*3) +(matematikNet*0.6) +(obp*0.6);
                    esitPuani = 136.642 + (turkceNet*1.8) +(matematikNet*1.8) +(obp*0.6);

                    sayPuan.setText(""+sayisalPuan);
                    sozPuan.setText(""+sozelPuan);
                    esitPuan.setText(""+esitPuani);

                    hesapSonuc.setVisibility(View.VISIBLE);
                    netSoonuc.setVisibility(View.VISIBLE);

                }


            }
        });

        temizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                turkceNetSayisi.setText("");
                matematilNetSayisi.setText("");
                sayPuan.setText("");
                sozPuan.setText("");
                esitPuan.setText("");
                trDogru.setText("");
                trYanlis.setText("");
                matDogru.setText("");
                matYanlis.setText("");
                obbasariPuani.setText("");
                netSoonuc.setVisibility(View.INVISIBLE);
                hesapSonuc.setVisibility(View.INVISIBLE);



            }
        });





    }

    public void init()
    {
        trDogru = findViewById(R.id.trDgsDogru);
        trYanlis = findViewById(R.id.trDgsYanlis);
        matDogru = findViewById(R.id.matDgsDogru);
        matYanlis = findViewById(R.id.matDgsYanlis);
        obbasariPuani = findViewById(R.id.basariPuani);
        turkceNetSayisi = findViewById(R.id.dgsSozelNet);
        matematilNetSayisi = findViewById(R.id.dgsSayisalNet);
        sayPuan = findViewById(R.id.dgsSayisalPuan);
        sozPuan = findViewById(R.id.sozelPuan);
        esitPuan = findViewById(R.id.dgsEsitPuan);
        hesapla = findViewById(R.id.dgsHesapla);
        temizle = findViewById(R.id.dgsTemizle);
        dgscheckBox = findViewById(R.id.dgsTik);
        netSoonuc = findViewById(R.id.netSonuclari);
        hesapSonuc = findViewById(R.id.hesaplamaSonucu);

        trDogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","60")});
        trYanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","60")});
        matDogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","60")});
        matYanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","60")});
        obbasariPuani.setFilters(new InputFilter[]{new InputFilterMinMax("0","80")});



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
