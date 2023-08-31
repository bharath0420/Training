/*Write a program to display the pattern like right angle triangle with right
justified using digits.
Sample Output:
Input number of rows: 5
     1
    21
   321
  4321
 54321 */
import java.util.Scanner;
public class for53{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            
            int x=i;
            for (int j = n; j>= i; j--) {
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++){ 
                System.out.print(x);
                    x--;
                } 
            
            System.out.println();}
    }       
} 