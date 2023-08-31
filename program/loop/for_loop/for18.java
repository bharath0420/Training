/*Write a program to display the cube of the number upto given an integer.
 */
import java.util.Scanner;
public class for18 {
    static Scanner sc = new Scanner(System.in);
    public static int power(int x){
        int p=1 ;
        for(int i=1;i<=3;i++)
        { p=p*x;
    
        } return p;
    }
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Number is :"+i+"and the cube of "+i+" is:"+power(i));

        }

    }
}