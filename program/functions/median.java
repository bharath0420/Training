import java.util.Scanner;
import java.util.Arrays;

public class median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        double median = findmedian(a);

        System.out.println("The median is: " + median);

        scanner.close();
    }

    public static double findmedian(int[] a) {
        int n = a.length;
        if (n % 2 == 0) {
            int mid1 = a[n / 2 - 1];
            int mid2 = a[n / 2];
            return (double) (mid1 + mid2) / 2;
        } else {
            return (double) a[n / 2];
        }
    }
}
