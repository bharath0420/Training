import java.util.Scanner;
public class large{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        
        
        System.out.printf("enter two number");
        int a= sc.nextInt();
        
        int b= sc.nextInt();
         if( a == b)
        System.out.printf("%dand %d are equal.", a,b);
    else if (a > b)
        System.out.printf("%d is greater than %d.", a,b);
    else
        System.out.printf("%d is greater than %d.",b,a);
    }
}