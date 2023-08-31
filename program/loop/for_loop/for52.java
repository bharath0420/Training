/*Write a program to display the pattern using digits with left justified and the
highest columns appears in first row in descending order.
Sample Output:Input number of rows: 5
 5 4 3 2 1
  4 3 2 1
   3 2 1
     2 1
       1 */
import java.util.Scanner;
public class for52{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int k=n;
        for(int i=1;i<=n;i++){
            
            int x=k;
           
            
            for(int j=k;j>=1;j--){ 
                System.out.print(x);
                    x--;
                } 
        for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            k--;
            System.out.println();}
    }       
} 