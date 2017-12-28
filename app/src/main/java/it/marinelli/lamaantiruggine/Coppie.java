package it.marinelli.lamaantiruggine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Coppie extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_coppie);

        WebView wv = (WebView) findViewById(R.id.navigazione);
        wv.loadUrl("https://www.lamaantiruggine.it/category/coppie");
    }
}
