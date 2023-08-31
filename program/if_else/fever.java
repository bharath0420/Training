/*Write a program that takes a temperature as input and prints "Fever" if the temperature
is 37.5°C or higher, and "No Fever" if the temperature is below 37.5°C. */
import java.util.Scanner;
public class fever{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        double f= sc.nextDouble();
        if(f<=37.5)
      System.out.println(" not fever");
    else
      System.out.println("fever");
    }
}