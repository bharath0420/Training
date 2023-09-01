import java.util.Scanner;

public class lcm{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int result = l(m, n);

        System.out.println("The LCM is: " + result);

        scanner.close();
    }

    public static int l( int num1, int num2) {
        int m = (num1 > num2) ? num1 : num2;
        int num3 = 0;

        for (int i = 2; i <= m; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                num3 = i;
            }
        }

        return (num1 * num2) / num3;
    }
}
