/* Write a program to find power of any number using for loop.
Sample Output:
Input the base: 2
Input the exponent: 5
2 ^ 5 = 32 */
import java.util.Scanner;
public class for62 {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the base ");

        int b= sc.nextInt();        
        System.out.println("enter the exponent ");
        int p=sc.nextInt();
        int pow=1;
        for (int i = 1; i <= p; i++) {
            pow *= b;
        }
        System.out.println(b+"^"+p+"="+pow);
    }
}