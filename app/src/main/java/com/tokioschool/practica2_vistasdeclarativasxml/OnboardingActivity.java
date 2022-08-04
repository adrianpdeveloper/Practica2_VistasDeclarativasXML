package com.tokioschool.practica2_vistasdeclarativasxml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

public class OnboardingActivity extends AppCompatActivity {

    private MaterialCardView onboarding_cv;
    private MaterialButton onboarding_next_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);


        binding();
        styling();
        listeners();
    }



    private void styling() {
        onboarding_cv.setBackgroundResource(R.drawable.onboarding_cardview_shape);
    }

    private void binding() {
        onboarding_cv = findViewById(R.id.onboarding_cardview);
        onboarding_next_btn = findViewById(R.id.onboarding_next_btn);
    }
    private void listeners() {
        onboarding_next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OnboardingActivity.this, HomeActivity.class));
            }
        });
    }
}