package com.arijitpaul.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }

    // It displays Team A's score.
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    // It displays Team B's score
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    // Adds 3 points and displays Team A's score
    public void point3ButtonForA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    // Adds 2 points and displays Team A's score
    public void point2ButtonForA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    // Adds 1 point and displays Team A's score
    public void point1ButtonForA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    // Adds 3 points and displays Team B's score
    public void point3ButtonForB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    // Adds 2 points and displays Team B's score
    public void point2ButtonForB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    // Adds 1 point and displays Team B's score
    public void point1ButtonForB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetButton(View view) {
        scoreTeamA = scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}