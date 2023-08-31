import java.util.Scanner;
public class triangle3{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        
        
        System.out.println("enter the sides of the triangle");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a==b && b==c && a==c)
    {
        System.out.println("the given triangle is Equilateral");
    }
    else if(a==b && b!=c || a==c && a!=b || b==c && a!=c)
    {
        System.out.println("the given triangle is Isosceles");
    }
    else
    {
        System.out.println("The given triangle is Scalene");
    }
}
}