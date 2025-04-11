package section5;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));

    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (!summer && temperature >= 25 && temperature <= 35) {
            return true;
        } else if (summer && temperature >= 25 && temperature <= 45) {
            return true;
        } else {
            return false;
        }
    }
}
/*
public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {

        int max = summer ? 45 : 35;
        return temperature >= 25 && temperature <= max;
    }
}
 */