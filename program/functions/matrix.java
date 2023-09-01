import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the first matrix: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] a = new int[m][n];
        System.out.println("Enter the elements row-wise:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the number of rows and columns in the second matrix: ");
        int p = scanner.nextInt();
        int q = scanner.nextInt();

        int[][] b = new int[p][q];
        System.out.println("Enter the elements row-wise:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        int[][] result = multiplication(m, n, p, q, a, b);

        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static int[][] multiplication(int m, int n, int p, int q, int[][] a, int[][] b) {
        if (n != p) {
            System.out.println("Matrix multiplication is not possible.");
            return null;
        }

        int[][] result = new int[m][q];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += a[i][k] * b[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }
}
