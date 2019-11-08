package com.example.appclass_hw06_activityjump;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout background;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        background = (LinearLayout) findViewById(R.id.layout_1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode == 1314){
            background.setBackgroundColor(Color.YELLOW);
            Log.d("Rui", "3191");
        }
    }

    public void BtnJumpToB(View view) {
        intent = new Intent(this, Main2Activity.class);
        Log.d("Rui", "ToBBB");
        startActivityForResult(intent, 1314);
        //startActivity(intent);
    }
}
