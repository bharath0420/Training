/* Write a program to display the n terms of odd natural number and their sum.*/
import java.util.Scanner;
public class for20 {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n=sc.nextInt();
        int sum=0;

        for(int i=1;i<=2*n;i+=2){
            System.out.print(i);
            sum+=i;
        }
        System.out.println("The Sum of odd Natural Numbers"+n +"terms:"+sum);
        
sc.close();
    }
}   