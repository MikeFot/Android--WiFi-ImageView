package com.michaelfotiadis.wifiimageview.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import com.michaelfotiadis.wifiimageview.WiFiLevel;
import com.michaelfotiadis.wifiimageview.WifiImageView;

public class MainActivity extends AppCompatActivity {

    private WifiImageView imageView;
    private TextView textView;

    @Override
    public void onPause() {
        super.onPause();
        imageView.removeLevelChangedCallback();
    }

    @Override
    public void onResume() {
        super.onResume();
        activateWiFiView();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.image);
        textView = findViewById(R.id.content);
    }

    private void activateWiFiView() {
        imageView.setLevelChangedCallback(new WifiImageView.WifiLevelChangedCallback() {
            @Override
            public void onLevelChanged(WiFiLevel level) {
                setText(level);
            }
        });
    }

    private void setText(final WiFiLevel level) {
        final String description = String.format("<b>%s</b>", level.getDescription().toUpperCase());
        final Spanned formattedDescription = Html.fromHtml(description);
        textView.setText(formattedDescription);
    }

}
