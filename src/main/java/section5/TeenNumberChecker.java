package section5;

public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean teenOrNot = hasTeen(20, 80, 19);
        System.out.println(teenOrNot);
        boolean isitTeen = isTeen(10);
        System.out.println(isitTeen);
    }
    public static boolean hasTeen(int a, int b, int c) {
        if (a >=13 & a <= 19) {
            return true;
        } else if (b >=13 & b <= 19) {
            return true;
        } else if (c >=13 & c <= 19) {
            return true;
            } else {
            return false;
            }
    }
    public static boolean isTeen(int abcd) {
        boolean fff = (abcd >=13 & abcd <= 19);
        return fff;
    }
}

/*
public static boolean hasTeen(int a, int b, int c) {
    return isTeen(a) || isTeen(b) || isTeen(c);
}

public static boolean isTeen(int number) {
    return number > 12 && number < 20;
}
*/