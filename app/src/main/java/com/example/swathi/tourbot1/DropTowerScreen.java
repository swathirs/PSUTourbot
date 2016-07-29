package com.example.swathi.tourbot1;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DropTowerScreen extends AppCompatActivity {
    Button pause_btn, end_tour_btn, chng_destn_btn, srch_website_btn, back_btn;
    MediaPlayer mp;
    int paused;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_tower_screen);
        addListenerOnButton();
    }
    public void addListenerOnButton() {

        final Context context = this;

       // pause_btn= (Button) findViewById(R.id.button_pause_drop_tower);
        end_tour_btn= (Button) findViewById(R.id.button_end_tour_drop_twr_screen);
        chng_destn_btn= (Button) findViewById(R.id.button_chng_destn_drp_twr_rsm_screen);
        srch_website_btn= (Button) findViewById(R.id.button_srch_web_drp_twr);
        //back_btn= (Button)findViewById(R.id.button_back_drop_tower);

        /*pause_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, DropTower_ResumeScreen.class);
                startActivity(intent);

            }

        });*/
        end_tour_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Screen7.class);
                startActivity(intent);

            }

        });
        srch_website_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pdx.edu"));
                startActivity(intent);

            }

        });
        chng_destn_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Screen4.class);
                startActivity(intent);

            }

        });

        back_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Screen4.class);
                startActivity(intent);

            }

        });
    }

    public void play_func(View view)
    {
        if(mp==null)
        {
            mp = MediaPlayer.create(this, R.raw.droptower);
            mp.start();
        }
        else if(!mp.isPlaying())
        {
            mp.seekTo(paused);
            mp.start();
        }

    }
    public  void stop_func(View view)
    {
        mp.release();
        mp = null;
    }
    public void pause_func(View view)
    {
        mp.pause();
        paused=mp.getCurrentPosition();
    }
}
