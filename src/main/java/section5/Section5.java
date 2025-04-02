package section5;

public class Section5 {

//45-47.

//    public static void main(String[] args) {
//
//        calculatedScore (true, 800, 5, 100);
//
//        calculatedScore(true, 10000, 8, 200);
//
//    }
//
//    public static void calculatedScore (boolean gameOver, int score, int levelCompleted, int bonus) {
//// void means that no data will be returned from the method
//
//        int finalScore = score;
//
//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("45-47 lessons. Your final score was " + finalScore);
//        }
//    }

    // 47.
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculatedScore (gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);

        calculatedScore(true, 10000, 8, 200); // ignored cause we didn't assign any variable to this call

    }

    public static int calculatedScore (boolean gameOver, int score, int levelCompleted, int bonus) {
// int means that some data will be returned from the method

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
        // return statement
    }

}
