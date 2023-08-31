 /* Write a program to display the pattern like right angle triangle using numbers*/
import java.util.Scanner;
public class for38{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();int k=1;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){ 
                System.out.print(k);
                k++;
            }
            System.out.println();}
    }       
} 
