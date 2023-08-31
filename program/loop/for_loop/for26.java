/*Write a program to find the sum of the series 1 +11 + 111 + 1111 + .. n */
import java.util.Scanner;
public class for26{
    static Scanner sc = new Scanner(System.in);
    
    static int k=1;
    static int  s=1;

    public static int pow(){
        
        k=k*10;
      
        s=s+k;
        return s;

    }
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n=sc.nextInt();
        int sum =1;
        for(int i=2;i<=n;i++){
            int p =pow();
            System.out.print(p+"+");  
            sum+=p;
        }
            System.out.println("The sum of the serises ="+sum);
    }        
}       
