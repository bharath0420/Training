/*Write a program to display the first n terms of Fibonacci series. */
import java.util.Scanner;
public class for27 {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int x=0,y=1,z=0;
        System.out.print(x+" "+y);
        for (int i=2;i<n;i++){
            z=x+y;
            System.out.print(" "+z);
            x=y;
            y=z;
        }
    }
    }