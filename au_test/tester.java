package au_test;

import automobile.*;

@SuppressWarnings("unused")
public class tester {
    public static void main(String s[]) {
        System.out.println(" I am tester class defined inside au_tester package");
        System.out.println(" I had imported all classes of automobile package");
        System.out.println(" Creating instances of Vehicle, Car and Bike ");
        System.out.println(" ------------------------");
        Vehicle v = new Vehicle();
        Car c = new Car();
        Bike b = new Bike();
        System.out.println(" Accessing the functions using objects");
        System.out.println(" --------------------- ");
        v.printname();
        c.printname();
        b.printname();

    }
}