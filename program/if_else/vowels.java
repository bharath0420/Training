import java.util.Scanner;
public class vowels{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the char ");
        char a=sc.next().charAt(0);
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U' )
    {
        System.out.println("It is a vowel");
    } 
    else
    {
        System.out.println("it is not a vowel");
    }
}
}