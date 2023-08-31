/*Write a program to display the sum of the series [ 9 + 99 + 999 + 9999 ...]. */
import java.util.Scanner;
public class for23{
    static Scanner sc = new Scanner(System.in);
    
    static int k=1;
    public static int pow(){
        
        k=k*10;
      
        int s=k-1;
        return s;

    }
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n=sc.nextInt();
        int sum =0;
        for(int i=1;i<=n;i++){
            int p =pow();
            System.out.print(p+"+");  
            sum+=p;
        }
            System.out.println("The sum of the serises ="+sum);
    }        
}       

        
