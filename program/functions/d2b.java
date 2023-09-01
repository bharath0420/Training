import java.util.Scanner;

public class d2b{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        System.out.print("Binary representation: ");
        dectoBin(a);

        scanner.close();
    }

    public static void dectoBin(int a) {
        int[] binaryArray = new int[32];
        int k = 0;

        while (a > 0) {
            binaryArray[k] = a % 2;
            k++;
            a = a / 2;
        }

        for (int i = k - 1; i >= 0; i--) {
            System.out.print(binaryArray[i]);
        }
    }
}
