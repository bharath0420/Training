import java.util.Scanner;
public class profitorloss{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        
        
        System.out.println("enter cost price");
        int cp= sc.nextInt();
        System.out.println("enter selling price");
        int sp= sc.nextInt();
        int p=0;
        int l=0;
        if(sp>cp)
    {
        p=sp-cp;
        System.out.printf("The profit is %d",p);
    }
    else if(cp > sp)
    {
        l= cp-sp;
        System.out.printf("The loss is %d",l);
    }
    else
    {
        System.out.printf("No loss no profit");
    }

}
}