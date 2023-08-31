/*Write a program to print all ASCII character with their values.
Sample Output:
Input the starting value for ASCII characters: 65
Input the ending value for ASCII characters: 75 */
import java.util.Scanner;
public class for61 {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the start number ");

        int n = sc.nextInt();        
        System.out.println("enter the end number ");
        int e=sc.nextInt();
        
        for(int i=n;i<=e;i++){
            char ch=(char)i;
             System.out.println(ch);
        }
    }
}
            