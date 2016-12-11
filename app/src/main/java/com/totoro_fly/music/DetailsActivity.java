package com.totoro_fly.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RelativeLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DetailsActivity extends AppCompatActivity {


    @Bind(R.id.details_to_menu_button)
    Button detailsToMenuButton;
    @Bind(R.id.activity_details)
    RelativeLayout activityDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.details_to_menu_button)
    public void onClick() {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
