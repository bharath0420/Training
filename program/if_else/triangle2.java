import java.util.Scanner;
public class triangle2{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        
        
        System.out.println("enter the sides of the triangle");
        int s1= sc.nextInt();
        
        int s2= sc.nextInt();
        int s3= sc.nextInt();
        if(s1+s2>=s3 || s1+s3>=s2 || s2+s3>=s1)
        { 
            System.out.println("Valid Triangle");
        }
        else
        {
            System.out.println("Not a valid Triangle");
        }
    }
}
