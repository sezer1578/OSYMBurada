package com.example.hepsiosym.KpssQuestions_2018;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.hepsiosym.R;

import java.util.ArrayList;

public class KpssQuestions2018 extends AppCompatActivity {

    ListView listView;
    String[] exams = {"Ortaöğretim","Önlisans","Lisans(Genel Yetenek/Genel Kültür)","Lisans(Eğitim Bilimleri)","Lisans(Kamu Yönetimi)","Lisans(Çalışma Eknomoisi ve Endüstri İlişkileri)",
    "Lisans(Uluslararası İlişkiler)","Lisans(Hukuk)","Lisans(İktisat)","Lisans(Maliye)","Lisans(İşletme)","Lisans(İstatistik)","Lisans(Muhasebe)",
    "Biyoloji Öğretmenliği","Coğrafya Öğretmenliği","Din Kültürü ve Ahlak Bilgisi Öğretmenliği","Fen Bilimleri Öğretmenliği","Fizik Öğretmenliği",
    "İlköğretim Matematik Öğretmenliği","Yabancı Dil(İngilizce) Öğretmenliği","Kimya Öğretmenliği","Matematik(Lise) Öğretmenliği","Okul Öncesi Öğretmenliği",
    "Rehber Öğretmen","Sınıf Öğretmenliği","Sosyal Bilgiler Öğretmenliği","Tarih Öğretmenliği","Türkçe Öğretmenliği","Türk Dili ve Edebilyatı Öğretmenliği",
    "Lisans(Din Hizmetleri)","Önlisans(Din Hizmetleri","Ortaöğretim(Din Hizmetleri)"};
    Toolbar toolbar;
    TextView toolbarTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kpss_que_2018);

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("KPSS 2018 SINAVLARI");
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.listview);

        ListAdapter myadapter = new ArrayAdapter<String>(this, R.layout.row,exams);
        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position==0)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_orta_2018.class);
                    startActivity(intent);
                }
                if(position==1)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_onlisans_2018.class);
                    startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_GyGk_2018.class);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_egitim_2018.class);
                    startActivity(intent);
                }
                if(position == 4)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_kamu_2018.class);
                    startActivity(intent);
                }
                if(position == 5)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_calisma_2018.class);
                    startActivity(intent);
                }
                if(position==6)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_ulus_2018.class);
                    startActivity(intent);
                }
                if(position==7)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_hukuk_2018.class);
                    startActivity(intent);
                }
                if(position==8)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_iktisat_2018.class);
                    startActivity(intent);
                }
                if(position==9)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_maliye_2018.class);
                    startActivity(intent);
                }
                if(position==10)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_isletme_2018.class);
                    startActivity(intent);
                }
                if(position==11)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_istatistik_2018.class);
                    startActivity(intent);
                }
                if(position==12)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_muhasebe_2018.class);
                    startActivity(intent);
                }
                if(position==13)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_biyo_2018.class);
                    startActivity(intent);
                }
                if(position==14)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_cog_2018.class);
                    startActivity(intent);

                }
                if(position==15)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_din_2018.class);
                    startActivity(intent);
                }
                if(position==16)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_fen_2018.class);
                    startActivity(intent);
                }
                if(position==17)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_fizik_2018.class);
                    startActivity(intent);
                }
                if(position==18)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_ilkmat_2018.class);
                    startActivity(intent);
                }
                if(position==19)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_ing_2018.class);
                    startActivity(intent);
                }
                if(position==20)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_kimya_2018.class);
                    startActivity(intent);
                }
                if(position==21)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_matlise_2018.class);
                    startActivity(intent);
                }
                if(position==22)
                {
                    Intent ıntent = new Intent(KpssQuestions2018.this,Kpss_okuloncesi_2018.class);
                    startActivity(ıntent);
                }
                if(position==23)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_rehber_2018.class);
                    startActivity(intent);
                }
                if(position==24)
                {
                    Intent intent = new Intent(KpssQuestions2018.this,Kpss_sinif_2018.class);
                    startActivity(intent);
                }
                if(position==25)
                {
                    Intent ıntent = new Intent(KpssQuestions2018.this,Kpss_sosyal_2018.class);
                    startActivity(ıntent);
                }
                if(position==26)
                {
                    Intent ıntent = new Intent(KpssQuestions2018.this,Kpss_tarih_2018.class);
                    startActivity(ıntent);
                }
                if(position==27)
                {
                    Intent ıntent = new Intent(KpssQuestions2018.this,Kpss_turkce_2018.class);
                    startActivity(ıntent);
                }
                if(position==28)
                {
                    Intent ıntent = new Intent(KpssQuestions2018.this,Kpss_turkdili_2018.class);
                    startActivity(ıntent);
                }
                if(position==29)
                {
                    Intent ıntent = new Intent(KpssQuestions2018.this,Kpss_dinhzmt_2018.class);
                    startActivity(ıntent);
                }
                if(position==30)
                {
                    Intent ıntent = new Intent(KpssQuestions2018.this,Kpss_dinhzmt2_2018.class);
                    startActivity(ıntent);
                }
                if(position==31)
                {
                    Intent ıntent = new Intent(KpssQuestions2018.this,Kpss_dinhzmt3_2018.class);
                    startActivity(ıntent);
                }











            }
        });






    }


}
