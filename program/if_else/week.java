import java.util.*;
class week{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int x=sc.nextInt();
        if(x==1)
    {
        System.out.println("Monday");
    }
    else if(x==2)
    {
        System.out.println("Tuesday");
    }
    else if(x==3)
    {
        System.out.println("Wednesday");
    }
    else if(x==4)
    {
        System.out.println("Thursday");
    }
    else if(x==5)
    {
        System.out.println("Friday");
    }
    else if(x==6)
    {
        System.out.println("Saturday");
    }
    else
    {
        System.out.println("Enter within 1 to 7 numbers");
    } sc.close();
}

}