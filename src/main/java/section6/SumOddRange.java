package section6;

public class SumOddRange {
    public static void main(String[] args) {
        sumOdd(-3,7);
        sumOdd(1,11);
    }

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {

        if (end < start || start < 0 || end < 0) {
            System.out.println("-1 is returned or Incorrecct number for Start and/or End");
            return -1;
        }

        int sumOfOdd = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sumOfOdd += i;
            }
        }
        System.out.println("Sum of Odd = " + sumOfOdd);
        return sumOfOdd;
    }
}

//public static boolean isOdd(int number) {
//    return number > 0 && number % 2 != 0;
//}