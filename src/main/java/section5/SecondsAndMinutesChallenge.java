package section5;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return System.out.println("Seconds should be equal to or more then 0");
        } else {
            int minutes = seconds / 60;
            /*
            int hours = minutes / 60;
            //System.out.println("hours = " + hours);
            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds % 60;
            return hours + "h " + remainingMinutes + "m " + remainingSeconds;  // XXh YYm ZZs
            */
            return getDurationString(minutes, seconds);
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Minutes should be >= 0 and Seconds should be >= o and <= 59");
        } else {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds % 60;
            return hours + "h " + remainingMinutes + "m " + remainingSeconds;  // XXh YYm ZZs
        }
        return "";
    }
}
