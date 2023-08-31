/*Write a program to display n terms of natural number and their sum. */
import java.util.Scanner;
public class for3{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            System.out.print(i+" ");
            sum+=i;
        }System.out.println("the sum  "+sum);
    }       
}  
