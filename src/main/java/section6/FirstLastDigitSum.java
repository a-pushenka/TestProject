package section6;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println("Sum of the first and the last digit of the number 1234 is " + sumFirstAndLastDigit(0));

    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int theLastDigit = number % 10; // use % 10 to get last digit in a number.
        while (number > 9) {
            number /= 10; //  divide with 10 until there is 1 digit left (< 10) to get first digit.  This is also equivalent to number = number / 10.
        }

        int theFirstDigit = number; // this is not necessary, but this makes it clear that number is now the first digit.
        return theLastDigit + theFirstDigit;

    }
}
