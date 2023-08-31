import java.util.Scanner;
public class change {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
   
    int x500=0,x200=0,x100=0,x50=0,x20=0,x10=0,x5=0,x2=0,x1=0;
    System.out.printf("enter the amount");
     int fund=sc.nextInt();
    System.out.printf("The total Amount is %d",fund);
    if(fund >= 500)
    {
        x500 = fund/500;
        fund -= x500*500;
    }
    if(fund >= 200)
    {
        x200 = fund/200;
        fund -= x200*200;
    }
    if(fund >= 100)
    {
        x100 = fund/100;
        fund -= x100*100;
    }
    if(fund >= 50)
    {
        x50 = fund/50;
        fund -= x50*50;
    }
    if(fund >= 20)
    {
        x20 = fund/20;
        fund -= x20*20;
    }
    if(fund >= 10)
    {
        x10 = fund/10;
        fund -= x10*10;
    }
    if(fund >= 5)
    {
        x5 = fund/5;
        fund -= x5*5;
    }
    if(fund >= 2)
    {
        x2 = fund/2;
        fund -= x2*2;
    }
    if(fund >= 1)
    {
        x1 = fund;
    }
    System.out.printf("\nthe total notes of 500 are %d",x500);
    System.out.printf("\nthe total notes of 200 are %d",x200);
    System.out.printf("\nthe total notes of 100 are %d",x100);
    System.out.printf("\nthe total notes of 50 are %d",x50);
    System.out.printf("\nthe total notes of 20 are %d",x20);
    System.out.printf("\nthe total notes of 10 are %d",x10);
    System.out.printf("\nthe total notes of 5  are %d",x5);
    System.out.printf("\nthe total notes of 1 are %d",x1);
}
}
