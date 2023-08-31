/* Write a program that takes a person's age as input and prints "Child" if the age is under
18, "Adult" if the age is between 18 and 65, and "Senior" if the age is over 65.*/
import java.util.Scanner;
public class age{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int age = sc.nextInt();
        if(age <18)
        System.out.println("child");
    else if(age>=18 && age<65)
        System.out.println("adult");
    else
        System.out.println("senior");
    }
}