/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.courtcounter;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import com.example.courtcounter.R;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA = 0, scoreB = 0;

    /**
     * This method is called when the order button is clicked.
     */
    public void reset(View view) {
        scoreB = 0;
        scoreA = 0;
        displayB(scoreB);
        displayA(scoreA);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayA(int number) {
        TextView scoreA_text_view = (TextView) findViewById(R.id.scoreA_text_view);
        scoreA_text_view.setText("" + number);
    }

    private void displayB(int number) {
        TextView scoreB_text_view = (TextView) findViewById(R.id.scoreB_text_view);
        scoreB_text_view.setText("" + number);
    }

    public void Incr2pointsA(View view) {
        scoreA = scoreA + 2;
        displayA(scoreA);
    }

    public void freethrowA(View view) {
        scoreA = scoreA + 1;
        displayA(scoreA);
    }

    public void Incr3pointsA(View view) {
        scoreA = scoreA + 3;
        displayA(scoreA);
    }

    public void Incr2pointsB(View view) {
        scoreB = scoreB + 2;
        displayB(scoreB);
    }

    public void freethrowB(View view) {
        scoreB = scoreB + 1;
        displayB(scoreB);
    }

    public void Incr3pointsB(View view) {
        scoreB = scoreB + 3;
        displayB(scoreB);
    }


}