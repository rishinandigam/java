
class X {
    X() {
        System.out.println("Insidde x's constructor");
    }

}

class Y extends X {
    Y() {
        System.out.println("Inside Y's constructor");
    }
}

class Z extends Y {
    Z() {
        System.out.println("Inside z's constructor ");
    }
}

public class OrderOfConstructorCallDemo {
    public static void main(String[] args) {
        Z all = new Z();
        System.out.println(all);
    }

}
