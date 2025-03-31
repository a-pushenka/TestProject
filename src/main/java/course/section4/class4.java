package course.section4;

public class class4 { //public = access modifier(access to a class); class = keyword to define a class;
                 // {class body} = class body
    // 34. Code structure
 /*   public static void main(String[] args) { // public = access to a method(main); {code block} = put a code;
                        // (method declaration)
        System.out.println("Hello World"); // main - method -> is a collection statements (one or more),
                                                // that perform an operation
        System.out.println("Hello Anna");
    }
*/


public static void main(String[] args) {

    //35. If-then statement.
    boolean isAlien = false;
    if (isAlien == false) {
        System.out.println("It is not an alien!");
        System.out.println("And I am scared of aliens");
    }

    //36. Logical AND operator &&
    int topScore = 80;
        if (topScore < 100) { // ==  >=   <=   >   < больше, меньше, больше либо равно, equals
            System.out.println("You got the high score!");
    }
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than secondTopScore and less then 100");
        }

    //37. OR operator
          if (topScore > 90 || secondTopScore <= 90) {
              System.out.println("37. Either or both of the conditions are true");
          }

    // 38. ! - Not operator - Logical Complement operator
        boolean isCar = false;
          if (!isCar) {
              System.out.println("38. This is not supposed to happen");
          }

          //39. Ternary Operator
}
}
