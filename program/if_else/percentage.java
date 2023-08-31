import java.util.Scanner;
public class percentage{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        
        
        System.out.println("enter the 5 subject marks");
        int s1= sc.nextInt();
        
        int s2= sc.nextInt();
        int s3= sc.nextInt();
        int s4=sc.nextInt();
        int s5=sc.nextInt();
        double sum=s1+s2+s3+s4+s5;
        double avg=sum/5;
        if(avg>=90)
    {
        System.out.println("grade A");
    }
    else if(avg>=80)
    {
        System.out.println("grade B");
    }
    else if(avg>=80)
    {
        System.out.println("grade B");
    }
    else if(avg>=70)
    {
        System.out.println("grade C");
    }
    else if(avg>=60)
    {
        System.out.println("grade D");
    }
    else if(avg>=40)
    {
        System.out.println("grade E");
    }
    else
    {
        System.out.println("Fail");
    }
}
}