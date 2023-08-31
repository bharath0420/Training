/* Write a program to display the multiplication table vertically from 1 to n.*/
import java.util.Scanner;
public class for19 {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){

            for(int j=1;j<=10;j++){
                System.out.println(i+"*"+j+"="+(i*j));
            }
            
            
        }
    }   
}