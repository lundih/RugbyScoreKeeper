package com.example.android.rugbyscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA;//score for team A
    int scoreB;//score  for team B
    int numberOfTriesA;//keeps number of tries scored for Team A
    int numberOfTriesB;//keeps number of tries scored for Team B
    int numberOfConversionsA;//keeps number of conversions scored for Team A
    int numberOfConversionsB;//keeps number of conversions scored for Team B
    int numberOfPenaltyKicksA;//keeps number of penalty kicks scored for Team A
    int numberOfPenaltyKicksB;//keeps number of penalty kicks scored for Team B
    int numberOfDropGoalsA;//keeps number of drop goals scored for team A
    int numberOfDropGoalsB;//keeps numebr of drop goals scored for Team B

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    /**
     * Displays the given score for Team A
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }
    /**
     * Adds 5 points for Team A due to a try and updates number of tries
     */
    public void addTryToTeamA(View view) {
        scoreA = scoreA + 5;
        numberOfTriesA = numberOfTriesA + 1;
        displayForTeamA(scoreA);
        displayTriesForTeamA(numberOfTriesA);
    }
    /**
     * Adds 2 points for Team A due to a conversion and updates number of conversions
     */
    public void addConversionToTeamA(View view) {
        scoreA = scoreA + 2;
        numberOfConversionsA = numberOfConversionsA + 1;
        displayForTeamA(scoreA);
        displayConversionsForTeamA(numberOfConversionsA);
    }
    /**
     * Adds 3 points for Team A due to a penalty kick goal and updates number of penalty kick goals
     */
    public void addPenaltyKickToTeamA(View view) {
        scoreA = scoreA + 3;
        numberOfPenaltyKicksA = numberOfPenaltyKicksA + 1;
        displayForTeamA(scoreA);
        displayPenaltyKicksForTeamA(numberOfPenaltyKicksA);
    }
    /**
     * Adds 3 points To Team A due to a drop goal and updates number of drop goals
     */
    public void addDropGoalToTeamA(View view) {
        scoreA = scoreA + 3;
        numberOfDropGoalsA = numberOfDropGoalsA + 1;
        displayForTeamA(scoreA);
        displayDropGoalsForTeamA(numberOfDropGoalsA);
    }
    /**
     * Displays the given score for Team B
     */
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }
    /**
     * Adds 5 points for Team B due to a try and updates number of tries
     */
    public void addTryToTeamB(View view) {
        scoreB = scoreB + 5;
        numberOfTriesB = numberOfTriesB + 1;
        displayForTeamB(scoreB);
        displayTriesForTeamB(numberOfTriesB);
    }
    /**
     * Adds 2 points for Team B due to a conversion and updates number of conversions
     */
    public void addConversionToTeamB(View view) {
        scoreB = scoreB + 2;
        numberOfConversionsB = numberOfConversionsB + 1;
        displayForTeamB(scoreB);
        displayConversionsForTeamB(numberOfConversionsB);
    }
    /**
     * Adds 3 points for Team B due to a penalty kick goal and updates number of penalty kick goals
     */
    public void addPenaltyKickToTeamB(View view) {
        scoreB = scoreB + 3;
        numberOfPenaltyKicksB = numberOfPenaltyKicksB + 1;
        displayForTeamB(scoreB);
        displayPenaltyKicksForTeamB(numberOfPenaltyKicksB);
    }
    /**
     * Adds 3 points for Team B due to a drop goal and updates number of drop goals
     */
    public void addDropGoalToTeamB(View view) {
        scoreB = scoreB + 3;
        numberOfDropGoalsB = numberOfDropGoalsB + 1;
        displayForTeamB(scoreB);
        displayDropGoalsForTeamB(numberOfDropGoalsB);
    }
    /**
     * Resets all variables and displays the scores as zero.
     */
    public void resetScores(View view) {
        scoreA=0;
        scoreB=0;
        numberOfTriesA=0;
        numberOfConversionsA=0;
        numberOfPenaltyKicksA=0;
        numberOfDropGoalsA=0;
        numberOfTriesB=0;
        numberOfConversionsB=0;
        numberOfPenaltyKicksB=0;
        numberOfDropGoalsB=0;
        displayForTeamA(scoreA);
        displayTriesForTeamA(numberOfTriesA);
        displayConversionsForTeamA(numberOfConversionsA);
        displayPenaltyKicksForTeamA(numberOfPenaltyKicksA);
        displayDropGoalsForTeamA(numberOfDropGoalsA);
        displayForTeamB(scoreB);
        displayTriesForTeamB(numberOfTriesB);
        displayConversionsForTeamB(numberOfConversionsB);
        displayPenaltyKicksForTeamB(numberOfPenaltyKicksB);
        displayDropGoalsForTeamB(numberOfDropGoalsB);
    }
    /**
     * Displays number of tries for Team A
     */
    public void displayTriesForTeamA(int numberOfTriesA){
        Button button = (Button) findViewById(R.id.team_a_try);
        if (numberOfTriesA == 0){
            button.setText(String.valueOf("Try"));
        }else{
            button.setText(String.valueOf("Try (" +numberOfTriesA + ")"));
        }
    }
    /**
     * Displays number of conversions for Team A
     */
    public void displayConversionsForTeamA(int numberOfConversionsA){
        Button button = (Button) findViewById(R.id.team_a_conversion);
        if (numberOfConversionsA == 0){
            button.setText(String.valueOf("Conversion"));
        }else{
            button.setText(String.valueOf("Conversion (" +numberOfConversionsA + ")"));
        }
    }
    /**
     * Displays number of successful penalty kicks for Team A
     */
    public void displayPenaltyKicksForTeamA(int numberOfPenaltyKicksA){
        Button button = (Button) findViewById(R.id.team_a_penalty_kick);
        if (numberOfPenaltyKicksA == 0){
            button.setText(String.valueOf("Penalty Kick"));
        }else{
            button.setText(String.valueOf("Penalty Kick (" +numberOfPenaltyKicksA + ")"));
        }
    }
    /**
     * Displays number of drop goals for Team A
     */
    public void displayDropGoalsForTeamA(int numberOfDropGoalsA){
        Button button = (Button) findViewById(R.id.team_a_drop_goal);
        if (numberOfDropGoalsA == 0){
            button.setText(String.valueOf("Drop Goal"));
        }else{
            button.setText(String.valueOf("Drop Goal (" +numberOfDropGoalsA + ")"));
        }
    }
    /**
     * Displays number of tries for Team B
     */
    public void displayTriesForTeamB(int numberOfTriesB){
        Button button = (Button) findViewById(R.id.team_b_try);
        if (numberOfTriesB == 0){
            button.setText(String.valueOf("Try"));
        }else{
            button.setText(String.valueOf("Try (" +numberOfTriesB + ")"));
        }
    }
    /**
     * Displays number of conversions for Team B
     */
    public void displayConversionsForTeamB(int numberOfConversionsB){
        Button button = (Button) findViewById(R.id.team_b_conversion);
        if (numberOfConversionsB == 0){
            button.setText(String.valueOf("Conversion"));
        }else{
            button.setText(String.valueOf("Conversion (" +numberOfConversionsB + ")"));
        }
    }
    /**
     * Displays number of successful penalty kicks for Team B
     */
    public void displayPenaltyKicksForTeamB(int numberOfPenaltyKicksB){
        Button button = (Button) findViewById(R.id.team_b_penalty_kick);
        if (numberOfPenaltyKicksB == 0){
            button.setText(String.valueOf("Penalty Kick"));
        }else{
            button.setText(String.valueOf("Penalty Kick (" +numberOfPenaltyKicksB + ")"));
        }
    }
    /**
     * Displays number of drop goals for Team B
     */
    public void displayDropGoalsForTeamB(int numberOfDropGoalsB){
        Button button = (Button) findViewById(R.id.team_b_drop_goal);
        if (numberOfDropGoalsB == 0){
            button.setText(String.valueOf("Drop Goal"));
        }else{
            button.setText(String.valueOf("Drop Goal (" +numberOfDropGoalsB + ")"));
        }
    }
}
