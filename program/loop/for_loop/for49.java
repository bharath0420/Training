/*. Write a program to print a pyramid of digits as shown below for n number of
lines.
1
232
34543
4567654
567898765 */
import java.util.Scanner;
public class for49{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int k=1;
        for(int i=1;i<=n;i++){
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            int x=i;
            for(int j=1;j<=k;j++){ 

                
               if(j<=k/2){System.out.print(x);
                    x++;}
                else{System.out.print(x);
                    x--;} 

                
            }
            k+=2;
            System.out.println();}
    }       
} 