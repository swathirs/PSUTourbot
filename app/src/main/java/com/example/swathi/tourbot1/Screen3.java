package com.example.swathi.tourbot1;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen3 extends AppCompatActivity {
    Button button_back, button_next;
    MediaPlayer mp;
    int paused;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        addListenerOnButton();
    }
    public void addListenerOnButton() {

        final Context context = this;

        button_back = (Button) findViewById(R.id.button_back_screen3);
        button_next = (Button) findViewById(R.id.button_next_screen3);

        button_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, NewScreen2.class);
                startActivity(intent);

            }

        });
        button_next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Screen4.class);
                if(mp==null)
                {
                    mp = MediaPlayer.create(context, R.raw.destination);
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
