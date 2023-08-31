/*Write a program that takes a person's blood pressure as input and prints "Normal" if the
systolic blood pressure is below 120 and the diastolic blood pressure is below 80,
"Elevated" if the systolic blood pressure is between 120 and 129 and the diastolic blood
pressure is below 80, "Stage 1 Hypertension" if the systolic blood pressure is between
130 and 139 or the diastolic blood pressure is between 80 and 89, and "Stage 2
Hypertension" if the systolic blood pressure is 140 or higher or the diastolic blood
pressure is 90 or higher. */
import java.util.Scanner;
public class bp{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        
        
        System.out.println("enter the systolic blood pressure");
        int b = sc.nextInt();
        System.out.println("enter the diastolic pressure");
        int p= sc.nextInt();
       if(b<120 && p<80)
           System.out.println("normal");
    else if ((b>=120 && b<129) && p<80)
      System.out.println("elevated");
    else if ((b>=130 && p<139) ||(b>80&&p<89 ))
      System.out.println("stage 1 hypertension");
    else 
      System.out.println("stage 2 hyper tension");
    }
    }