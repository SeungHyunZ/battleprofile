package com.darkbluesharp.battleprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.darkbluesharp.battleprofile.R;

/*
 * 참고사이트1 : https://redmuffler.tistory.com/449
 * */

public class MainActivity extends AppCompatActivity {

    WebView webView, webView2, webView3, webView4;
    Button search_btn;
    EditText search_text, search_text2, search_text3, search_text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webview1);
        webView3 = (WebView) findViewById(R.id.webview3);
        webView4 = (WebView) findViewById(R.id.webview4);
        search_btn = (Button) findViewById(R.id.search_btn);
        search_text = (EditText) findViewById(R.id.search_text);
        search_text2 = (EditText) findViewById(R.id.search_text2);
        search_text3 = (EditText) findViewById(R.id.search_text3);
        search_text4 = (EditText) findViewById(R.id.search_text4);

        WebSettings webSettings = webView.getSettings(); //websetting은 캐시, 자바스크립트 등의 기능 설정
        webSettings.setAppCacheEnabled(true);

        WebSettings webSettings3 = webView3.getSettings(); //websetting은 캐시, 자바스크립트 등의 기능 설정
        webSettings3.setAppCacheEnabled(true);

        WebSettings webSettings4 = webView4.getSettings(); //websetting은 캐시, 자바스크립트 등의 기능 설정
        webSettings4.setAppCacheEnabled(true);



        //키보드 감추기
        try {
            InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (Exception e) {
            // TODO: handle exception
        }

        search_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String a1 = search_text.getText().toString();
                String a2 = search_text2.getText().toString();
                String a3 = search_text3.getText().toString();
                String a4 = search_text4.getText().toString();

                Toast.makeText(getApplicationContext(), a1, Toast.LENGTH_LONG).show();

                if(!"".equals(a1)) {
                    webView.loadUrl("https://dak.gg/profile/" + search_text.getText().toString());
                }
                if(!"".equals(a2)) {
                    webView2.loadUrl("https://dak.gg/profile/" + search_text2.getText().toString());
                }
                if(!"".equals(a3)) {
                    webView3.loadUrl("https://dak.gg/profile/" + search_text3.getText().toString());
                }
                if(!"".equals(a4)) {
                    webView4.loadUrl("https://dak.gg/profile/" + search_text4.getText().toString());
                }
                //키보드 감추기
                try {
                    InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {
                    // TODO: handle exception
                }

            }
        });


        webView.setWebViewClient(new WebViewClient() { //새 창이 뜨는것을 방지
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

        });

        webView3.setWebViewClient(new WebViewClient() { //새 창이 뜨는것을 방지
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

        });

        webView4.setWebViewClient(new WebViewClient() { //새 창이 뜨는것을 방지
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

        });

/*        webView.setOnTouchListener(new View.OnTouchListener(){ //터치이벤트 구현부
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Toast.makeText(getApplicationContext(), "click되었습니다.", Toast.LENGTH_LONG).show();
                return false;
            }

        });*/

        webView.loadUrl("https://dak.gg/profile/BongjangBongjang");//원하는 사이트 주소와 이름

        webView3.loadUrl("https://dak.gg/profile/skawkek");//원하는 사이트 주소와 이름

        webView4.loadUrl("https://dak.gg/profile/KKuni2");//원하는 사이트 주소와 이름

        //키보드 감추기
        try {
            InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (Exception e) {
            // TODO: handle exception
        }


        webView2 = (WebView) findViewById(R.id.webview2);

        WebSettings webSettings2 = webView2.getSettings(); //websetting은 캐시, 자바스크립트 등의 기능 설정
        webSettings2.setAppCacheEnabled(true);


        webView2.setWebViewClient(new WebViewClient() { //새 창이 뜨는것을 방지
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

        });

       /* webView2.setOnTouchListener(new View.OnTouchListener(){ //터치이벤트 구현부
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Toast.makeText(getApplicationContext(), "click되었습니다.", Toast.LENGTH_LONG).show();
                return false;
            }

        });*/

        webView2.loadUrl("https://dak.gg/profile/WhatTheHelicoper");//원하는 사이트 주소와 이름

        //키보드 감추기
        try {
            InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
