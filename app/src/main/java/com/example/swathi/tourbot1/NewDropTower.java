package com.example.swathi.tourbot1;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewDropTower extends AppCompatActivity {
    Button pause_btn, end_tour_btn, chng_destn_btn, srch_website_btn, back_btn, ask_qstn;
    int paused;

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_drop_tower);
        addListenerOnButton();

    }
    public void addListenerOnButton() {

        final Context context = this;
        //pause_btn= (Button) findViewById(R.id.button_pause_data_center);
        end_tour_btn= (Button) findViewById(R.id.button_end_tour_drop_tower);
        chng_destn_btn = (Button)findViewById(R.id.button_chng_destn_drop_tower);
        srch_website_btn = (Button)findViewById(R.id.button_srch_web_drop_tower);
        back_btn= (Button)findViewById(R.id.button_back_new_drop_tower);
        ask_qstn= (Button)findViewById(R.id.button_ask_qstns_new_drop_tower);



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
        ask_qstn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Screen8.class);
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
