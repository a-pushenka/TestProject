package section6;

public class TestClass {
    String name;
    int number;
    static int amount = 0;

    public TestClass(String name, int number) {
        this.name = name;
        this.number = number;
        amount++;
    }

    public void print() {
        System.out.println(name + " " + number);
    }

    public static void printAmount() {
        System.out.println(amount);
    }
}


