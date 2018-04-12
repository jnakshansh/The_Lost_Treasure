package com.jnakshansh.the_lost_treasure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class instruction extends AppCompatActivity {

    Button close;
    TextView inst3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);

        inst3=(TextView)findViewById(R.id.inst3);
        String text="HOW TO PLAY: \n \n1- Get the clue, go to correct place, scan the QR, Get the NEXT clue. \n2- The team who solves all 7 clues first wins the game.\n\n\n" +
                "WHERE TO PLAY: \n\n1.The play area is limited to college campus only.\n2.Run starts at Parking Area.\n\n\n" +
                "WHEN TO PLAY:\n\n1- You'll have to scan 2 codes at starting point before expecting clues:\n\t\t - QR code A: This code can be scanned by one person from a team half-n-hour before the game" +
                "\n \t\t - QR code B: This QR code will start on journey. \n\n\nPRO TIP: \n\n1. Scan the QR from atleast 3 feet away for a quick scan.\n2.Beware of dummy QR codes.\n3.Play with a charged phone as progress in a phone is non-transferrable.";
        inst3.setText(text);


        close=(Button) findViewById(R.id.button7);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
