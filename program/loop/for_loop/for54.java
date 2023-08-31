/*Write a program to display the pattern power of 2, triangle.
Sample Output:
Display the pattern like pyramid with power of 2:
------------------------------------------------------
Input the number of rows:
      1
    1 2 1
  1 2 4 2 1
1 2 4 8 4 2 1
*/
import java.util.Scanner;
public class for54{
    static Scanner sc = new Scanner(System.in);
    public static int power(int x){
        int p=1 ;
        int y =2 ;
        if(x==0){
            return p;}

        else{for(int i=0;i<x;i++)
        { p=p*y;
    
        } return p;}
        
    }
    
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int k=1;
        for(int i=1;i<=n;i++){
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            int x=0;
            for(int j=1;j<=k;j++){ 

                
               if(j<=k/2){System.out.print(power(x));
                    x++;}
                else{System.out.print(power(x));
                    x--;} 

                
            }
            k+=2;
            System.out.println();}
    }       
} 
