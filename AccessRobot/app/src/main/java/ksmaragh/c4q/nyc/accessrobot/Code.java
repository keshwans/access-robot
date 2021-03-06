package ksmaragh.c4q.nyc.accessrobot;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
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

        webView.loadUrl("file:///android_asset/blockly/blockly.html");
        setContentView(webView);
    }

    public class myJsInterface {
        private Context con;

        public myJsInterface(Context con) {
            this.con = con;
        }

        @JavascriptInterface
        public void showToast(String mssg) {
            Toast.makeText(Code.this, mssg, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.controller) {
            Intent demo = new Intent(this, DemoActivity.class);
            startActivity(demo);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}



