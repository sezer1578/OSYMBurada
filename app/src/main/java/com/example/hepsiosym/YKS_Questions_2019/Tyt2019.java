package com.example.hepsiosym.YKS_Questions_2019;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TintableCompoundDrawablesView;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.hepsiosym.R;

public class Tyt2019 extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tyt_2019);



        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        WebView webView = findViewById(R.id.webView);
        final ProgressBar progressBar = findViewById(R.id.progressBar);

        progressBar.setVisibility(View.VISIBLE);

        String url ="https://drive.google.com/file/d/16JitA09aKWx8VVhBbth6m9KsRsmhBPZ3/view?usp=sharing";
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_COMPATIBILITY_MODE);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);


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
