import java.util.Scanner;

public class pascal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int n = sc.nextInt();
        printPascal(n);
        sc.close();
    }

    public static void printPascal(int n) {
        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j < n- i; j++) {
                System.out.print("   "); 
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%6d", num);
                num= num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
