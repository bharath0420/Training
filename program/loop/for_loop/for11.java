//Write a program to find the sum of the series 1 + 1/2^2 + 1/3^3 + ..+ 1/n^n//
import java.util.Scanner;
class for11{
  public static double power(int x){
    double p=1 ;
    for(int i=1;i<=x;i++)
    { p=p*x;

    } return p;
  }
    public static void main (String[]args){
        double sum=0;
        System.out.println("enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            
            
             double x= 1/power(i);
             
             
             sum=x+sum;


        }
        System.out.println("The sum of the above series is:"+sum);
        sc.close();
    }
}