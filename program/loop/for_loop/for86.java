/* 
 Write a program to count the letters, spaces, numbers and other characters
of an input string.
Sample Output:Enter a string: This is w3resource.com
The number of characters in the string is: 22
The number of alphabets are: 18
The number of digits are: 1
The number of spaces are: 2
The number of other characters are: 1
*/
import java.util.Scanner;
public class for86{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter a string");
        String str =sc.nextLine();
        str=str.toUpperCase();
        char[] arr = str.toCharArray();
        int alp=0;
        int num=0;
        int ws=0; 
        int spl=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>=48&& arr[i]<=57){
                num++;
            }else if(arr[i]>=65 && arr[i]<=90){
                alp++;
            }else if(arr[i]==32){
                ws++;
            }else{
                spl++;
            }


        }
        System.out.println("The number of characters in the string is:"+arr.length);
        System.out.println("The number of alphabets are:"+alp);
        System.out.println("The number of digits are:"+num);
        System.out.println("The number of spaces are:"+ws);
        System.out.println("The number of other characters are:"+spl);

        
    }
}