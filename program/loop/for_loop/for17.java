/*17. Write a program to print a square pattern with # character.*/
import java.util.Scanner;
public class for17 {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){ 
                System.out.print("#");
            }
            System.out.println();
        }sc.close();
    }
    
   
    
}
