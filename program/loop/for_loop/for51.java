/*. Write a program to display the pattern using digits with right justified and the
highest columns appears in first row.
Sample Output:
Input number of rows: 5
12345
1234
123
12
1*/
import java.util.Scanner;
public class for51{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int k=n;
        for(int i=1;i<=n;i++){
            
            int x=1;
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            
            for(int j=k;j>=1;j--){ 
                System.out.print(x);
                    x++;
                } 
            k--;
            System.out.println();}
    }       
} 