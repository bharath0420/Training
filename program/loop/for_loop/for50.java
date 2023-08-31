/*. Write a program to print a pattern like highest numbers of columns appear in
first row.
Sample Output:
Input the number of rows: 5
12345
2345
345
45
5 */
import java.util.Scanner;
public class for50{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int k=n;
        for(int i=1;i<=n;i++){
            
            int x=i;
            
            for(int j=k;j>=1;j--){ 
                System.out.print(x);
                    x++;
                }
            k--;
            System.out.println();}
    }       
} 