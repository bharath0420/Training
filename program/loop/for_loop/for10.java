/* Write a program to find the sum of digits of a given number*/
import java.util.Scanner;
public class for10{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int sum=0;
        for (int i=1;n>0;i++){
            int d=n%10;
            
            sum+=d;
            n/=10;
        }System.out.println("the sum  "+sum);
    }       
}  