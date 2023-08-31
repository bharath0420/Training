/* Write a program to display the number in reverse order.*/
import java.util.Scanner;
public class for30 {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        for(int i=n;i>0;){
            int x=i%10;
            System.out.print(x);
            i=i/10;
        }

    }
}
