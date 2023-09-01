import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial balance, time, and interest rate: ");

        int p = scanner.nextInt();
        int t = scanner.nextInt();
        float r = scanner.nextFloat();

        float result = ci(p, t, r);
        System.out.println(result);

        scanner.close();
    }

    public static float ci(int p, int t, float r) {
        float ci = 1;
        float y = (1 + (r / 100));

        for (int j = 0; j < t; j++) {
            ci *= y;
        }

        System.out.println(ci * p);
        return (ci * p) - p;
    }
}
