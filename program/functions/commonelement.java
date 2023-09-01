import java.util.Scanner;

public class commonelement{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int m = scanner.nextInt();
        int[] a = new int[m];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < m; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int n = scanner.nextInt();
        int[] b = new int[n];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        common(a, b, m, n);

        scanner.close();
    }

    public static void common(int[] a, int[] b, int m, int n) {
        System.out.print("Common elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
}
