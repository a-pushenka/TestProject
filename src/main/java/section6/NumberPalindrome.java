package section6;

public class NumberPalindrome {
    public static void main(String[] args) {
        //isPalindrome(123);
        System.out.println(isPalindrome(-121) ? "It is palindrom" : "It is Not palindrom");
    }

//    public static boolean isPalindrome(int number) {
//        int reverse = 0;
//        int initialNumber = number; //321
//
//        while (number > 9) { //
//            int lastDigit = number % 10; // 2
//            reverse += lastDigit; // 10 + 2 = 12
//            number = number / 10; // 3
//            reverse = reverse * 10; // 120
//        }
//
//        reverse += number; //120 +3 = 123
//        return reverse == initialNumber; //123 ==
//    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = number;
        while (original != 0) {
            reverse = reverse * 10 + original % 10; // 12 % 10 = 12 - (12/10 *10) = 12 - (1*10) = 2 остаток
            original /= 10;
        }
        return reverse == number;
    }
}
