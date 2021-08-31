package com.example.hepsiosym.KpssQuestions2019;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.hepsiosym.R;

public class KpssQuestions2019 extends AppCompatActivity {
    ListView listView;
    String[] exams ={"Lisans(Genel Yetenek/Genel Kültür)","Lisans(Eğitim Bilimleri)","Lisans(Kamu Yönetimi)","Lisans(Çalışma Eknomoisi ve Endüstri İlişkileri",
            "Lisans(Uluslararası İlişkiler)","Lisans(Hukuk)","Lisans(İktisat)","Lisans(Maliye)","Lisans(İşletme)","Lisans(İstatistik)","Lisans(Muhasebe)",
    "ÖABT(Türkçe Öğretmenliği)","ÖABT(İlköğretim Matematik Öğretmenliği)","ÖABT(Fen Bilimleri/Fen ve Teknoloji Öğretmenliği)","ÖABT(Sosyal Bilgiler Öğretmenliği)",
    "ÖABT(Türk Dili ve Edebiyatı Öğretmenliği)","ÖABT(Tarih Öğretmenliği)","ÖABT(Coğrafya Öğretmenliği)","ÖABT(Matematik Lise Öğretmenliği)",
    "ÖABT(Fizik Öğretmenliği)","ÖABT(Kimya Öğretmenliği)","ÖABT(Biyoloji Öğretmenliği)","ÖABT(Din Kültürü ve Ahlak Bilgisi Öğretmenliği)","ÖABT(Yabancı Dil(İngilizce) Öğretmenliği)",
    "ÖABT(Rehber Öğretmen)","ÖABT(Sınıf Öğretmenliği)","ÖABT(Okul Öncesi Öğretmenliği)","ÖABT(Beden Eğitimi Öğretmenliği)","ÖABT(İmam-Hatip Lisesi Meslek Dersleri Öğretmenliği)"} ;
    Toolbar toolbar;
    TextView toolbarTitle;
    EditText editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kpssques2016);


        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);



        toolbar.setTitle("");
        toolbarTitle.setText("KPSS 2019 SINAVLARI");
        setSupportActionBar(toolbar);


        listView = findViewById(R.id.listview);

        ListAdapter myadapter = new ArrayAdapter<String>(this, R.layout.row,exams);
        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position==0)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_gygk_2019.class);
                    startActivity(intent);
                }
                if(position==1)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_egitim_2019.class);
                    startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_kamu_2019.class);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_calisma_2019.class);
                    startActivity(intent);
                }
                if(position==4)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_ulus_2019.class);
                    startActivity(intent);
                }

                if(position==5)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_hukuk_2019.class);
                    startActivity(intent);
                }
                if(position==6)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_iktisat_2019.class);
                    startActivity(intent);
                }
                if(position==7)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_maliye_2019.class);
                    startActivity(intent);
                }
                if(position==8)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_isletme_2019.class);
                    startActivity(intent);
                }
                if(position==9)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_istatistik_2019.class);
                    startActivity(intent);
                }
                if(position==10)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_muhasebe_2019.class);
                    startActivity(intent);
                }
                if(position==11)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_turkce_2019.class);
                    startActivity(intent);
                }
                if(position==12)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_ilkmat_2019.class);
                    startActivity(intent);
                }
                if(position==13)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_fen_2019.class);
                    startActivity(intent);
                }
                if(position==14)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_sosyal_2019.class);
                    startActivity(intent);
                }
                if(position==15)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_turkdil_2019.class);
                    startActivity(intent);
                }
                if(position==16)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_tarih_2019.class);
                    startActivity(intent);
                }
                if(position==17)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_cografya_2019.class);
                    startActivity(intent);
                }
                if(position==18)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_matlise_2019.class);
                    startActivity(intent);
                }
                if(position==19)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_fizik_2019.class);
                    startActivity(intent);
                }
                if(position==20)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_kimya_2019.class);
                    startActivity(intent);
                }
                if(position==21)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_biyo_2019.class);
                    startActivity(intent);
                }
                if(position==22)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_din_2019.class);
                    startActivity(intent);
                }
                if(position==23)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_ing_2019.class);
                    startActivity(intent);
                }
                if(position==24)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_rehber_2019.class);
                    startActivity(intent);
                }
                if(position==25)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_sinif_2019.class);
                    startActivity(intent);
                }
                if(position==26)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_okuloncesi_2019.class);
                    startActivity(intent);
                }
                if(position==27)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_beden_2019.class);
                    startActivity(intent);
                }
                if(position==28)
                {
                    Intent intent = new Intent(KpssQuestions2019.this,Kpss_imamhatip_2019.class);
                    startActivity(intent);
                }




            }
        });
    }
}
