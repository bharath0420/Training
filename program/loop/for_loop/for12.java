/*Write a program to calculate the sum of the series (1*1) + (2*2) + (3*3) +
(4*4) + (5*5) + ... + (n*n). */
import java.util.Scanner;
public class for12 {

    public static void main (String[]args){
      int sum=0;
      System.out.println("enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p=1 ;
        for(int i=1;i<=n;i++){
            p=i*i;
            System.out.println(p);
            sum=sum+p;
        }
        System.out.println("The sum of the above series is:"+sum);
        sc.close();
    }
    
}
