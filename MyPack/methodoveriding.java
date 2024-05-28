
class parent {

    void display() {
        System.out.println("Hello jarvis ");
    }
}

class child extends parent {
    void display() {
        super.display();
        System.out.println("Hello jack sparrow.");
    }
}

public class methodoveriding {
    public static void main(String[] args) {

        child obj = new child();
        obj.display();
    }

}
// if the class is final then the method cannot be overided
// static methods also cannot be overrided.
