/*Write a program to produce a square matrix with 0's down the main
diagonal, 1's in the entries just above and below the main diagonal, 2's above
and below that, etc.
0 1 2 3 4
1 0 1 2 3
2 1 0 1 2
3 2 1 0 1
4 3 2 1 0
 */
import java.util.Scanner;
public class for69{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x =i; 
            int k=0;
            for(int j=0;j<n;){ 
                if(x==0){
                    System.out.print(k);k++;}
                    else{
                        System.out.print(x);x--;
                    }
                    j++;
            

               
            }
            System.out.println();
        }sc.close();
    }
    
   
    
}