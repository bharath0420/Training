import java.util.Scanner;
public class dayofmonths{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int a = sc.nextInt();
        if(a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12)
    {
        System.out.println("31 days");
    }
    else if( a == 4 || a == 6 || a == 9 || a == 11)
    {
        System.out.println("30 days");
    }else if(a == 2 ){
        System.out.println("28 or 29days");
    }
    else
    {
        System.out.println("Enter within 1 to 12 numbers");
    }
}

}