
import java.util.*;

public class sortings {
    void display() {
        System.out.println("hello rishi kumar ");

    }

    public static void bubblesort(int a[], int n) {
        System.out.println("The array before sorting :");
        for (int i = 0; i < n; i++) {
            System.out.print("  " + a[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("The elements in the array after sorting : ");
        for (int i = 0; i < n; i++) {
            System.out.print("  " + a[i]);
        }

    }

    public static void insertionSort(int a[], int n) {
        System.out.println();
        System.out.println("The elements  before insertion sort : ");
        printArray(a, n);
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int temp = a[i];
            while (j >= 0 && temp < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
        System.out.println();
        System.out.println("The elements in the array after sorting : ");
        printArray(a, n);
    }

    public static void printArray(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("  " + a[i]);
        }
    }

    public static void selectionSort(int a[], int n) {
        System.out.println();
        System.out.println("The elements before sorting : ");
        printArray(a, n);
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
        System.out.println("The elements after sorting in the Descending order  : ");
        printArray(a, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        int n;
        System.out.println("Enter the no of elements into the array :");
        n = sc.nextInt();
        System.out.println("Enter the elements into array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Choose an option : ");
        System.out.println("1) Display elements in the array.");
        System.out.println("2) bubble sort ");
        System.out.println("3) insertion sort ");
        System.out.println("4) selection sort  in descending order ");
        System.out.println("5) exit ");
        System.out.println("Enter the option :");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                printArray(arr, n);
                break;
            case 2:
                bubblesort(arr, n);
                break;
            case 3:
                insertionSort(arr, n);
                break;
            case 4:
                selectionSort(arr, n);
                break;
            case 5:
                System.out.println("INVALID OPTION");
                break;
        }

    }
}
