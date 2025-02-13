package com.example.appanimation;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textAnim;
Button btnTranslate, btnAlpha, btnRotate, btnScale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textAnim=findViewById(R.id.textAnim);
        btnTranslate=findViewById(R.id.btntranslate);
        btnAlpha=findViewById(R.id.btnAlpha);
        btnRotate=findViewById(R.id.btnrotate);
        btnScale=findViewById(R.id.btnscale);

        Animation move = AnimationUtils.loadAnimation(this,R.anim.move);
        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textAnim.startAnimation(move);
            }
        });
        Animation alpha= AnimationUtils.loadAnimation(this,R.anim.alpha);

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textAnim.startAnimation(alpha);
            }
        });


        Animation rotate= AnimationUtils.loadAnimation(this,R.anim.rotate);
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textAnim.startAnimation(rotate);
            }
        });



        Animation scale= AnimationUtils.loadAnimation(this,R.anim.scale);
        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textAnim.startAnimation(scale);
            }
        });
    }
}