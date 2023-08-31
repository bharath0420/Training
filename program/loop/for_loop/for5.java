/* Write a program to find the prime or not  */
import java.util.Scanner;
public class for5 {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        if(n==1){System.out.print("1 not prime or composite");}
        else {
        
            for(int j=2; j<= n/2; j++)  { 
                
                 
                  if(n% j== 0){
                    System.out.print("not a prime");
                    break;
                }else{System.out.print("prime"); break;}
            }
       
            }
        }
    }

