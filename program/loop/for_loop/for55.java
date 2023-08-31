/* Write a program to display such a pattern for n number of rows using
number. Each row will contain odd numbers of number. The first and last number
of each row will be 1 and middle column will be the row number. n numbers of
columns will appear in 1st row.
Sample Output:
Input number of rows: 7
 1234567654321
  12345654321
   123454321
    1234321
     12321
      121
       1 */
import java.util.Scanner;
public class for55{
    static Scanner sc = new Scanner(System.in);
   
       
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int k=2*n-1;
        for(int i=1;i<=n;i++){
            for (int j = 0; j<= i; j++) {
                System.out.print(" ");
            }
            int x=0;
            for(int j=k;j>=1;j--){ 

                
               if(j<=k/2){x--;
                System.out.print(x);
                    }
                else{ x++;
                    System.out.print(x);
                    } 

                
            }
            
            k-=2;
            System.out.println();}
    }       
} 
