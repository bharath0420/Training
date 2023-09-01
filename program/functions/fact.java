import java.util.Scanner;

public class fact {
    static Scanner sc= new Scanner(System.in);
    static int fin(int n){    
        if (n == 0)    
          return 1;    
        else    
          return(n * fin(n-1));    
       }    
       public static void main(String args[]){  
        int fact=1; 
        System.out.println("ENTER THE NUMBER"); 
        int number=sc.nextInt(); 
        fact = fin(number);   
        System.out.println("Factorial of "+number+" is: "+fact);    
       }  
      }  
    

