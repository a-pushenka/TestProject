package section5;

public class DecimalComparator2 {
    public static void main(String[] args) {
        boolean thisisDecimalComp = areEqualByThreeDecimalPlaces(-3.1756d, -3.175d);
        System.out.println(thisisDecimalComp);
    }
    public static boolean areEqualByThreeDecimalPlaces(double theFirst, double theSecond) {
        long oneone = (long) (theFirst * 1000);
        long twotwo = (long) (theSecond * 1000);
        return oneone == twotwo;
    }
}

/*
        if (oneone == twotwo) {
            return true;
        } else {
            return false;
        }
 */