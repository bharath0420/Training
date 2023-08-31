/* Write a program to find out the sum of an G.P. series.*/
import java.util.Scanner;
public class for32{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("Input the starting number of the G.P. series:");
        int s= sc.nextInt();
        System.out.println("Input the number of items for the G.P. series:");
        int n=sc.nextInt();
        System.out.println("Input the common difference of G..P. series:");
        int d=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.print(s+"+");
            sum=sum+s;
            s=s*d;
            
        } 
        System.out.print("="+sum);
    }
}

