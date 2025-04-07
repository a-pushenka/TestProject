package section5;

public class EqualSumChecker {
    public static void main(String[] args) {
        boolean comparison = hasEqualSum(1, -1, 0);
        System.out.println(comparison);
    }
    public static boolean hasEqualSum (int first, int second, int third) {
        return (first + second) == third;
    }
}

/*
int sumOfFirstAndSecond = first + second;
        return sumOfFirstAndSecond == third;
 */
/*
boolean ddd = ((a +b) == c);
return ddd;
 */