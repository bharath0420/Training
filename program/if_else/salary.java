import java.util.Scanner;
public class  salary{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the base salary ");
        double bs= sc.nextDouble();
         double d=0;
         double h=0;
        if(bs<=10000){
            d=bs*0.8;
            h=bs*0.2;
    }
    else if(bs<=20000){
        d= bs*0.9;
        h= bs * 0.25;
    }
    else {
        d = bs*0.95;
        h = bs * 0.3;
    }
     double gs = bs + h + d;
    System.out.println("the Gross Salary "+gs);
}
}