package com.example.animationsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ViewPropertyAnimator animater = imageView.animate();
                animater.setDuration(3000);
                animater.rotation(360.0f * 5.0f);
            }
        });
    }
}