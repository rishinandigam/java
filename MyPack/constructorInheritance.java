import java.util.*;

class Animal {
    Scanner sc = new Scanner(System.in);

    Animal() {
        System.out.println("Enter the name : ");
        String name;
        name = sc.nextLine();
        System.out.println(" The name is : " + name);
    }

}

class Dog extends Animal {
    public String str1 = "Rishi";

    Dog() {
        System.out.println("My friend " + str1 + "is a dog  ");
    }
}

public class constructorInheritance {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sc.close();
    }

}
