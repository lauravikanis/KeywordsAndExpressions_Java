package com.company;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(highScore + "is your highscore");

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gil", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Laura", highScorePosition);

       // calcFeetAndInchesToCentimeters(10, 0);
        // calcFeetAndInchesToCentimeters(-10, 0);
        calcFeetAndInchesToCentimeters(-10);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " got into position " + highScorePosition);
    }

    private static int calculateHighScorePosition(int playerScore) {
        /* if (playerScore >= 1000) {
            return 1;
        } else if (playerScore > 500) {
            return 2;
        } else if (playerScore > 100) {
            return 3;
        }   return 4; */

        int position = 4; // assuming position will be returned
        if(playerScore >= 1000) {
            position = 1;
        } else if(playerScore >= 500) {
            position = 2;
        }else if (playerScore > 100){
            position = 3;
        } return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;

    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet < 0) || ((inches < 0)  || (inches >12))) {
            System.out.println("You put invalid numbers");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " iches = " + centimeters + " centimeters");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0) {
           return -1;
        }
        double feet =  (int) inches / 12;
        double remainingInches =  (int) inches % 12;
        System.out.println(inches + " iches = " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}
