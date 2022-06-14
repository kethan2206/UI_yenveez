package com.example.ui_yenveez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class HomePage extends AppCompatActivity {

    LottieAnimationView homepagewave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        homepagewave= findViewById(R.id.homepageWaveBackground);
    }
}