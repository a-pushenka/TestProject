package section6;

public class PerfectNumber23 {
    public static void main(String[] args) {
        System.out.println("Is number perfect? -> " + isPerfectNumber(0));
    }

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }
}
