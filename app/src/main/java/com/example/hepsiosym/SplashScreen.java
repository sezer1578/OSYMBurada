package com.example.hepsiosym;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdView;

public class SplashScreen extends AppCompatActivity {

    private TextView textView,textView2,textView3,textView4;
    private static int gecisSuresi = 1000;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        textView = findViewById(R.id.splahs_tex);
        textView2 = findViewById(R.id.splahs_tex1);
        textView3 = findViewById(R.id.splahs_tex2);
        textView4 = findViewById(R.id.splahs_tex3);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.animation);
        textView.startAnimation(animation);
        textView2.startAnimation(animation);
        textView3.startAnimation(animation);
        textView4.startAnimation(animation);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();


            }
        },gecisSuresi);




    }
}
