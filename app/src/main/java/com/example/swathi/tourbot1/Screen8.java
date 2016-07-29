package com.example.swathi.tourbot1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Screen8 extends AppCompatActivity {
    Spinner spinner_one, spinner_two, spinner_three, spinner_four, spinner_five;
    Button back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen8);

        /*TextView txtDetailsQ1 = (TextView) findViewById(R.id.textView16);
        txtDetailsQ1.setText("1. Do robots dream?\n + A. That’s a good question so we asked Jeeves. He says, “When my power is turned off, I do not dream, but when I am in sleep mode, I will sometimes defragment my hard drive. This process is very similar to what humans do when they dream. Last week, I had a wonderful defrag session about a photoshop document full of 1’s and 0’s.”\n" +
                "\n" +
                "2. Does Jeeves sing and dance?\n" +
                "A. Jeeves has gears and springs that allow him to dance, but he has not yet learned to sing.\n" +
                "\n" +
                "3. How old do I have to be to get into PSU?\n" +
                "A. Age is not a factor when admitting students to PSU, applicants are evaluated on intelligence and knowledge. So far, the youngest student entered PSU at age 12 and then entered the PhD program at age 16.\n" +
                "\n" +
                "4. What is Jeeves made of?\n" +
                "A. Aluminum, steel, copper, plastic, wood, glue, cloth and lots of love from PSU students.\n" +
                "\n" +
                "5. Where’s the restroom?\n" +
                "A. Unfortunately, that’s one of the things Jeeves doesn’t know about yet, but there are restrooms on every floor. Look for icons like this:\n" +
                "\n" +
                "6. What is the history of Jeeves?\n" +
                "A. The name originated from a fictional character in a series of humorous short stories and novels by P. G. Wodehouse (1881–1975). Created in 1915, Jeeves is a highly competent personal valet to a wealthy young Londoner. After being written about by Wodehouse for 59 years, the name Jeeves has been adopted by many similar characters to the point of the word “jeeves” becoming a generic term in many dictionaries to refer to a valet or butler of a wealthy employer. The Jeeves robot here at PSU is an ongoing project of robotics students in the Maseeh College of Engineering and Computer Science." );

        txtDetailsQ1.setMovementMethod(new ScrollingMovementMethod());*/

        addListenerOnButton();

    }

   public void addListenerOnButton() {

        final Context context = this;

        back_btn = (Button) findViewById(R.id.back_button_FAQs_screen);

        back_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, NewScreen2.class);
                startActivity(intent);
            }

        });
    }

}
