package section6;

public class TraditionalSwitchStatementChallenge {
    public static void main(String[] args) {
     char charValue = 'A';
     switch (charValue) {
         case 'A':
             System.out.println(charValue + " = Able");
             break;
         case 'B':
             System.out.println(charValue + " = Baker");
             break;
         case 'C':
             System.out.println(charValue + " = Charlie");
             break;
         case 'D':
             System.out.println(charValue + " = Dog");
             break;
         case 'E':
             System.out.println(charValue + " = Easy");
             break;
         default:
            System.out.println(charValue + " = This letter is not found in NATO phonetic alphabet.");
            break;
        }
    }
}