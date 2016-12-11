package com.totoro_fly.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MenuActivity extends AppCompatActivity {


    @Bind(R.id.menu_to_details_button)
    Button menuToDetailsButton;
    @Bind(R.id.menu_to_music_player_button)
    Button menuToMusicPlayerButton;
    @Bind(R.id.activity_menu)
    RelativeLayout activityMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.menu_to_details_button, R.id.menu_to_music_player_button})
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.menu_to_details_button:
                intent = new Intent(this, DetailsActivity.class);
                startActivity(intent);
                break;
            case R.id.menu_to_music_player_button:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
