package it.marinelli.lamaantiruggine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Musica extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_musica);

        WebView wv = (WebView) findViewById(R.id.navigazione);
        wv.loadUrl("https://lamaantiruggine.altervista.org/category/musica");
    }
}
