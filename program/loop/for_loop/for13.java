//Write a program to calculate the series (1) + (1+2) + (1+2+3) + (1+2+3+4) +... + (1+2+3+4+...+n)//
import java.util.Scanner;
public class for13 {
   
    
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE VALUE");
        int u=sc.nextInt();
        int total=0;
        int s=0;
        for (int i =1;i<=u;i++){
            s=s+i;
            total=total+s;
            System.out.println(s);
        
        
        }
        System.out.println("The sum of the above series is:"+total);
        sc.close();
    }
    
}
