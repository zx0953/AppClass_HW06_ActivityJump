package com.example.appclass_hw06_activityjump;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {

    LinearLayout background2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        background2 = (LinearLayout) findViewById(R.id.layout_2);
        background2.setBackgroundColor(Color.BLACK);

    }
    public void BtnJumpToA(View view){
        setResult(1314);
        finish();
    }
}
