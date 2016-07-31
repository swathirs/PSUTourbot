package com.example.swathi.tourbot1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewDestinationScreen extends AppCompatActivity {
    Button end_tour, back_btn, drop_tower_btn, data_center_btn, back_2_stdnt_services_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_destination_screen);
        addListenerOnButton();
    }
    public void addListenerOnButton() {

        final Context context = this;

        end_tour= (Button) findViewById(R.id.button_end_tour_new_destn_screen);
        back_btn= (Button) findViewById(R.id.button_back_new_destn_id);

        data_center_btn= (Button) findViewById(R.id.button_data_center_new_destn_id);
        drop_tower_btn= (Button) findViewById(R.id.button_drop_tower_new_destn_id);
        back_2_stdnt_services_btn= (Button) findViewById(R.id.button_student_services_new_destination_id);

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

                Intent intent = new Intent(context, Screen3.class);
                startActivity(intent);

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
