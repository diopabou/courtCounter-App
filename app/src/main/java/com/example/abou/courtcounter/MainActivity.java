package com.example.abou.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayScoreA(int score) {
        TextView scoreTeamA = (TextView) findViewById(R.id.score_team_a_text_view);
        scoreTeamA.setText(String.valueOf(score));

    }
    private void displayScoreB(int score){
        TextView scoreTeamB = (TextView) findViewById(R.id.score_team_b_text_view);
        scoreTeamB.setText(String.valueOf(score));
    }

    public void incrementThreeTeamA(View view){
        scoreTeamA += 3;
        displayScoreA(scoreTeamA);
    }

    public void incrementTwoTeamA(View view){
        scoreTeamA += 2;
        displayScoreA(scoreTeamA);
    }

    public void incrementOneTeamA(View view){
        scoreTeamA += 1;
        displayScoreA(scoreTeamA);
    }

    public void incrementThreeTeamB(View view){
        scoreTeamB += 3;
        displayScoreB(scoreTeamB);
    }

    public void incrementTwoTeamB(View view){
        scoreTeamB += 2;
        displayScoreB(scoreTeamB);
    }

    public void incrementOneTeamB(View view){
        scoreTeamB += 1;
        displayScoreB(scoreTeamB);
    }

    public void resetCounter(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreA(scoreTeamA);
        displayScoreB(scoreTeamB);
    }
}
