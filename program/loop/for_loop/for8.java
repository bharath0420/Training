/* Write a program to find the last prime number occur before the entered */
import java.util.Scanner;
public class for8 {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");

        int n = sc.nextInt(); 
        
        for(int i=n-1;i>=2;i--){
            int count=0;
        
            for(int j=2; j<= i/2; j++)  { 
                
                 
                  if(i% j== 0){
                    count++;
                    
                }
                
            }
       
            if (count==0){System.out.println(i); break; }else {
                continue;}
        }

        
        
    }

}