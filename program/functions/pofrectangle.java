import java.util.*;
public class pofrectangle 
{static Scanner sc= new Scanner(System.in);
    static int pofr(int length,int width)
{
    return (length+width)*2;
}

static public void main(String[]args){
    System.out.println("enter the width");
    int w=sc.nextInt();
    System.out.println("enter the lenght");
    int l=sc.nextInt();
    System.out.println(pofr(l,w));
}
}