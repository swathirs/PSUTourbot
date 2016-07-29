package com.example.swathi.tourbot1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen9 extends AppCompatActivity {
    Button restart_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen9);
        addListenerOnButton();
    }
    public void addListenerOnButton() {

        final Context context = this;

        restart_btn = (Button) findViewById(R.id.button_restart_tour_screen9);

       restart_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, NewStartScreen.class);
                startActivity(intent);
            }

        });
    }
}
