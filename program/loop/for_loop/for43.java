 /* Write a program to display the pattern like Floyd's Triangle.*/
import java.util.Scanner;
public class for43{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        boolean k;
        for(int i=1;i<=n;i++){ 
            if(i%2!=0){k=false;}
            else{ k=true;}
            
            for(int j=1;j<=i;j++){
                k=(k)? false: true;
                int x=(k) ? 1 : 0;
                 System.out.print(x);
               

            }
            System.out.println();}
    }       
} 
/* i/p n=5 
o/p 
1
01
101
0101
10101

 */