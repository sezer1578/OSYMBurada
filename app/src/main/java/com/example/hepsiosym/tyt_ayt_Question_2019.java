package com.example.hepsiosym;

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

import com.example.hepsiosym.YKS_Questions_2019.Ayt_2019;
import com.example.hepsiosym.YKS_Questions_2019.Ydt_Almanca_2019;
import com.example.hepsiosym.YKS_Questions_2019.Ydt_Arapca_2019;
import com.example.hepsiosym.YKS_Questions_2019.Ydt_Fransızca_2019;
import com.example.hepsiosym.YKS_Questions_2019.Ydt_Ingilizce_2019;
import com.example.hepsiosym.YKS_Questions_2019.Ydt_Rusca_2019;
import com.example.hepsiosym.YKS_Questions_2019.Tyt2019;

public class tyt_ayt_Question_2019 extends AppCompatActivity {
    ListView listView;
    String[] exams = {"TYT SORU VE CEVAPLARI", "AYT SORU VE CEVAPLARI", "YDT(ALMANCA)", "YDT(ARAPÇA)", "YDT(FRANSIZCA)", "YDT(İNGİLİZCE)", "YDT(RUSÇA)"};
    Toolbar toolbar;
    TextView toolbarTitle;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tyt_ayt_layout2019);


        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);

        toolbar.setTitle("");
        toolbarTitle.setText("YKS 2019 SORULARI");
        setSupportActionBar(toolbar);
        listView = findViewById(R.id.listview_tyt_ayt);

        ListAdapter myadapter = new ArrayAdapter<String>(this, R.layout.row, exams);
        listView.setAdapter(myadapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                  /*  Toast.makeText(tyt_ayt_Question_2019.this, "Sorular İndiriliyor(PDF)", Toast.LENGTH_LONG).show();

                    String url = tyt2019;
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
                    request.setDescription("HEPSİ ÖSYM");
                    request.setTitle("TYT 2019");


                    //dosyayı yazacağımız yer ve dosyanın ismine karar verebiliyoruz.
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "TYT_2019.pdf");

                    //download servisini çalıştırma ve kuyruğa alması
                    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                    manager.enqueue(request);
                    */
                    Intent intent = new Intent(tyt_ayt_Question_2019.this, Tyt2019.class);
                    startActivity(intent);


                }
                if (position == 1)
                {
                    Intent intent = new Intent(tyt_ayt_Question_2019.this, Ayt_2019.class);
                    startActivity(intent);

                }
                if (position == 2) {
                    Intent intent = new Intent(tyt_ayt_Question_2019.this, Ydt_Almanca_2019.class);
                    startActivity(intent);

                }
                if (position == 3) {
                    Intent intent = new Intent(tyt_ayt_Question_2019.this, Ydt_Arapca_2019.class);
                    startActivity(intent);

                }
                if (position == 4) {
                    Intent intent = new Intent(tyt_ayt_Question_2019.this, Ydt_Fransızca_2019.class);
                    startActivity(intent);


                }
                if (position == 5) {
                    Intent intent = new Intent(tyt_ayt_Question_2019.this, Ydt_Ingilizce_2019.class);
                    startActivity(intent);

                }
                if (position == 6) {
                    Intent intent = new Intent(tyt_ayt_Question_2019.this, Ydt_Rusca_2019.class);
                    startActivity(intent);


                }


            }
        });


    }




}
