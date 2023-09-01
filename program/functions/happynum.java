import java.util.Scanner;

public class happynum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = scanner.nextInt();

        boolean h = happynumber(number);
        
        if (h) {
            System.out.println("Given number is a happy number");
        } else {
            System.out.println("Given number is not a happy number");
        }

        scanner.close();
    }

    public static boolean happynumber(int x) {
        while (x >= 10) {
            int sum = 0;
            while (x > 0) {
                int digit = x % 10;
                sum += digit * digit;
                x /= 10;
            }
            x = sum;
        }

        return x == 1 || x == 7; // Happy numbers end in 1 or 7.
    }
}
