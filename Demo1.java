class test {
    void display() {
        System.out.println("hello 1");
    }
}

public class Demo1 extends test {

    void display() {
        super.display();
        System.out.println("Hello 2 ");
    }

    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.display();

    }
}
