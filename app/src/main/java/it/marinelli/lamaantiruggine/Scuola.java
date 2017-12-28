package it.marinelli.lamaantiruggine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Scuola extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_scuola);

        WebView wv = (WebView) findViewById(R.id.navigazione);
        wv.loadUrl("https://www.lamaantiruggine.it/category/scuola");
    }
}
