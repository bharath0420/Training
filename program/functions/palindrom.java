import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        String result = pali(input);

        System.out.println(result);

        scanner.close();
    }

    public static String pali(String str) {
        int len = str.length();
        int j = len - 1;

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(j)) {
                return "Not palindrome";
            }
            j--;
        }

        return "Palindrome";
    }
}
