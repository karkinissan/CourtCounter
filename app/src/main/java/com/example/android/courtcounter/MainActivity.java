package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayA(scoreTeamA);
        displayB(scoreTeamB);
    }


    public void plusThreeA(View view) {
        displayA(scoreTeamA = scoreTeamA + 3);
    }

    public void plusTwoA(View view) {
        displayA(scoreTeamA = scoreTeamA + 2);

    }

    public void plusOneA(View view) {
        displayA(scoreTeamA = scoreTeamA + 1);

    }

    public void displayA(int scoreTeamA) {
        TextView scoreTeamATextView = (TextView) findViewById(R.id.team_a_points);
        scoreTeamATextView.setText("" + scoreTeamA);
    }

    public void plusThreeB(View view) {
        displayB(scoreTeamB = scoreTeamB + 3);
    }

    public void plusTwoB(View view) {
        displayB(scoreTeamB = scoreTeamB + 2);

    }

    public void plusOneB(View view) {
        displayB(scoreTeamB = scoreTeamB + 1);

    }

    public void displayB(int scoreTeamB) {
        TextView scoreTeamBTextView = (TextView) findViewById(R.id.team_b_points);
        scoreTeamBTextView.setText("" + scoreTeamB);
    }
    public void resetPoints(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayA(scoreTeamA);
        displayB(scoreTeamB);
    }
}
