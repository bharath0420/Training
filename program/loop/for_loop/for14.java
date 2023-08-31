/*14. Write a program to find the sum of series 1 - X^2/2! + X^4/4!-.... upto nth
term. */
import java.util.Scanner;
public class for14 {
    static Scanner sc = new Scanner(System.in);
    public static double power(int a,double x){
        double p=1 ;
        if(a%2==0){
            for(int i=1;i<=a;i++)
        { p=p*x;
    
        } 
        }return p;
        
    }
    public static  int fact (int y){
        int prod=1;
        if(y%2==0){for(int i=1;i<=y;i++)
        { prod=i*prod;
    
        } 
        
        }
        return prod;
    
        
    }
    public static void main (String[]args){
        System.out.println("enter the number ");
        double x=sc.nextDouble();
        System.out.println("input number of terms");
        int n =sc.nextInt();
        double sum = 1;
    
        for(int i=1;i<=n;i++){
            double k=power(i,x)/fact(i);
            if(i%2==0){ sum-=k;
                System.out.println(sum);

            } else{sum+=k;}
        }System.out.println("The sum is :"+sum);
    }
}
