package com.example.hepsiosym.YKS_Questions_2018;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hepsiosym.R;

public class Ydt_Fransızca_2018 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ydt_fra_2018);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        WebView webView = findViewById(R.id.webView);
        final ProgressBar progressBar = findViewById(R.id.progressBar);

        progressBar.setVisibility(View.VISIBLE);

        String url ="https://drive.google.com/file/d/1fzuCQ8gHHA8Srbz2GkPWiHc4q_noyJwh/view?usp=sharing";
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);

        webView.setWebChromeClient(new WebChromeClient(){


            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);

                //getSupportActionBar().setTitle("Yükleniyor...");
                if(newProgress==100)
                {
                    progressBar.setVisibility(View.GONE);
                    // getSupportActionBar().setTitle(R.string.app_name);







                }
            }
        });
        webView.loadUrl(url);
    }
}
