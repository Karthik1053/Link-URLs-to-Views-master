package com.example.followme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView linkedin;
    Button insta;
    ImageView spot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tweet = findViewById(R.id.linkedin);
        insta = findViewById(R.id.instagram);
        spot = findViewById(R.id.spotify);

        tweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/in/-raghavapuram-karthik-reddy/");
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/__c_o_c_k_t_a_i_l_?igsh=c3g1MmRienFsNHU%3D&utm_source=qr");
            }
        });

        spot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://open.spotify.com/playlist/0VvoGtu86T0SfXbtwBYL1k?si=6AexomDHR7KhGuo7YUj7jA&nd=1");
            }
        });

        }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}