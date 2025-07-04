package section6;

public class LargestPrime26 {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(5));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(552));
        System.out.println(getLargestPrime(778));
        System.out.println(getLargestPrime(888));
        System.out.println(getLargestPrime(10480));
    }

    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        int factor = -1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i != 0) {
                continue;
            }
            factor = i;
            while (number % i == 0) {
                number /= i;
            }
        }
        return number == 1 ? factor : number;
    }
}