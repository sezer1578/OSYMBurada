package com.example.hepsiosym.OSYSQuestions2015;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hepsiosym.R;

public class kimya2015 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.osys);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        WebView webView = findViewById(R.id.webView);
        final ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);

        String url ="https://drive.google.com/file/d/1TAcf8TR90r7TpASp4hOH3GEWGr9ROi_5/view?usp=sharing";

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