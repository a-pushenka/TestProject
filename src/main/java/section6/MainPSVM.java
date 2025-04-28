package section6;

public class MainPSVM {
    public static void main(String[] args) {
        TestClass.printAmount(); // TestClaa is like a data type which was created in TestClass class
        TestClass qwerty = new TestClass("Apple", 16);
        TestClass.printAmount();
        TestClass qwerty2 = new TestClass("Orange", 6);
        TestClass.printAmount();
        qwerty.print();
        qwerty2.print();
    }
}