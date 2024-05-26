// to call methods from static main() method

public class Demo {
    public void display() {
        System.out.println("Hello 1");
    }

    public static void main(String args[]) {
        Demo d1 = new Demo();

        d1.display();
        d1.display();
        d1.display();
    }
}
