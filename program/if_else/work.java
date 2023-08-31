import java.util.Scanner;
public class work{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        
        
       System.out.println("enter the work exp");
        int a= sc.nextInt();
      System.out.println("enter the age");
        int b= sc.nextInt();
        if(b<25 && a<1)
        System.out.println(" entry level");
       else if((b>=25 && b<40) && (a>=1 && a<5))
        System.out.println("junior");
       else if (b>=40 &&(a>=5 && a<=10))
        System.out.println("senior");
       else
        System.out.println("expert");
    }
}
