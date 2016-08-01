package com.example.swathi.tourbot1;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Screen4 extends AppCompatActivity {

    Button end_tour, back_btn,drop_tower_btn, data_center_btn, back_2_stdnt_services_btn;
    int paused;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);

        addListenerOnButton();
    }


    public void addListenerOnButton() {

        final Context context = this;

        end_tour= (Button) findViewById(R.id.button_end_tour_screen4);
        back_btn= (Button) findViewById(R.id.button_back_choose_destn);

        data_center_btn= (Button) findViewById(R.id.button_data_center);
        drop_tower_btn= (Button) findViewById(R.id.button_drop_tower);
        back_2_stdnt_services_btn= (Button) findViewById(R.id.button_student_services);

        end_tour.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Screen7.class);
                startActivity(intent);

            }

        });
        back_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                //Intent intent = new Intent(context, Screen3.class);
               // startActivity(intent);
                finish();

            }

        });

        data_center_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Screen5.class);
                startActivity(intent);
            }



        });

        back_2_stdnt_services_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Screen7.class);
                startActivity(intent);

            }

        });

        drop_tower_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, NewDropTower.class);
                startActivity(intent);

            }

        });

    }

}
