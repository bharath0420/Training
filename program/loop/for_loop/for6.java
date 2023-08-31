/* Write a program to find the prime in the range */
import java.util.Scanner;
public class for6 {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the start number ");

        int n = sc.nextInt();        
        System.out.println("enter the end number ");
        int e=sc.nextInt();
        
        for(int i=n;i<=e;i++){if(i!=1){
             int count=0;
        
            for(int j=2; j<= i/2; j++)  { 
                
                 
                  if(i% j== 0){
                    count++;
                    
                }
                
            }
       
            if (count==0){System.out.println(i); }else {
                continue;}
        }
           
        }

        
        
    }

}