package com.example.hepsiosym.YKS_Questions_2019;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hepsiosym.R;

public class Ydt_Rusca_2019 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ydt_rusca_2019);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        WebView webView = findViewById(R.id.ydtrusc19_webView);
        final ProgressBar progressBar = findViewById(R.id.ydtrus19_progressBar);

        progressBar.setVisibility(View.VISIBLE);

        String url ="https://drive.google.com/file/d/1gjuwkaFZ4EdJIAscGDtXCQTD7NG51ggj/view?usp=sharing";
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
