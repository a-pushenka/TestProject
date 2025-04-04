package section5;

public class BarkingDog {
    public static void main(String[] args) {
        boolean dogIsBarking = shouldWakeUp(true, 1);
        System.out.println(dogIsBarking);
        dogIsBarking = shouldWakeUp(false, 2);
        System.out.println(dogIsBarking);
        dogIsBarking = shouldWakeUp(true, 8);
        System.out.println(dogIsBarking);
        dogIsBarking = shouldWakeUp(true, -1);
        System.out.println(dogIsBarking);
    }
    public static boolean shouldWakeUp(boolean dogIsBarking, int hourOfDay) {

        if (dogIsBarking == false) {
            return false;
        } else if (hourOfDay < 8 && hourOfDay >= 0) {
            return true;
        } else if (hourOfDay > 22 && hourOfDay == 23) {
            return true;
        } else if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        return false;
    }
}

//public class BarkingDog {
//
//    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
//
//        // if the hourOfDay is less than 0 or greater than 23, it's not
//        // valid, so return false
//        if (hourOfDay < 0 || hourOfDay > 23) {
//            return false;
//        }
//        // if the dog is barking, and it's before 8am or after 10pm,
//        // then you should wake up.
//        return barking && (hourOfDay < 8 || hourOfDay > 22);
//    }
//}
