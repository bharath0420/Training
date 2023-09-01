import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int result = gd(num1, num2);
        System.out.println(result);

        scanner.close();
    }

    public static int gd(int num1, int num2) {
        int m = (num1 > num2) ? num1 : num2;
        int num3 = 0;

        for (int i = 2; i <= m; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                num3 = i;
            }
        }

        return num3;
    }
}
