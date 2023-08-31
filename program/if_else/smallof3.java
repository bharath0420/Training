import java.util.Scanner;
public class smallof3{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        
        
        System.out.println("enter the 3 numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int s=0;
        if(a<b && a<c)
        s = a;
    else if(b<a && b<c)
        s= b;
    else
        s= c;
    System.out.printf("\nSmallest number is: %d", s);
    }
}   
