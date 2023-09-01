import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String a = "cat";
        String b = "act";

        boolean s = anagrams(a, b);

        if (s) {
            System.out.println("The two strings are anagrams");
        } else {
            System.out.println("The two strings are not anagrams");
        }
    }

    public static boolean anagrams(String a, String b) {
        
        a = a.replaceAll("\\s", "").toLowerCase();
        b = b.replaceAll("\\s", "").toLowerCase();

       
        if (a.length() != b.length()) {
            return false;
        }

        
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();
        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);

        
        return Arrays.equals(charArrayA, charArrayB);
    }
}
