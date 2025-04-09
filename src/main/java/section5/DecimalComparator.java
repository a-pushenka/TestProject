package section5;

public class DecimalComparator {
    public static void main(String[] args) {
        boolean thisIsDecimalComp = areEqualByThreeDecimalPlaces(-3.1756d, -3.175d);
        System.out.println(thisIsDecimalComp);
    }
    public static boolean areEqualByThreeDecimalPlaces(double theFirst, double theSecond) {
        long oneone = (long) (theFirst * 1000);
        long twotwo = (long) (theSecond * 1000);
        if (oneone == twotwo) {
            return true;
        } else {
            return false;
        }
    }
}