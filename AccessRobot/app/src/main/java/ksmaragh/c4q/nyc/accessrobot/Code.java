package ksmaragh.c4q.nyc.accessrobot;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

public class Code extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);

        WebSettings wSettings;

        WebView webView = new WebView(this);
        webView.setClickable(true);
        wSettings = webView.getSettings();
        wSettings.setJavaScriptEnabled(true);

        webView.addJavascriptInterface(new myJsInterface(this), "Android");

        webView.loadUrl("file:///android_asset/blocklypageeditor/index.html");
        setContentView(webView);
    }

    public class myJsInterface {
        private Context con;

        public myJsInterface(Context con) {
            this.con = con;
        }

        @JavascriptInterface
        public void showToast(String mssg) {
            Toast.makeText(Code.this, "Did this work", Toast.LENGTH_SHORT).show();
        }
    }
}



