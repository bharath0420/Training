/*Write a program to display the sum of the series [ 1+x+x^2/2!+x^3/3!+....]. */
import java.util.Scanner;
public class for24 {
    static Scanner sc = new Scanner(System.in);
    public static double power(int a,double x){
        double p=1 ;
        for(int i=1;i<=a;i++)
        { p=p*x;
    
        } System.out.println(p);
        return p;
    }
    public static  int fact (int y){
        int prod=1;
        for(int i=1;i<=y;i++)
        { prod=i*prod;
    
        } return prod;
    
        
    }
    public static void main (String[]args){
        System.out.println("enter the number ");
        double x=sc.nextDouble();
        System.out.println("input number of terms");
        int n =sc.nextInt();
        double sum = 1;
    
        for(int i=1;i<=n;i++){
            double k=power(i,x)/fact(i);
            System.out.println(k);
            sum = sum +k;
        }
        System.out.println("The sum is :"+sum);
    }
    

    
}