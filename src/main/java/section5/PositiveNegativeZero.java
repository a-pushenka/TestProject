package section5;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(0);
    }

    public static void checkNumber(int number) {
        System.out.println((number > 0) ? "positive" : ((number < 0) ? "negative" : "zero"));
    }
}
