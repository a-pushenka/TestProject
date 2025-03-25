package course.section3;

public class Test {
    public static void main(String[] args) {
       // System.out.println("Hello World");
        //comment
        /*
        comment 2
        ha-ha
         */

        // 17.Variables in expressions
/*
        int myFirstNumber = 5;
        myFirstNumber = 10;
        myFirstNumber = 1000; myFirstNumber is now 1000
        System.out.println(myFirstNumber);
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        myThirdNumber = myFirstNumber * 2;
        myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
*/

        //18.Primitive types: Integer Range and Wrapper Classes. Overflow and underflow
/*        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println(" Integer Minimum Value = " + myMinIntValue);
        System.out.println(" Integer Value Range (from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")" );
*/
        // 19 - Understanding byte short long. Byte - byte wrapper class.
/*
        System.out.println("Byte Value Range (from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")" );
        System.out.println("Short Value Range (from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")" );
        System.out.println("A long has a width of " + Long.SIZE);
        System.out.println("Long Value Range (from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")" );
        long bigLongLiteralValue = 32767;
                System.out.println(bigLongLiteralValue);
*/
// 20.Casting with numeric primitive types
        short myMinShortValue = Short.MIN_VALUE; int myMinIntValue = Integer.MIN_VALUE;
        System.out.println(myMinShortValue);
        System.out.println(myMinIntValue);
        byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);
    }
}
