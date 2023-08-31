/*Write code to create a checkerboard pattern with the words "black" and
"white".
Sample Output:
Input number of rows: 5
black-white-black-white-black
white-black-white-black-white
black-white-black-white-black
white-black-white-black-white
black-white-black-white-black */
import java.util.Scanner;
public class for66{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int x=i;
            for(int j=1;j<=n;j++){ 
                if(x%2==0){
                    System.out.print("white ");}
                    else{
                        System.out.print("black ");
                    }
               x++;

               
            }
            System.out.println();
        }sc.close();
    
    }
    
   
    
}