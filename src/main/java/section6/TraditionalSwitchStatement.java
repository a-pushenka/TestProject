package section6;

public class TraditionalSwitchStatement {
    public static void main(String[] args) {
        int switchValue1 = 8;
        switch (switchValue1) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3, or 4, or 5");
                System.out.println("Actually it was a " + switchValue1);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }
    }
}
