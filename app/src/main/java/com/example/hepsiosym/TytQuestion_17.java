package com.example.hepsiosym;

import android.Manifest;
import android.app.DownloadManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;



public class TytQuestion_17 extends AppCompatActivity {

    //indirilecek dosyamızın url'sini tutacak String
    private String indirilecekDosyaYolu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.tyt17_layout);

         //xml dosyamızda tanımladığımız button ve imageview'i tanımladık.
        Button btnDosyayiIndir = findViewById(R.id.buttonIndir);

        //String'e url yi yazıyoruz. Burada siz uygulamanıza göre gereken url'yi atayacaksınız.
        indirilecekDosyaYolu = "https://dokuman.osym.gov.tr/pdfdokuman/2018/YKS/TYT_01072018.pdf";


        //uygulama ilk açıldığında dosyayı telefona kaydetmek için izin alacağımız fonksiyon.
        haveStoragePermission();

        //indir butonuna tıklandığında olacaklar.
        btnDosyayiIndir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = indirilecekDosyaYolu;
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
                request.setDescription("HEPSİ ÖSYM");
                request.setTitle("TYT 2018");


                //dosyayı yazacağımız yer ve dosyanın ismine karar verebiliyoruz.
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "TYT_2018.pdf");

                //download servisini çalıştırma ve kuyruğa alması
                DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                manager.enqueue(request);
            }
        });
    }

    //kullanıcıdan yazma işi için izin alma fonksiyonumuz.
    public  boolean haveStoragePermission() {

        //izin alma işlemi api level 23'den sonra geldiği için onu kontrol ediyoruz.
        if (Build.VERSION.SDK_INT >= 23) {

            //manifestteki izin kontrol ediliyor.
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {

                Log.e("Permission error","You have permission");
                return true;
            } else {

                Log.e("Permission error","You have asked for permission");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                return false;
            }
        }

        // kullanıcı 23'den eski bir sistem kullanıyorsa izin alma işlemi yapılmadan devam ediliyor.
        else {
            Log.e("Permission error","You already have the permission");
            return true;
        }

    }
}
