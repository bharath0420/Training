/* Write a program to display the n terms of harmonic series and their sum.
1 + 1/2 + 1/3 + 1/4 + 1/5 ... 1/n terms*/
import java.util.Scanner;
public class for22{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n=sc.nextInt();
        double sum =0;
        for(int i=1;i<=n;i++){
            double x= 1d/i;  
            System.out.print("1/"+i+"+");  
          sum=x+sum;

        }
        System.out.println(" The sum of the series upto "+n+"terms:"+sum);
       
    }
}