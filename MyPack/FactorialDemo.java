import nothing.*;
import java.util.Scanner;

public class FactorialDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the n value : ");
        n = sc.nextInt();
        factorial obj = new factorial();
        obj.displayFactorial(n);
        sc.close();
    }
}
