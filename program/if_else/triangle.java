import java.util.Scanner;
public class triangle{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        
        
        System.out.println("enter the angle of the triangle");
        int a= sc.nextInt();
        
        int b= sc.nextInt();
        int c=sc.nextInt();
        if(a+b+c==180)
    {
        System.out.println("Triangle Valid");
    }
    else
    {
        System.out.println("Not a valid Triangle");
    }
}
}