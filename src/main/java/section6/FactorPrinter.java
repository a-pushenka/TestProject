package section6;

public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(10);

    }

    public static void printFactors(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++) {
            if ((number % i) == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
