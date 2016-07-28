package com.example.swathi.tourbot1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Student_Srvcs_Resume_Screen extends AppCompatActivity {
    Button change_destination_btn, srch_website_btn, resume_tour_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__srvcs__resume__screen);
        addListenerOnButton();
    }
    public void addListenerOnButton() {

        final Context context = this;

        change_destination_btn= (Button) findViewById(R.id.button_chng_destn_stdnt_srvcs_resume_screen);
        srch_website_btn= (Button) findViewById(R.id.button_srch_website_stdnt_srvcs_resume_screen);
        resume_tour_btn=(Button) findViewById(R.id.button_resume_stdnt_srvcs_resume_screen);

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

                Intent intent = new Intent(context, Screen7.class);
                startActivity(intent);

            }

        });

    }
}
