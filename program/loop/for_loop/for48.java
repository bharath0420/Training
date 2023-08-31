/*Write a program to display the pattern like pyramid using the alphabet.
Sample Output:
Input the number of Letters (less than 26) in the Pyramid: 5
A
A B A
A B C B A
A B C D C B A
A B C D E D C B A */
import java.util.Scanner;
public class for48{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int k=1;
        for(int i=1;i<=n;i++){
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            char x=65;
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