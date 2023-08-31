 /* Write a program to display such a pattern for n number of rows using
number. Each row will contain odd numbers of number. The first and last number
of each row will be 1 and middle column will be the row number.
Sample Output:
Input number of rows: 5
1
121
12321
1234321
123454321*/
import java.util.Scanner;
public class for47{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int k=1;
        for(int i=1;i<=n;i++){
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            int x=1;
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
