package section6;

public class WhileLoopChallenge66 {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int countOfEven = 0;
        int countOfOdd = 0;

        while (number <= finishNumber) {
            number ++;
            if (!isEvenNumber(number)) {
                countOfOdd++;
                continue;
            }
            System.out.println("Even number " + number);
            countOfEven++;
            if (countOfEven == 5)
                break;
        }
        System.out.println("Count of even numbers = " + countOfEven);
        System.out.println("Count of odd numbers = " + countOfOdd);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}