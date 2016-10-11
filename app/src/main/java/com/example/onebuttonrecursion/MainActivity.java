package com.example.onebuttonrecursion;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private static final String TAG = "OneButtonRecursion";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Button clickedButton = (Button) view;

        if(clickedButton == findViewById(R.id.button1))
        {
            TextView cup = (TextView) findViewById(R.id.textView1);
            int handFull = Integer.parseInt(cup.getText().toString());

            if(handFull > 0)
            {
                cup.setText(handFull + "");
                playNextCup((TextView) findViewById(R.id.textView1), handFull);
            }

        }

        else
        {
        }
    }

    public static void playNextCup(TextView cupIn, int handFullIn)
    {
        handFullIn--;
        cupIn.setText(handFullIn + "");

        if(handFullIn != 0)
        {
            playNextCup(cupIn, handFullIn);
            Log.i(TAG, "In recursion " + handFullIn);
        }
        else
        {
        }
    }
}
