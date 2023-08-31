/* Write a program to calculate the sum of the series
1.2+2.3+3.4+4.5+5.6+.......
Sample Output:
Input the last integer between 1 to 98 without fraction you want to add: 10 1.2 +
2.3 + 3.4 + 4.5 + 5.6 + 6.7 + 7.8 + 8.9 + 9.1 + 10.11 The sum of the series =59.61*/
import java.util.*;
public class for67{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        double n = sc.nextDouble();
        double sum =0;
        double x =0;
        double y =0;
        for ( double i=1;i <= n;i++)
    {
        if( i < 9)
            y=0.1;
        else
            y=0.01;
        x=((i+1)*y)+i;
        System.out.printf("%.2f",x);
        System.out.print("+");
        
        sum+=x;
    }
    System.out.println("the sum of the series"+sum);
}
}