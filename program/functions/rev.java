import java.util.Scanner;

public class rev{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        reverse(a, n, b);

        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }

        scanner.close();
    }

    public static void reverse(int[] n, int l, int[] b) {
        int k = 0;
        for (int i = l - 1; i >= 0; i--) {
            b[k] = n[i];
            k++;
        }
    }
}
