package section6;

public class EnhancedSwitchStatementChallenge {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
    }

    public static void printDayOfWeek(int dayValue) {
        String dayOfTheWeek = switch (dayValue) {
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(dayValue + " = " + dayOfTheWeek);
    }

    public static void printWeekDay(int dayValue) {
        String dayOfWeek = "Invalid day";
        if (dayValue == 0) {
            dayOfWeek = "Sunday";
        } else if (dayValue == 1) {
            dayOfWeek = "Monday";
        } else if (dayValue == 2) {
            dayOfWeek = "Tuesday";
        } else if (dayValue == 3) {
            dayOfWeek = "Wednesday";
        } else if (dayValue == 4) {
            dayOfWeek = "Thursday";
        } else if (dayValue == 5) {
            dayOfWeek = "Friday";
        } else if (dayValue == 6) {
            dayOfWeek = "Saturday";
        }
        System.out.println(dayValue + " stands for " + dayOfWeek);
    }
}