package it.marinelli.lamaantiruggine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Cinema extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cinema);

        WebView wv = (WebView) findViewById(R.id.navigazione);
        wv.loadUrl("https://www.lamaantiruggine.altervista.org/category/cinema");
    }
}
