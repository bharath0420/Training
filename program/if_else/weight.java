/*Write a program that takes a person's weight in kilograms as input and prints
"Underweight" if the weight is below 18.5, "Normal weight" if the weight is between 18.5
and 24.9, "Overweight" if the weight is between 25 and 29.9, and "Obese" if the weight
is 30 or higher. */
import java.util.Scanner;
public class weight{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        double w= sc.nextDouble();
        if(w<18.5)
        System.out.println("Underweight");
    else if(w>=18.5 && w<=24.9)
        System.out.println("Normal weight");
    else if(w>=25&& w<=29.9)
        System.out.println("Overweight");
    else
        System.out.println("Obese");
    }
}
