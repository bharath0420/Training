import java.util.*;

public class binarysearch {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the elements to find :");
        int x=sc.nextInt();

        Arrays.sort(a);
        String result = binary(a, x);

        System.out.println(result);
    }

    public static String binary(int[] a, int x) {
        int first = 0, last = a.length - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (a[mid] == x) {
                return "Number present in array";
            } else if (a[mid] < x) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return "Number not present in array";
    }
}
