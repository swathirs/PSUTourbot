package com.example.swathi.tourbot1;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen2 extends AppCompatActivity {

    Button button_tour, button_ask_question, back_btn;
    MediaPlayer mp;
    int paused;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        addListenerOnButton();

    }
    public void addListenerOnButton() {

        final Context context = this;

        button_tour= (Button) findViewById(R.id.button_take_tour);
        button_ask_question = (Button)findViewById(R.id.button_ask_qstn);
        back_btn = (Button)findViewById(R.id.button_back_ask_qstns_id);

        button_tour.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Screen3.class);
                if(mp==null)
                {
                    mp = MediaPlayer.create(context, R.raw.preferences);
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

        button_ask_question.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Screen8.class);
                startActivity(intent);

            }

        });
        back_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, StartScreen.class);
                startActivity(intent);

            }

        });



    }


}
