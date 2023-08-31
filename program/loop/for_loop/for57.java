/*Write a program to find the first and last digit of a number also sum of first and last digit  */
import java.util.Scanner;
public class for57{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
             
        System.out.println("enter the number");
        int n= sc.nextInt();
        int l=n%10,s;
        int t=n;
        for(int i=t;i>0;i/=10){

            
            if(i<10){s=i;    
                System.out.println("The first digit of "+n+" is:"+s);
                System.out.println("The last digit of "+n+" is:"+l);
                int sum=l+s;
             System.out.println("The sum of first and last digit of "+n+" is:"+sum);
            }

            
        }
        
        

    }
}
