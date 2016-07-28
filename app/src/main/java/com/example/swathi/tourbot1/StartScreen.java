package com.example.swathi.tourbot1;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartScreen extends AppCompatActivity {
    Button button;
    MediaPlayer mp;
    int paused;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        addListenerOnButton();
    }
    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.button_start);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Screen2.class);
                if(mp==null)
                {
                    mp = MediaPlayer.create(context, R.raw.intro);
                    mp.start();
                }
                else if(!mp.isPlaying())
                {
                    mp.seekTo(paused);
                    mp.start();
                }
                startActivity(intent);

            }

        });

    }
}
