package com.example.hepsiosym;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;

import com.example.hepsiosym.BASEPOINTS.BasePoints;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;



public class MainActivity extends AppCompatActivity {

    Button btnQuestion,btnCalculate,btnBasePoints;
    Context context = this;
    Toolbar toolbar1;
    TextView toolbarTitle;

    private AdView mAdView;
    private AdView mAdView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mAdView1 = findViewById(R.id.adViewtop);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest1);
        init();
        haveStoragePermission();



        toolbar1.setTitle(" ");
        toolbarTitle.setText("ÖSYM BURADA");
        setSupportActionBar(toolbar1);





        btnQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(InternetKontrol()){
                    Intent intent = new Intent(context,QuestionActivity.class);
                    startActivity(intent);
                }
                else
                    {

                        buildDialog(MainActivity.this).show();




                        //Toast.makeText(context, "Lütfen İnternete Bağlanın", Toast.LENGTH_SHORT).show();


                    }



            }
        });

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calculationsIntent = new Intent(context,CalculationsActivity.class);
                startActivity(calculationsIntent);
            }
        });

        btnBasePoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(InternetKontrol()){
                    Intent intent = new Intent(context,BasePoints.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(context, "Lütfen İnternet Bağlantınızı Kontrol Ediniz", Toast.LENGTH_LONG).show();


                }
            }
        });



        }
    public boolean InternetKontrol() {
        ConnectivityManager manager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (manager.getActiveNetworkInfo() != null
                && manager.getActiveNetworkInfo().isAvailable()
                && manager.getActiveNetworkInfo().isConnected()) {
            return true;
        } else {
            return false;
        }
    }
    public AlertDialog.Builder buildDialog(Context c)  {

        AlertDialog.Builder builder = new AlertDialog.Builder(c);
        builder.setTitle("İnternet Bağlantısı Bulunamadı!");
        builder.setMessage("Çıkmış ÖSYM sorularını görebilmek için internet bağlantısı olması gerekmektedir.");
        builder.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        return builder;
    }

    public void init() {
        btnQuestion = findViewById(R.id.btnQuestion);
        btnCalculate = findViewById(R.id.btnCalculate);
        btnBasePoints = findViewById(R.id.btnBasePoints);
        toolbar1 = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.titleText);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if(keyCode == KeyEvent.KEYCODE_BACK) {

            AlertDialog.Builder alert = new AlertDialog.Builder(context);
            alert.setTitle("Uygulama kapatılsın mı?")
                    .setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();


                        }
                    }).setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();

                }
            }).create().show();

        }

        return super.onKeyDown(keyCode, event);
    }

    //kullanıcıdan yazma işi için izin alma fonksiyonumuz.
    public boolean haveStoragePermission() {

        //izin alma işlemi api level 23'den sonra geldiği için onu kontrol ediyoruz.
        if (Build.VERSION.SDK_INT >= 23) {

            //manifestteki izin kontrol ediliyor.
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {

                Log.e("Permission error", "You have permission");
                return true;
            } else {

                Log.e("Permission error", "You have asked for permission");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                return false;
            }
        }

        // kullanıcı 23'den eski bir sistem kullanıyorsa izin alma işlemi yapılmadan devam ediliyor.
        else {
            Log.e("Permission error", "You already have the permission");
            return true;
        }

    }
}

