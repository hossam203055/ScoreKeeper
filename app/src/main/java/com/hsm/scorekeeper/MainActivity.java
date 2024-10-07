package com.hsm.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int ScoreForTeamAvalue = 0;
    int ScoreForTeamBvalue = 0;
    int numberFoulsForTeamAvalue = 0;
    int numberFoulsForTeamBvalue = 0;
    int numberOutsForTeamAvalue = 0;
    int numberOutsForTeamBvalue = 0;
    TextView ScoreForTeamAtextView;
    TextView ScoreForTeamBtextView;
    TextView numberFoulsForTeamAtextView;
    TextView numberFoulsForTeamBtextView;
    TextView numberOutsForTeamAtextView;
    TextView numberOutsForTeamBtextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScoreForTeamAtextView = (TextView) findViewById(R.id.teamAscore);
        ScoreForTeamBtextView = (TextView) findViewById(R.id.teamBscore);
        numberFoulsForTeamAtextView = (TextView) findViewById(R.id.numberFoulsForTeamA);
        numberFoulsForTeamBtextView = (TextView) findViewById(R.id.numberFoulsForTeamB);
        numberOutsForTeamAtextView = (TextView) findViewById(R.id.numberOutsForTeamA);
        numberOutsForTeamBtextView = (TextView) findViewById(R.id.numberOutsForTeamB);

    }

    public void DisplayNumber(int number, TextView textView) {
        TextView tv=textView;
        tv.setText( "" + number);
    }

    public void addGoalForTeamA(View v) {
        ScoreForTeamAvalue++;
        DisplayNumber(ScoreForTeamAvalue, ScoreForTeamAtextView);
    }

    public void addGoalForTeamB(View v) {
        ScoreForTeamBvalue++;
        DisplayNumber(ScoreForTeamBvalue, ScoreForTeamBtextView);
    }

    public void addFoulForTeamA(View v) {
        numberFoulsForTeamAvalue++;
        DisplayNumber(numberFoulsForTeamAvalue, numberFoulsForTeamAtextView);
    }

    public void addFoulForTeamB(View v) {
        numberFoulsForTeamBvalue++;
        DisplayNumber(numberFoulsForTeamBvalue, numberFoulsForTeamBtextView);
    }

    public void addOutForTeamA(View v) {
        numberOutsForTeamAvalue++;
        DisplayNumber(numberOutsForTeamAvalue, numberOutsForTeamAtextView);
    }

    public void addOutForTeamB(View v) {
        numberOutsForTeamBvalue++;
        DisplayNumber(numberOutsForTeamBvalue, numberOutsForTeamBtextView);
    }

    public void resetAllToZero(View v) {
        ScoreForTeamAvalue = 0;
        ScoreForTeamBvalue = 0;
        numberFoulsForTeamAvalue = 0;
        numberFoulsForTeamBvalue = 0;
        numberOutsForTeamAvalue = 0;
        numberOutsForTeamBvalue = 0;
        DisplayNumber(ScoreForTeamAvalue, ScoreForTeamAtextView);
        DisplayNumber(ScoreForTeamBvalue, ScoreForTeamBtextView);
        DisplayNumber(numberFoulsForTeamAvalue, numberFoulsForTeamAtextView);
        DisplayNumber(numberFoulsForTeamBvalue, numberFoulsForTeamBtextView);
        DisplayNumber(numberOutsForTeamAvalue, numberOutsForTeamAtextView);
        DisplayNumber(numberOutsForTeamBvalue, numberOutsForTeamBtextView);
    }

}
