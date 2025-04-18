package section6;

public class Sum3and5ChallengeForLoop {
    public static void main(String[] args) {

        int count = 0;
        int sumOfMatches = 0;

        for (int i = 1; i <= 1000; i++) { // i or j as a loop iteration variable [count < 3 && i <= 50]
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                sumOfMatches += i;
                System.out.println("number is divide by 3 and 5 without remainder " + i);
                if (count == 5)
                    break;
            }
        }
        System.out.println("Sum of the numbers that divided by 3 and 5 without remainder is " + sumOfMatches);
    }
}
