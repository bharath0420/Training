/* Write a program to find the not prime in the range */
import java.util.Scanner;
public class for16 {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
             
        System.out.println("enter the end number ");
        int e=sc.nextInt();
        
        for(int i=1;i<=e;i++){
            int count=0;
        
            for(int j=2; j<= i/2; j++)  { 
                
                 
                  if(i% j== 0){
                    count++;
                    
                }
                
            }
       
            if (count!=0){System.out.print(i+" "); }else {
                continue;}
        }

        
        
    }

}