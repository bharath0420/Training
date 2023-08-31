/* Write a program to find the number and sum of all integer between 100 and
200 which are divisible by 9*/
public class for28 {
   
    
    public static void main (String[]args){
        for (int i=100;i<=200;i++){
            if(i%9==0){
                System.out.print(i+" ");
            }
        }
    }
}