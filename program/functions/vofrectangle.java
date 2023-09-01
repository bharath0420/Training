import java.util.*;
public class vofrectangle 
{static Scanner sc= new Scanner(System.in);
    static int vofr(int length,int width,int height)
{
    return length*width*height;
}

static public void main(String[]args){
    System.out.println("enter the hieght");
    int h=sc.nextInt();
    System.out.println("enter the lenght");
    int l=sc.nextInt();
    System.out.println("enter the width");
    int w=sc.nextInt();
    System.out.println(vofr(l,w,h));

}
}