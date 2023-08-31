/* Write a program to find the perfect numbers between 1 and 500.*/
public class for4{
    public static void main (String[]args){
        
        for (int i=1;i<=500;i++){int sum=0;
            for(int j=1; j<= i/2; j++) { 
                
                 
                  if(i% j== 0){
                        sum=sum+j;
                    }
                }if(i==sum){
            System.out.print(i+" ");}
        }
}
}
