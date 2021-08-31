package com.example.hepsiosym.KpssQuestions_2016;

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

import com.example.hepsiosym.KpssQuestions_2018.Kpss_onlisans_2018;
import com.example.hepsiosym.R;

public class KpssQuestions2016 extends AppCompatActivity {

    ListView listView;
    String[] exams = {"Lisans(Genel Yetenek/Genel Kültür)","Lisans(Eğitim Bilimleri)","Lisans Alan Bilgisi (Pazar Sabah Oturumu) ","Lisans Alan Bilgisi (Pazar Öğleden Sonra Oturumu)",
    "ÖABT(Yabancı Dil (Almanca) Öğretmenliği)","ÖABT(Biyoloji Öğretmenliği)","ÖABT(Coğrafya Öğretmenliği)","ÖABT(Din Kültürü ve Ahlak Bilgisi Öğretmenliği)","ÖABT(Fen Bilimleri/Teknolojisi Öğretmenliği)",
            "ÖABT(Fizik Öğretmenliği)","ÖABT(Yabancı Dil(İngilizce) Öğretmenliği)","ÖABT(İlköğretim Matematik Öğretmenliği)","ÖABT(Kimya Öğretmenliği)","ÖABT(Matematik Lise Öğretmenliği)",
"ÖABT(Okul Öncesi Öğretmenliği)","ÖABT(Rehber Öğretmen)","ÖABT(Sınıf Öğretmenliği)","ÖABT(Sosyal Bilgiler Öğretmenliği)","ÖABT(Tarih Öğretmenliği)","ÖABT(Türk Dili ve Edebiyatı Öğretmenliği)",
"ÖABT(Türkçe Öğretmenliği)","DHBT(Lisans)","DHBT(Önlisans)","DHBT(Ortaöğretim)","Ortaöğretim Düzeyi","Lisans Düzeyi","Önlisans Düzeyi"

    };
    Toolbar toolbar;
    TextView toolbarTitle;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kpssques2016);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("KPSS 2016 SINAVLARI");
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.listview);

        ListAdapter myadapter = new ArrayAdapter<String>(this, R.layout.row,exams);
        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position==0)
                {
                    Intent intent = new Intent(KpssQuestions2016.this,Kpss_gygk_2016.class);
                    startActivity(intent);

                }
                    if(position==1)
                    {
                        Intent intent = new Intent(KpssQuestions2016.this,Kpss_egitim_2016.class);
                        startActivity(intent);
                    }
                    if(position==2)
                    {
                        Intent intent = new Intent(KpssQuestions2016.this,Kpss_lisansAlan1_2016.class);
                        startActivity(intent);
                    }
                    if(position==3)
                    {
                        Intent intent = new Intent(KpssQuestions2016.this,Kpss_lisanalan2_2016.class);
                        startActivity(intent);
                    }
                    if(position==4)
                    {
                        Intent intent = new Intent(KpssQuestions2016.this,Kpss_alm_2016.class);
                        startActivity(intent);
                    }
                    if(position==5)
                    {
                        Intent intent = new Intent(KpssQuestions2016.this,Kpss_bio_2016.class);
                        startActivity(intent);
                    }
                    if(position==6)
                    {
                        Intent intent = new Intent(KpssQuestions2016.this,Kpss_cog_2016.class);
                        startActivity(intent);
                    }
                    if(position==7)
                    {
                    Intent intent = new Intent(KpssQuestions2016.this,Kpss_din_2016.class);
                    startActivity(intent);
                }
                if(position==8)
                {
                    Intent intent = new Intent(KpssQuestions2016.this,Kpss_fen_2016.class);
                    startActivity(intent);
                }
                if(position==9)
                {
                    Intent intent = new Intent(KpssQuestions2016.this,Kpss_fizik_2016.class);
                    startActivity(intent);
                }
                if(position==10)
                {
                    Intent intent = new Intent(KpssQuestions2016.this,Kpss_ing_2016.class);
                    startActivity(intent);
                }
                if(position==11)
                {
                    Intent intent = new Intent(KpssQuestions2016.this,Kpss_ilkmat_2016.class);
                    startActivity(intent);
                }
                if(position==12)
                {
                    Intent intent = new Intent(KpssQuestions2016.this,Kpss_kimya_2016.class);
                    startActivity(intent);
                }
                if(position==13)
                {
                    Intent intent = new Intent(KpssQuestions2016.this,Kpss_matlise_2016.class);
                    startActivity(intent);
                }
                if(position==14)
                {
                    Intent intent = new Intent(KpssQuestions2016.this,Kpss_okulonce_2016.class);
                    startActivity(intent);
                }
                if(position==15)
                {
                    Intent intent = new Intent(KpssQuestions2016.this,Kpss_rehber_2016.class);
                    startActivity(intent);
                }
                if(position==16)
                {
                    Intent intent = new Intent(KpssQuestions2016.this,Kpss_sinif_2016.class);
                    startActivity(intent);
                }
                if(position==17)
                {
                    Intent intent = new Intent(KpssQuestions2016.this,Kpss_sosyal_2016.class);
                    startActivity(intent);
                }
                if(position==18)
                {
                    Intent intent = new Intent(KpssQuestions2016.this,Kpss_tarih_2016.class);
                    startActivity(intent);
                }
                if(position==19)
                {
                    Intent intent = new Intent(KpssQuestions2016.this,Kpss_turkdili_2016.class);
                    startActivity(intent);
                }
                if(position==20)
                {
                    Intent intent = new Intent(KpssQuestions2016.this,Kpss_turkce_2016.class);
                    startActivity(intent);
                }
                if(position==21)
                {
                    Intent intent = new Intent(KpssQuestions2016.this,Kpss_dhbtLisans_2016.class);
                    startActivity(intent);
                }
                if(position==22)
                {
                    Intent intent = new Intent(KpssQuestions2016.this, Kpss_dhbtOnlisans_2016.class);
                    startActivity(intent);
                }
                if(position==23)
                {
                    Intent intent = new Intent(KpssQuestions2016.this, Kpss_dhbtOrtaogretim_2016.class);
                    startActivity(intent);
                }
                if(position==24)
                {
                    Intent intent = new Intent(KpssQuestions2016.this, Kpss_orta_2016.class);
                    startActivity(intent);
                }
                if(position==25)
                {
                    Intent intent = new Intent(KpssQuestions2016.this, Kpss_lisans_2016.class);
                    startActivity(intent);
                }
                if(position==26)
                {
                    Intent intent = new Intent(KpssQuestions2016.this, Kpss_onlisans_2016.class);
                    startActivity(intent);
                }

            }
        });


    }
}
