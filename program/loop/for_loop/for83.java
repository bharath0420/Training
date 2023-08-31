/*Write a program to compute the sum of the digits of an integer.
Sample Output:
Input any number: 25
The sum of the digits of the number 25 is: 7 */
import java.util.Scanner;
public class for83{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int sum=0;
        for (int i=1;n>0;i++){
            int d=n%10;
            
            sum+=d;
            n/=10;
        }System.out.println("the sum "+sum);
    }       
}  