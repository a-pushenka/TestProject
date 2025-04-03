package section5;

import java.util.Timer;

public class Section5 {

//45-47.

//    public static void main(String[] args) {
//
//        calculatedScore (true, 800, 5, 100); //here we call method (or we can call it function)
//
//        calculatedScore(true, 10000, 8, 200);
//
//    }
//
//    public static void calculatedScore (boolean gameOver, int score, int levelCompleted, int bonus) {
    // public and static = declaring modifiers
//// void means that no data will be returned from the method
/// // method with a void return type we can call "procedure"
/// // return type = any primitive data type or class
//
//        int finalScore = score;
//
//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("45-47 lessons. Your final score was " + finalScore);
//        }
//    }

//    // 47.
//    public static void main(String[] args) {
//
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        int highScore = calculatedScore (gameOver, score, levelCompleted, bonus);
//        System.out.println("The highScore is " + highScore);
//
//        calculatedScore(true, 10000, 8, 200); // ignored cause we didn't assign any variable to this call
//        System.out.println("The next highScore is " + calculatedScore(true, 10000, 8, 200));
//    }
//
//    public static int calculatedScore (boolean gameOver, int score, int levelCompleted, int bonus) {

    /// / int means that some data will be returned from the method
//
//        int finalScore = score;
//
//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            finalScore += 1000;
//        }
//
//        return finalScore;
//        // return statement
//    }

    //49. challenge

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Paule", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Larisa", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Leon", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Teo", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println("48 lessons. Challenge." +
                playerName + " managed to get into position "
                + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 0;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {  // && playerScore < 1000 there is no need to add it
            position = 2;
        } else if (playerScore >= 100) {  //&& playerScore < 500
            position = 3;
        } else {
            position = 4;
        }

        return position;
    }
}