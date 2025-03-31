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
        myFirstNumber = 1000; // myFirstNumber is now 1000
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
        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println(" Integer Minimum Value = " + myMinIntValue);
        System.out.println(" Integer Value Range (from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")" );

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
 /*     short myMinShortValue = Short.MIN_VALUE; int myMinIntValue = Integer.MIN_VALUE;
        System.out.println(myMinShortValue);
        System.out.println(myMinIntValue);
        byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);
        byte firstByte = 1, secondByte = 2;
        System.out.println(firstByte);
        System.out.println(secondByte);
        int myTotal= (myMinIntValue / 2);
        System.out.println(myTotal);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println(myNewByteValue);
        short myNewShortValue = (short) (myMinShortValue / 2);
*/
        //21. Challenge
 /*       byte myNewByteValue = 2;
        short myNewShortValue = 3;
        int myNewIntValue = 5;
        long myNewLongValue = (long) (50000 + 10 * (myNewByteValue + myNewShortValue + myNewIntValue));
        System.out.println(myNewByteValue);
        System.out.println(myNewShortValue);
        System.out.println(myNewIntValue);
        System.out.println(myNewLongValue);
*/
        //22. Float, Double
/*        System.out.println("Float Value Range (from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")" );
        System.out.println("Double Value Range (from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")" );
        float myFloatValue = 5f; double myDoubleValue = 5d;
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);
        float myOtherFloatValue = 5.25f;
        System.out.println(myOtherFloatValue);
*/
// 23
/*      double myPoundValue = 2d;
        double convertPoundToKg = myPoundValue * 0.45359237d;
        System.out.println("Converted kilograms = " + convertPoundToKg);
*/
        // 24. Char(stored as a whole number literal) and Boolean primitive data types
/*      char myUnicode = '\u0044';
        System.out.println(myUnicode);
        char myDecimalCode = 68;
        System.out.println(myDecimalCode);
        char mySimpleChar = '?';
        char myUnicodeChar = '\u003F';
        char myDecimalChar = 63;
        System.out.println("My values are: "
                + mySimpleChar + " => simple char, "
                + myUnicodeChar + " => unicode, "
                + myUnicodeChar + " => decimal");
        boolean isCustomerOverTwentyOne = true;
        boolean isMarried = true;
        boolean hasChildren = true;
        boolean isEligibleForDiscount = true;
        boolean myFaulseBooleanValue = false;
        System.out.println("Is customer over 21? " + isCustomerOverTwentyOne);
        System.out.println("Does he/she married? " + isMarried);
 */
        // 25. Primitives (byte, float, short, char, long, double, boolean, int);
        // Classes: Wrappers(Boolean, Byte, Character..), BigDecimal, String.
/*        String lastString = "10"; int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        double doubleNumber = 120.47; lastString = lastString + doubleNumber;
        System.out.println(lastString);
        System.out.println(myInt);
        System.out.println(doubleNumber);
*/
        // 26. Operators(+, *, - / %), Operand ( = 10  20  lastString), Expressions (combining variables, literals eg 10+5=15)
/*        char firstChar = 'A'; char secondChar = 'B';
        System.out.println(firstChar+secondChar); //A=65, B=66 (Html code in https://symbl.cc/en/unicode-table/)
        System.out.println(("" + firstChar + secondChar));
        int result = 5;
        result = result % 3; // 5/3=1 и остаток 2, remainder= 2;
        System.out.println(result);
*/
        //27. Post-fix Increment operator (++);
        // addition compound assignment +=1;
        // Post-fix Decrement operator (--);
        // Substraction compound assignment -=1;
        // multiplication compound assignment result *= 5;
        // division compound assignment result /=5;
        int result = 1;
        --result;
      //  result--; // or result = result -1; or result--; or result -= 1;
        System.out.println(result); // 0
        result = 1;
        result += 7; // or result = result + 7; or result++ (+1); or result += 1;
        System.out.println(result); //2
        result = 10;
        result -= 5.5; // it's = to result = (int) (result - 5.5)
        System.out.println("result = " + result);
        double resultD = 10;
        resultD -= 5.5;
        System.out.println("result of double variable = " + resultD);

        // --result pre-fix decrement
        // result-- post-fix decrement
        int testQwerty = 5;
        System.out.println(--testQwerty);
        // int testQwerty = 5;
        // testQwerty = testQwerty - 1;
        // print testQwerty
        int testQwerty2 = 5;
        System.out.println(testQwerty2--);
        // int testQwerty2 = 5;
        // print testQwerty2
        //testQwerty2 = testQwerty2 - 1
        System.out.println(testQwerty2);


    }
}
