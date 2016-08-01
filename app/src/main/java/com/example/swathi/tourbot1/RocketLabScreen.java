package com.example.swathi.tourbot1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RocketLabScreen extends AppCompatActivity {

    Button back_btn, chng_destn_btn, srch_website_btn, ask_qstn, end_tour_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rocket_lab_screen);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        end_tour_btn= (Button) findViewById(R.id.button_end_tour_rocket_lab);
        chng_destn_btn = (Button) findViewById(R.id.button_change_destination_rocke_lab);
        srch_website_btn = (Button) findViewById(R.id.button_srch_web_rocket_lab);
        back_btn= (Button) findViewById(R.id.button_back_rocket_lab);
        ask_qstn= (Button) findViewById(R.id.button_ask_qstns_rocket_lab);


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

                Intent intent = new Intent(context, NewDestinationScreen.class);
                startActivity(intent);

            }

        });
        back_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                finish();

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
}
