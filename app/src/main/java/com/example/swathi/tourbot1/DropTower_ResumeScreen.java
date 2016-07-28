package com.example.swathi.tourbot1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DropTower_ResumeScreen extends AppCompatActivity {

    Button change_destination_btn, srch_website_btn, resume_tour_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_tower__resume_screen);
        addListenerOnButton();
    }
    public void addListenerOnButton() {

        final Context context = this;

        change_destination_btn= (Button) findViewById(R.id.button_chng_destn_drp_twr_rsm_screen);
        srch_website_btn= (Button) findViewById(R.id.button_search_website_drp_rsm_screen);
        resume_tour_btn=(Button) findViewById(R.id.button_resume_tour_drp_twr_rsm_screen);

        change_destination_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Screen4.class);
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
        resume_tour_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, DropTowerScreen.class);
                startActivity(intent);

            }

        });

    }


}
