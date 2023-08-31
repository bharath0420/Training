import java.util.*;
class oddoreven{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int a= sc.nextInt();
        
        if(a%2==0)
        {
            System.out.println("even");

        }
        else{
            System.out.println("odd");
        }
        sc.close();
    }
}
