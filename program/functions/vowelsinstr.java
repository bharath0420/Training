public class vowelsinstr{
    public static void main(String[] args) {
        String str = "Today is a rainy day";
        int len = str.length();

        int count = countVowels(str, len);

        System.out.println("The number of vowels are: " + count);
    }

    public static int countVowels(String str, int len) {
        int count = 0;

        for (int i = 0; i < len; i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
