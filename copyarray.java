
public class copyarray {
    public static void main(String[] args) {
        int source[] = { 10, 20, 39, 45, 56, 67 };
        int dest[] = new int[10];
        System.arraycopy(source, 0, dest, 0, 5);
        System.out.println("The values in the destinaton array are :");
        for (int i = 0; i < dest.length; i++) {

            System.out.println(dest[i]);
        }
        System.out.println("The elements in the source array are : ");
        for (int i = 0; i < source.length; i++) {
            System.out.println(source[i]);
        }

    }

}
