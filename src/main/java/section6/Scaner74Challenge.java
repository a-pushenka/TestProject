package section6;

import java.util.Scanner;

public class Scaner74Challenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while (counter <= 5) // do можно вместо while (counter <=5)
        {
            System.out.println("Enter number #" + counter + ":");
            String nextNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                            // double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        }  // если написать do то тут нужно написать while (counter <= 5);

        System.out.println("The sum of the 5 number = " + sum);
    }
}
