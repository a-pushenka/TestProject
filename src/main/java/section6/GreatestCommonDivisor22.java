package section6;

public class GreatestCommonDivisor22 {
    public static void main(String[] args) {
        getGreatestCommonDivisor(10, 15);

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            System.out.println("Invalid Value: value first or second is less than 10.");
            return -1;
        }

        System.out.println("");
        System.out.print("Divisors for the first number ");
        for (int i = 1; i <= first; i++) {
            if (first % i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("");
        System.out.print("Divisors for the second number ");
        for (int a = 1; a <= second; a++) {
            if ((second % a) == 0) {
                System.out.print(a + " ");
            }
        }

        int min = first < second ? first : second;
        int gcd = 1;
        for (int j = 1; j <= min; j++) {
            if (first % j == 0 && second % j == 0) {
                gcd = j;
            }
        }

        System.out.println("");
        System.out.println("Greatest common divisor is " + gcd);
        return gcd;
    }
}