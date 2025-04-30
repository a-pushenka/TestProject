package section6;

public class LastDigitChecker20 {
    public static void main(String[] args) {
        System.out.println("Are shared numbers found for 12 and 345 and 678? - " + hasSameLastDigit(9, 342, 999));
        System.out.println(("Is the number parameter is in range of 10(inclusive) - 1000(inclusive)? " + isValid(1000)));

    }

    public static boolean hasSameLastDigit(int one, int two, int three) {
        if (one < 10 || one > 1000 || two < 10 || two > 1000 || three < 10 || three > 1000) {
            return false;
        }

        int rightmostOne = one % 10;
        int rightmostTwo = two % 10;
        int rightmostThree = three % 10;

        boolean rightmostShared123 = rightmostOne == rightmostTwo || rightmostOne == rightmostThree;
        boolean rightmostShared23 = rightmostTwo == rightmostThree;

        return rightmostShared123 || rightmostShared23;
    }

    public static boolean isValid(int value) {
        boolean firstValid = value > 9 && value < 1001;

        if (!firstValid) {
            return false;
        }
        return true;
    }
}


//public class LastDigitChecker {
//
//    public static boolean isValid(int number) {
//        return number >= 10 && number <= 1000;
//    }
//
//    public static boolean hasSameLastDigit(int a, int b, int c) {
//
//        if (!isValid(a) || !isValid(b) || !isValid(c)) {
//            return false;
//        }
//
//        int lastA = a % 10;
//        int lastB = b % 10;
//        int lastC = c % 10;
//        return (lastA == lastB) || (lastA == lastC) || (lastB == lastC);
//    }
//}