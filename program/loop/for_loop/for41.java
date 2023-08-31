 /* Write a program to display the pattern like  triangle using numbers*/
import java.util.Scanner;
public class for41{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){ 
                System.out.print(i+" ");
               
            }
            System.out.println();}
    }       
} 
