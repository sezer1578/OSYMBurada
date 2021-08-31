package com.example.hepsiosym.KpssQuestions_2017;

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

public class KpssQuestions2017 extends AppCompatActivity {

    ListView listView;
    String[] exams = {"Genel Yetenek/Genel Kültür","Eğitim Bilimleri","Kamu Yönetimi","Çalışma Ekonomisi ve Endüstri ilişkileri","Uluslararası İlişkiler",
    "Hukuk","İktisat","Maliye","İşletme","İstatistik","Muhasebe","ÖABT(Biyoloji Öğretmenliği)","ÖABT(Coğrafya Öğretmenliği)","ÖABT(Din Kültürü ve Ahlak Bilgisi Öğretmenliği)",
    "ÖABT(Fen Bilimleri/Teknolojisi Öğretmenliği)","ÖABT(Fizik Öğretmenliği)","ÖABT(İlköğretim Matematik Öğretmenliği)","ÖABT(Yabancı Dil(İngilizce) Öğretmenliği)",
     "ÖABT(Kimya Öğretmenliği)","ÖABT(Lise Matematik Öğretmenliği","ÖABT(Okul Öncesi Öğretmenliği)","ÖABT(Rehber Öğretmen)","ÖABT(Sınıf Öğretmenliği)",
      "ÖABT(Sosyal Bilgiler Öğretmenliği)","ÖABT(Tarih Öğretmenliği)","ÖABT(Türkçe Öğretmenliği)","ÖABT(Türk Dili ve Edebiyatı Öğretmenliği)"

    };
    Toolbar toolbar;
    TextView toolbarTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kpssquestions2017);


        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("KPSS 2017 SINAVLARI");
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.listview);

        ListAdapter myadapter = new ArrayAdapter<String>(this, R.layout.row,exams);
        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position==0)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_GyGk_2017.class);
                    startActivity(intent);
                }
                if(position==1)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_egitim_2017.class);
                    startActivity(intent);

                }
                if(position==2)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_kamu_2017.class);
                    startActivity(intent);

                }
                if(position==3)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_calisma_2017.class);
                    startActivity(intent);
                }
                if(position==4)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_ulus_2017.class);
                    startActivity(intent);
                }
                if(position==5)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_hukuk_2017.class);
                    startActivity(intent);
                }
                if(position==6)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_iktisat_2017.class);
                    startActivity(intent);
                }
                if(position==7)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_maliye_2017.class);
                    startActivity(intent);
                }
                if(position==8)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_isletme_2017.class);
                    startActivity(intent);
                }
                if(position==9)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_istatistik_2017.class);
                    startActivity(intent);
                }
                if(position==10)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_muhasebe_2017.class);
                    startActivity(intent);
                }
                if(position==11)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_biyo_2017.class);
                    startActivity(intent);
                }
                if(position==12)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_cog_2017.class);
                    startActivity(intent);
                }
                if(position==13)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_din_2017.class);
                    startActivity(intent);
                }
                if(position==14)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_fen_2017.class);
                    startActivity(intent);
                }
                if(position==15)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_fizik_2017.class);
                    startActivity(intent);
                }
                if(position==16)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_ilkmat_2017.class);
                    startActivity(intent);
                }
                if(position==17)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_ing_2017.class);
                    startActivity(intent);
                }
                if(position==18)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_kimya_2017.class);
                    startActivity(intent);
                }
                if(position==19)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_matlise_2017.class);
                    startActivity(intent);
                }
                if(position==20)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_okulonce_2017.class);
                    startActivity(intent);

                }
                if(position==21)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_rehber_2017.class);
                    startActivity(intent);

                }
                if(position==22)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_sinif_2017.class);
                    startActivity(intent);

                }
                if(position==23)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_sosyal_2017.class);
                    startActivity(intent);

                }
                if(position==24)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_tarih_2017.class);
                    startActivity(intent);

                }
                if(position==25)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_turkce_2017.class);
                    startActivity(intent);

                }
                if(position==26)
                {
                    Intent intent = new Intent(KpssQuestions2017.this,Kpss_turkdili_2017.class);
                    startActivity(intent);

                }



            }
        });




    }
}
