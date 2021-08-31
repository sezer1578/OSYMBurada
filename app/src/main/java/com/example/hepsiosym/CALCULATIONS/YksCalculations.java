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
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.example.hepsiosym.R;

public class YksCalculations extends AppCompatActivity {
    Context context = this;
    Toolbar toolbar;
    TextView toolbarTitle;
    EditText turkceDogru,turkceYanlis,sosyalDogru,sosyalYanlis,temelMatDogru,temelMatYanlis,fenDogru,fenYanlis,turkdilDogru,turkdilYanlis;
    EditText tarih1Dogru,tarih1Yanlis,cografya1Dogru,cografya1Yanlis,tarih2Dogru,tarih2Yanlis,cograyfa2Dogru,cografya2Yanlis,felsefeDogru,felsefeYanlis;
    EditText dinDogru,dinYanlis,matDogru,matYanlis,fizikDogru,fizikYanlis,kimyaDogru,kimyaYanlis,biyolojiDogru,biyolojiYanlis,yabanciDilDogru,yabanciDilYanlis;
    EditText diplomaPuani;
    TextView turkceNetSayisi,sosyalNetSayisi,temelMatNetSayisi,fenNetSayisi,matematikNetSayisi,fizikNetSayisi,kimyaNetSayisi,biyolojiNetSayisi,dilNeti;
    TextView edebiyatNetSayisi,tarih1NetSayisi,cografya1NetSayisi,tarih2NetSayisi,cografya2NetSayisi,felsefeNetSayisi,dinNetSayisi;
    Button hesaplama,temizle;
    TextView tytPuani,yksSayPuani,yksEaPuani,yksSozPuani,yksDilPuani;
    TextView yksSay1,yksSoz1,yksEa1,yksDil1,tytPuani1;
    GridLayout tytNetgrid,tytPuangrid,aytNetgrid,aytPuangrid;
    TextView hesapsonucTxt,tytNetTxt,tytPuanTxt,aytNetTxt,aytPuanTxt;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yks_calculation);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("YKS PUAN HESAPLAMA");
        setSupportActionBar(toolbar);

        init();







        hesaplama.setOnClickListener(new View.OnClickListener() {
            double matDogruSayisi,matYanlisSayisi,matematikNet;
            double  fizikDogruSayisi,fizikYanlisSayisi,fizikNet;
            double saypuan,diplomaHesap;
            double  turkceDogruSayisi,turkceYanlisSayisi,sosyalDogruSayisi,sosyalYanlisSayisi,temelMatDogruSayisi,temelMatYanlisSayisi,fenDogruSayisi,fenYanlisSayisi;
            double turkceNet,sosyalNet,temelMatNet,fenNett,tarih2net,cog2net,dinnet,felsefenet;
            double  kimyaDogruSayisi,kimyaYanlisSayisi,kimyaNet,turkdilNet,tarih1Net,cografya1Net,biyolojiNet;
            double biyolojiDogruSayisi,biyolojiYanlisSayisi,diplomaPuan,dilDogruSAy,dilYanlisSAy;
            double turkdilDogruSay,turkdilYanliSay,tarih1DogruSay,tarih1YanlisSay,cografya1DogruSay,cografya1YanlisSay;
            double tarih2DogruSayisi,tarih2YanlisSayisi,cog2DogruSay,cog2YanlisSay,felsefeDogruSay,felsefeYanlisSay,dinDogruSay,dinYanlisSay;
            double tytPuanSonucu,yksSayPuanSonucu,yksEaPuanSonucu,yksSozPuanSonucu,yksDilSonucu,yabanciDilNet;
            double yksSAyPuan1,yksSozPuan1,yksEaPuan1,yksDilPuan1,tytPuanSonuc1;


            @Override
            public void onClick(View view) {




                if( turkceDogru.getText().toString().length() ==0 || turkceYanlis.getText().toString().length() ==0 ||sosyalDogru.getText().toString().length() == 0 || sosyalYanlis.getText().toString().length() == 0 ||
                temelMatDogru.getText().toString().length() == 0 || temelMatYanlis.getText().toString().length() == 0 || fenDogru.getText().toString().length()==0 || fenYanlis.getText().toString().length() == 0)
                {


                    turkceNetSayisi.setText("0");
                    sosyalNetSayisi.setText("0");
                    temelMatNetSayisi.setText("0");
                    fenNetSayisi.setText("0");


                }
                else
                {


                    sosyalDogruSayisi = Double.parseDouble(sosyalDogru.getText().toString());
                    sosyalYanlisSayisi = Double.parseDouble(sosyalYanlis.getText().toString());

                    sosyalNet = sosyalDogruSayisi - sosyalYanlisSayisi/4;
                    sosyalNetSayisi.setText(""+sosyalNet);

                    turkceDogruSayisi = Double.parseDouble(turkceDogru.getText().toString());
                    turkceYanlisSayisi = Double.parseDouble(turkceYanlis.getText().toString());

                    turkceNet = turkceDogruSayisi - turkceYanlisSayisi/4;
                    turkceNetSayisi.setText(""+turkceNet);

                    temelMatDogruSayisi = Double.parseDouble(temelMatDogru.getText().toString());
                    temelMatYanlisSayisi = Double.parseDouble(temelMatYanlis.getText().toString());

                    temelMatNet = temelMatDogruSayisi - temelMatYanlisSayisi/4;

                    temelMatNetSayisi.setText(""+temelMatNet);

                    fenDogruSayisi = Double.parseDouble(fenDogru.getText().toString());
                    fenYanlisSayisi = Double.parseDouble(fenYanlis.getText().toString());

                    fenNett = fenDogruSayisi-fenYanlisSayisi/4;
                    fenNetSayisi.setText(""+fenNett);

                }
                if(matDogru.getText().toString().length() == 0 || matYanlis.getText().toString().length() ==0 )
                {
                    matematikNetSayisi.setText("0");


                }
                else
                {


                    matDogruSayisi = Double.parseDouble(matDogru.getText().toString());
                    matYanlisSayisi = Double.parseDouble(matYanlis.getText().toString());

                    matematikNet = matDogruSayisi-matYanlisSayisi/4;

                    matematikNetSayisi.setText(""+matematikNet);
                }
                if (fizikDogru.getText().toString().length() == 0 ||fizikYanlis.getText().toString().length() == 0)
                {
                    fizikNetSayisi.setText("0");
                }
                else
                {

                    fizikDogruSayisi = Double.parseDouble(fizikDogru.getText().toString());
                    fizikYanlisSayisi = Double.parseDouble(fizikYanlis.getText().toString());

                    fizikNet = fizikDogruSayisi-fizikYanlisSayisi/4;

                    fizikNetSayisi.setText(""+fizikNet);
                }
                if (kimyaDogru.getText().toString().length() == 0 || fizikYanlis.getText().toString().length() == 0)
                {

                    kimyaNetSayisi.setText("0");

                }
                else
                {


                    kimyaDogruSayisi = Double.parseDouble(kimyaDogru.getText().toString());
                    kimyaYanlisSayisi = Double.parseDouble(kimyaYanlis.getText().toString());

                    kimyaNet = kimyaDogruSayisi-kimyaYanlisSayisi/4;

                    kimyaNetSayisi.setText(""+kimyaNet);
                }
                if (biyolojiDogru.getText().toString().length() == 0 || biyolojiYanlis.getText().toString().length() == 0)

                {

                    biyolojiNetSayisi.setText("0");

                }
                else
                {




                    biyolojiDogruSayisi = Double.parseDouble(biyolojiDogru.getText().toString());
                    biyolojiYanlisSayisi = Double.parseDouble(biyolojiYanlis.getText().toString());

                    biyolojiNet = biyolojiDogruSayisi-biyolojiYanlisSayisi/4;

                    biyolojiNetSayisi.setText(""+biyolojiNet);
                }

                if(turkdilDogru.getText().toString().length() == 0 || turkdilYanlis.getText().toString().length() == 0)

                {

                    edebiyatNetSayisi.setText("0");




                }
                else
                    {
                        turkdilDogruSay = Double.parseDouble(turkdilDogru.getText().toString());
                        turkdilYanliSay = Double.parseDouble(turkdilYanlis.getText().toString());

                        turkdilNet = turkdilDogruSay - turkdilYanliSay/4;

                        edebiyatNetSayisi.setText(""+turkdilNet);

                }
                if(tarih1Dogru.getText().toString().length() == 0 || tarih1Yanlis.getText().toString().length() == 0)
                {
                    tarih1NetSayisi.setText("0");
                }

                else
                {
                    tarih1DogruSay = Double.parseDouble(tarih1Dogru.getText().toString());
                    tarih1YanlisSay = Double.parseDouble(tarih1Yanlis.getText().toString());

                    tarih1Net = tarih1DogruSay-tarih1YanlisSay/4;

                    tarih1NetSayisi.setText(""+tarih1Net);

                }
                if(cografya1Dogru.getText().toString().length() == 0 ||cografya1Yanlis.getText().toString().length() == 0)
                {

                    cografya1NetSayisi.setText("0");
                }

                else
                {  cografya1DogruSay = Double.parseDouble(cografya1Dogru.getText().toString());
                    cografya1YanlisSay = Double.parseDouble(cografya1Yanlis.getText().toString());

                    cografya1Net = cografya1DogruSay -cografya1YanlisSay/4;

                    cografya1NetSayisi.setText(""+cografya1Net);

                }
                if(tarih2Dogru.getText().toString().length() == 0 || tarih2Yanlis.getText().toString().length() == 0)
                {
                    tarih2NetSayisi.setText("0");

                }
                else
                {
                    tarih2DogruSayisi = Double.parseDouble(tarih2Dogru.getText().toString());
                    tarih2YanlisSayisi = Double.parseDouble(tarih2Yanlis.getText().toString());

                    tarih2net = tarih2DogruSayisi - tarih2YanlisSayisi/4;

                    tarih2NetSayisi.setText(""+tarih2net);

                }
                if(cograyfa2Dogru.getText().toString().length() == 0 || cografya2Yanlis.getText().toString().length() == 0)
                {
                 cografya2NetSayisi.setText("0");

                }
                else
                {
                    cog2DogruSay = Double.parseDouble(cograyfa2Dogru.getText().toString());
                    cog2YanlisSay = Double.parseDouble(cografya2Yanlis.getText().toString());

                    cog2net = cog2DogruSay - cog2YanlisSay/4;
                    cografya2NetSayisi.setText(""+cog2net);

                }
                if(felsefeDogru.getText().toString().length() == 0 || felsefeYanlis.getText().toString().length() == 0)
                {
                    felsefeNetSayisi.setText("0");
                }
                else
                {
                    felsefeDogruSay = Double.parseDouble(felsefeDogru.getText().toString());
                    felsefeYanlisSay = Double.parseDouble(felsefeYanlis.getText().toString());

                    felsefenet = felsefeDogruSay - felsefeYanlisSay/4;
                    felsefeNetSayisi.setText(""+felsefenet);
                }
                if(dinDogru.getText().toString().length() == 0 || dinYanlis.getText().toString().length() == 0)
                {
                    dinNetSayisi.setText("0");
                }
                else
                {
                    dinDogruSay = Double.parseDouble(dinDogru.getText().toString());
                    dinYanlisSay = Double.parseDouble(dinYanlis.getText().toString());

                    dinnet = dinDogruSay - dinYanlisSay/4;
                    dinNetSayisi.setText(""+dinnet);
                }
                if(yabanciDilDogru.getText().toString().length() == 0 || yabanciDilYanlis.getText().toString().length() == 0)
                {
                    dilNeti.setText("0");

                }
                else
                {
                    dilDogruSAy = Double.parseDouble(yabanciDilDogru.getText().toString());
                    dilYanlisSAy = Double.parseDouble(yabanciDilYanlis.getText().toString());

                    yabanciDilNet = dilDogruSAy - dilYanlisSAy/4;
                    dilNeti.setText(""+yabanciDilNet);


                }
                if(diplomaPuani.getText().toString().length() == 0)
                {
                    Toast.makeText(context, "Lütfen Diploma Puanını Giriniz", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    diplomaPuan = Double.parseDouble(diplomaPuani.getText().toString());

                    diplomaHesap = diplomaPuan*0.6;
                    hesapsonucTxt.setVisibility(View.VISIBLE);
                    tytNetTxt.setVisibility(View.VISIBLE);
                    tytPuanTxt.setVisibility(View.VISIBLE);
                    aytNetTxt.setVisibility(View.VISIBLE);
                    aytPuanTxt.setVisibility(View.VISIBLE);
                    tytPuangrid.setVisibility(View.VISIBLE);
                    tytNetgrid.setVisibility(View.VISIBLE);
                    aytNetgrid.setVisibility(View.VISIBLE);
                    aytPuangrid.setVisibility(View.VISIBLE);

                }
                //AYT SAY Hesaplama
                yksSayPuanSonucu = +100 + diplomaHesap + (turkceNet*1.32) + (temelMatNet*1.32) + (sosyalNet*1.36) +(fenNett*1.36) + (matematikNet*3) + (fizikNet*2.85) + (kimyaNet*3.07) +(biyolojiNet*3.07);
                yksSayPuani.setText(""+yksSayPuanSonucu);

                yksSAyPuan1 =  100 + (turkceNet*1.32) + (temelMatNet*1.32) + (sosyalNet*1.36) +(fenNett*1.36) + (matematikNet*3) + (fizikNet*2.85) + (kimyaNet*3.07) +(biyolojiNet*3.07);;
                yksSay1.setText(""+yksSAyPuan1);


                //TYT Puan Hesaplama

                tytPuanSonucu =  +100 +diplomaHesap + (turkceNet*3.3) +(temelMatNet*3.3) + (sosyalNet*3.4) +(fenNett*3.4);
                tytPuani.setText(""+tytPuanSonucu);

                tytPuanSonuc1 =  +100  + (turkceNet*3.3) +(temelMatNet*3.3) + (sosyalNet*3.4) +(fenNett*3.4);
                tytPuani1.setText(""+tytPuanSonuc1);


                //AYT EA Hesaplama
                yksEaPuanSonucu = +100 + diplomaHesap + (turkceNet*1.32) + (temelMatNet*1.32) + (sosyalNet*1.36) +(fenNett*1.36) + (matematikNet*3) + (turkdilNet*3) +(tarih1Net*2.8) + (cografya1Net*3.33);
                yksEaPuani.setText(""+yksEaPuanSonucu);

                yksEaPuan1 = +100  + (turkceNet*1.32) + (temelMatNet*1.32) + (sosyalNet*1.36) +(fenNett*1.36) + (matematikNet*3) + (turkdilNet*3) +(tarih1Net*2.8) + (cografya1Net*3.33);
                yksEa1.setText(""+yksEaPuan1);

                //AYT SOZ Hesaplama
                yksSozPuanSonucu = +100 + diplomaHesap + (turkceNet*1.32) + (temelMatNet*1.32) + (sosyalNet*1.36) +(fenNett*1.36) + (turkdilNet*3) + (tarih1Net*2.8) + (cografya1Net*3.33) + (tarih2net*2.91) + (cog2net*2.91) + (felsefenet*3) +(dinnet*3.33);
                yksSozPuani.setText(""+yksSozPuanSonucu);

                yksSozPuan1 = +100  + (turkceNet*1.32) + (temelMatNet*1.32) + (sosyalNet*1.36) +(fenNett*1.36) + (turkdilNet*3) + (tarih1Net*2.8) + (cografya1Net*3.33) + (tarih2net*2.91) + (cog2net*2.91) + (felsefenet*3) +(dinnet*3.33);
                yksSoz1.setText(""+yksSozPuan1);

                //AYT DIL Hesaplama
                yksDilSonucu = +100 + diplomaHesap + (turkceNet*1.32) + (temelMatNet*1.32) + (sosyalNet*1.36) +(fenNett*1.36) + (yabanciDilNet*3);
                yksDilPuani.setText(""+yksDilSonucu);

                yksDilPuan1 = +100  + (turkceNet*1.32) + (temelMatNet*1.32) + (sosyalNet*1.36) +(fenNett*1.36) + (yabanciDilNet*3);
                yksDil1.setText(""+yksDilPuan1);



            }
        });

        temizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fenYanlis.setText("");
                turkceDogru.setText("");
                turkceYanlis.setText("");
                matDogru.setText("");
                matYanlis.setText("");
                sosyalDogru.setText("");
                sosyalYanlis.setText("");
                fenDogru.setText("");
                temelMatDogru.setText("");
                temelMatYanlis.setText("");
                turkdilDogru.setText("");
                turkdilYanlis.setText("");
                tarih1Dogru.setText("");
                tarih1Yanlis.setText("");
                cografya1Dogru.setText("");
                cografya1Yanlis.setText("");
                tarih2Dogru.setText("");
                tarih2Yanlis.setText("");
                cograyfa2Dogru.setText("");
                cografya2Yanlis.setText("");
                felsefeDogru.setText("");
                felsefeYanlis.setText("");
                dinDogru.setText("");
                dinYanlis.setText("");
                fizikDogru.setText("");
                fizikYanlis.setText("");
                kimyaDogru.setText("");
                kimyaYanlis.setText("");
                biyolojiDogru.setText("");
                biyolojiYanlis.setText("");
                yabanciDilDogru.setText("");
                yabanciDilYanlis.setText("");

                hesapsonucTxt.setVisibility(View.INVISIBLE);
                tytNetTxt.setVisibility(View.INVISIBLE);
                tytPuanTxt.setVisibility(View.INVISIBLE);
                aytNetTxt.setVisibility(View.INVISIBLE);
                aytPuanTxt.setVisibility(View.INVISIBLE);
                tytPuangrid.setVisibility(View.INVISIBLE);
                tytNetgrid.setVisibility(View.INVISIBLE);
                aytNetgrid.setVisibility(View.INVISIBLE);
                aytPuangrid.setVisibility(View.INVISIBLE);





            }
        });



    }

    public void init()

    {
        hesapsonucTxt = findViewById(R.id.yksHesapmaSonuclariTxt);
        tytNetTxt = findViewById(R.id.yksTytNetTxt);
        tytPuanTxt = findViewById(R.id.yksTytPuanTxt);
        aytNetTxt = findViewById(R.id.yksAytNetTxt);
        aytPuanTxt = findViewById(R.id.yksAytPuanTxt);
        tytPuangrid = findViewById(R.id.gridTytPuan);
        tytNetgrid = findViewById(R.id.gridTytNet);
        aytNetgrid = findViewById(R.id.gridAytNet);
        aytPuangrid = findViewById(R.id.gridAytPuan);
        tytPuani1 = findViewById(R.id.tytPuan1);
        yksSay1 = findViewById(R.id.yksSayPuan1);
        yksSoz1 = findViewById(R.id.yksSozPuan1);
        yksEa1 = findViewById(R.id.yksEaPuan1);
        yksDil1 = findViewById(R.id.yksDılPuan1);
        dilNeti = findViewById(R.id.yksYabanciDilNet);
        yksDilPuani = findViewById(R.id.yksDılPuan);
        yksSozPuani = findViewById(R.id.yksSozPuan);
        yksEaPuani = findViewById(R.id.yksEaPuan);
        yksSayPuani = findViewById(R.id.yksSayPuan);
        tytPuani = findViewById(R.id.tytPuan);
        dinNetSayisi = findViewById(R.id.dinNet);
        felsefeNetSayisi = findViewById(R.id.felsefeNet);
        cografya2NetSayisi = findViewById(R.id.cog2Net);
        tarih2NetSayisi = findViewById(R.id.tarih2Net);
        cografya1NetSayisi = findViewById(R.id.cografya1Net);
        tarih1NetSayisi = findViewById(R.id.tarih1Net);
        edebiyatNetSayisi = findViewById(R.id.edebiyatNet);
        biyolojiNetSayisi = findViewById(R.id.biyoNet);
        kimyaNetSayisi = findViewById(R.id.kimyaNet);
        fizikNetSayisi = findViewById(R.id.fizikNet);
        matematikNetSayisi = findViewById(R.id.matNet);
        fenNetSayisi = findViewById(R.id.fenNet);
        temelMatNetSayisi = findViewById(R.id.temelMatNet);
        sosyalNetSayisi = findViewById(R.id.sosyalNet);
        turkceNetSayisi = findViewById(R.id.trNet);
        turkceDogru =  findViewById(R.id.trDogru);
        turkceYanlis = findViewById(R.id.trYanlis);
        sosyalDogru =  findViewById(R.id.sosyalDogru);
        sosyalYanlis = findViewById(R.id.sosyalYanlis);
        temelMatDogru = findViewById(R.id.temelMatDogru);
        temelMatYanlis = findViewById(R.id.temelMatYanlis);
        fenDogru = findViewById(R.id.fenDogru);
        fenYanlis = findViewById(R.id.fenYanlis);
        turkdilDogru = findViewById(R.id.turkdilDogru);
        turkdilYanlis = findViewById(R.id.turkdilYanlis);
        tarih1Dogru = findViewById(R.id.tarih1Dogru);
        tarih1Yanlis = findViewById(R.id.tarih1Yanlis);
        cografya1Dogru = findViewById(R.id.cog1Dogru);
        cografya1Yanlis = findViewById(R.id.cog1Yanlis);
        diplomaPuani = findViewById(R.id.dipPuani);
        tarih2Dogru = findViewById(R.id.tarih2Dogru);
        tarih2Yanlis = findViewById(R.id.tarih2Yanlis);
        cograyfa2Dogru = findViewById(R.id.cog2Dogru);
        cografya2Yanlis = findViewById(R.id.cog2Yanlis);
        felsefeDogru = findViewById(R.id.felsefeDogru);
        felsefeYanlis = findViewById(R.id.felsefeYanlis);
        dinDogru = findViewById(R.id.dinDogru);
        dinYanlis = findViewById(R.id.dinYanlis);
        matDogru = findViewById(R.id.matDogru);
        matYanlis = findViewById(R.id.matYanlis);
        fizikDogru = findViewById(R.id.fizikDogru);
        fizikYanlis = findViewById(R.id.fizikYanlis);
        kimyaDogru = findViewById(R.id.kimyaDogru);
        kimyaYanlis = findViewById(R.id.kimyaYanlis);
        biyolojiDogru = findViewById(R.id.biyoDogru);
        biyolojiYanlis = findViewById(R.id.biyoYanlis);
        yabanciDilDogru = findViewById(R.id.yabanciDilDogru);
        yabanciDilYanlis = findViewById(R.id.yabanciDilYanlis);
        hesaplama = findViewById(R.id.btnHesapla);
        temizle = findViewById(R.id.btnTemizle);




        diplomaPuani.setFilters(new InputFilter[]{new InputFilterMinMax("0","100")});
        turkceDogru.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "40")});
        turkceYanlis.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "40")});
        sosyalDogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","20")});
        sosyalYanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","20")});
        temelMatDogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","40")});
        temelMatYanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","40")});
        fenDogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","20")});
        fenYanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","20")});
        turkdilDogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","24")});
        turkdilYanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","24")});
        tarih1Dogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","10")});
        tarih1Yanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","10")});
        cografya1Dogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","6")});
        cografya1Yanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","6")});
        tarih2Dogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","11")});
        tarih2Yanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","11")});
        cograyfa2Dogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","11")});
        cografya2Yanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","11")});
        felsefeDogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","12")});
        felsefeYanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","12")});
        dinDogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","6")});
        dinYanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","6")});
        matDogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","40")});
        matYanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","40")});
        fizikDogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","14")});
        fizikYanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","14")});
        kimyaDogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","13")});
        kimyaYanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","13")});
        biyolojiDogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","13")});
        biyolojiYanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","13")});
        yabanciDilDogru.setFilters(new InputFilter[]{new InputFilterMinMax("0","80")});
        yabanciDilYanlis.setFilters(new InputFilter[]{new InputFilterMinMax("0","80")});













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
