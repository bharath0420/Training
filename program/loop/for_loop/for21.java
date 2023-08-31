/*Write a program to display the n terms of even natural number and their
sum. */
import java.util.Scanner;
public class for21 {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n=sc.nextInt();
        int sum=0;

        for(int i=2;i<=2*n;i+=2){
            System.out.print(i);
            sum+=i;
        }System.out.println("The Sum of even Natural Numbers upto "+n +"terms:"+sum);
        
sc.close();
    }
}   