package section6;

public class EvenDigitSum18 {
    public static void main(String[] args) {
        System.out.println("Sum of EVEN digits = " + getEvenDigitSum(8292));

    }

    public static int getEvenDigitSum(int number) {
        if (number <0) {
            return -1;
        }

        int sumOfEven = 0;
        while (number > 0) {
            int lastDigit = number % 10; //8 - (8/10*10) = 8 - (0 * 10) = 8-0 = 8
            if (lastDigit % 2 == 0) {
                sumOfEven += lastDigit;
            }
            number /= 10;
        }

//        if (number % 2 == 0) {  // писала это условие только тогда когда в while указывала (number > 9),
//        чтобы не забыть просуммировать первую цифру числа (только если она четная).
//            sumOfEven += number;
//        }

        return sumOfEven;
    }
}
