package section6;

public class SharedDigit19 {
    public static void main(String[] args) {
        System.out.println("Are shared numbers are found for 32 and 35? - " + hasSharedDigit(12,43));

    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }

        int lastDigit1 = 0;
        int lastDigit2 = 0;
        while (number1 / 10 != 0) { //number1=2
            lastDigit1 += number1 % 10; //3
            lastDigit2 += number2 % 10; //5
            if (lastDigit1 == lastDigit2) {
                return true;
            }
            int firstDigit2 = number2 / 10; //3
            if (lastDigit1 == firstDigit2) {
                return true;
            }
            int firstDigit1 = number1 /= 10; //2
            if (firstDigit1 == lastDigit1) {
                return true;
            }
            if (firstDigit1 == firstDigit2) {
                return true;
            }
        }

        return false;
    }
}

//public class SharedDigit { // solution explanation
//
//    public static boolean hasSharedDigit(int first, int second) {
//
//        boolean firstValid = first > 9 && first < 100;
//        boolean secondValid = second > 9 && second < 100;
//
//        if (!firstValid || !secondValid) {
//            return false;
//        }
//
//        int firstLeftDigit = first / 10;
//        int firstRightDigit = first % 10;
//        int secondLeftDigit = second / 10;
//        int secondRightDigit = second % 10;
//
//        boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit;
//        boolean secondShared = firstRightDigit == secondLeftDigit || firstRightDigit == secondRightDigit;
//
//        return firstShared || secondShared;
//    }
//}