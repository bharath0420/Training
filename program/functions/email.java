import java.util.Scanner;

public class email {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String email = scanner.next();

        boolean isValid = validemail(email);

        if (isValid) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Not a valid Email");
        }

        scanner.close();
    }

    public static boolean validemail(String email) {
        String expectedSuffix = "@gmail.com";
        int len = email.length();
        int suffixLen = expectedSuffix.length();

        if (len < suffixLen) {
            return false;
        }

        int found = 0;
        int k = len - 1;

        for (int i = suffixLen - 1; i >= 0; i--) {
            if (email.charAt(k) != expectedSuffix.charAt(i)) {
                found = 1;
                break;
            }
            k--;
        }

        return found == 0;
    }
}
