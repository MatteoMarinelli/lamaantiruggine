package it.marinelli.lamaantiruggine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Lifestyle extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lifestyle);

        WebView wv = (WebView) findViewById(R.id.navigazione);
        wv.loadUrl("https://www.lamaantiruggine.altervista.org/category/lifestyle");
    }
}
