/* Write a program that will print the first N numbers for a specific base.
Sample Output:
Print the first N numbers for a specific base:
The number 11 in base 10 = 1*(10^1)+1*(10^0)=11
Similarly the number 11 in base 7 = 1*(7^1)+1*(7^0)=8*/
import java.util.Scanner;
public class for68{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("Input the number of term:  ");
        int n= sc.nextInt();
        int sum =0;
        System.out.println("Input the base: ");
        int b=sc.nextInt();

         for (int i = 1; i <=n; i++) 
    {
       int x= i % b;
       int y = i / b;
        sum= y* 10 + x;
        System.out.print(sum+" ");
    }
}
}
