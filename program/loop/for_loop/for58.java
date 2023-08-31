/*Write a program to calculate product of digits of any number. */
import java.util.Scanner;
public class for58{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int prod=1;
        for (int i=1;n>0;i++){
            int d=n%10;
            
            prod*=d;
            n/=10;
        }System.out.println("the prod "+prod);
    }       
}  