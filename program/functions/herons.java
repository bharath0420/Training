import java.util.Scanner;

public class herons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int z = scanner.nextInt();

        double area = area(n, m, z);

        System.out.printf("%.2f", area);

        scanner.close();
    }

    public static double area(int x, int y, int z) {
        double s = (x + y + z) / 2.0;
        double n = (s * (s - x) * (s - y) * (s - z));
        double i;

        for (i = 0.0000; i * i < n; i += 0.0001);

        return i;
    }
}
