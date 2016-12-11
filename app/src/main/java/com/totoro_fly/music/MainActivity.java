package com.totoro_fly.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RelativeLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.main_to_menu_button)
    Button mainToMenuButton;
    @Bind(R.id.activity_main)
    RelativeLayout activityMain;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.main_to_menu_button)
    public void onClick() {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
