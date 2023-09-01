import java.util.Scanner;

public class temp {
    static Scanner sc= new Scanner(System.in);
    static double conv(double c){
        double f;
        f =((c*9)/5)+32;  
        
        return f; 

    }
    public static void main(String args[]){  
        
        System.out.println("ENTER THE NUMBER"); 
        double x=sc.nextDouble();
        System.out.println("Temperature in Fahrenheit is: "+conv(x)); 
        
    
}
}