import java.util.Scanner;

public class symmetric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        String result = sym(input);

        System.out.println(result);

        scanner.close();
    }

    public static String sym(String str) {
        int len = str.length();

        if (len % 2 == 0) {
            int j = len / 2;
            for (int i = 0; i < len / 2; i++) {
                if (str.charAt(i) != str.charAt(j)) {
                    return "Not symmetric";
                }
                j++;
            }
            return "Symmetric";
        } else {
            int j = (len / 2) + 1;
            for (int i = 0; i < len / 2; i++) {
                if (str.charAt(i) != str.charAt(j)) {
                    return "Not symmetric";
                }
                j++;
            }
            return "Symmetric";
        }
    }
}
