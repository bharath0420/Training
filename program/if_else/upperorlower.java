import java.util.Scanner;
public class upperorlower{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the char ");
        char a=sc.next().charAt(0);
        if(a >= 'a' && a <='z') 
    {
        System.out.println("Lower case");
    }
    else
    {
        System.out.println("Upper case");
    }
}
}