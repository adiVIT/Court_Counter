package com.example.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    int x=0;
    public void  view3(View view){
        displayForTeamA(x=3+x);
    }
    public void view2(View view){
        displayForTeamA(x=2+x);
    }
    public void view1(View view){
        displayForTeamA(x=1+x);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    int y=0;
    public void  view4(View view){
        displayForTeamB(y=3+y);
    }
    public void view5(View view){
        displayForTeamB(y=2+y);
    }
    public void view6(View view){
        displayForTeamB(y=1+y);

    }
    public void reset(View view){
        displayForTeamA(0);
        displayForTeamB(0);
        x=0;
        y=0;
    }


}