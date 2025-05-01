package section6;

public class GreatestCommonDivisor22 {
    public static void main(String[] args) {
        getGreatestCommonDivisor(25, 15);

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 0 || second < 0) {
            System.out.println("Invalid Value: value first or second is less than 0.");
            return -1;
        }

        System.out.print("Divisors for the first number ");
        for (int i = 1; i <= first; i++) {
            if ((first % i) == 0) {
                System.out.print(i + " ");
                continue;
            }
        }
        System.out.println(" ");
        System.out.print("Divisors for the second number ");
        for (int a = 1; a <= second; a++) {
            if ((second % a) == 0) {
                System.out.print(a + " ");
                continue;
            }
        }

        return 1;
    }
}
