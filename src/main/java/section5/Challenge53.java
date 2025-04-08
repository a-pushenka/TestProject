package section5;

public class Challenge53 {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + " cm");
        System.out.println("68in = " + convertToCentimeters(68) + " cm");
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        //return convertToCentimeters((feet * 12) + inches);
        int feettoincehs = feet * 12;
        int totalinches = feettoincehs + inches;
        double result = convertToCentimeters(totalinches);
        return result;
    }
}
