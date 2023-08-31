/*60. Write a program to input any number and print it in words. */
import java.util.Scanner;
public class for60 {
    static Scanner sc = new Scanner(System.in);
    static int count (int x){ int c=0;
        while(x>0){
            x/=10;
            c++;
        }return c;
    }
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();

        int s=count(n);
        int temp[] = new int[s];

        for(int i=0;n>0;i++){ 
            temp[i]=n%10;
            n/=10;}

        for(int j=temp.length-1;j>=0;j--){
            switch(temp[j]){
                case 0:System.out.println("zero");break;
                case 1:System.out.println("one");break;
                case 2:System.out.println("two");break;
                case 3:System.out.println("three");break;
                case 4:System.out.println("four");break;
                case 5:System.out.println("five");break;
                case 6:System.out.println("six");break;
                case 7:System.out.println("seven");break;
                case 8:System.out.println("eight");break;
                case 9:System.out.println("nine");break;
                
                
                

            }
        }   
    }       
}