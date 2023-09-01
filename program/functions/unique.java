
import java.util.*;
public class unique{
static Scanner sc= new Scanner(System.in);
static int[] sort(int a[],int n)
{
    int i,j,temp;
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    return a;
}
static int[] uni(int a[],int len)
{
    int i;
    sort(a,len);
    int j=0;
    for(i=0;i<len;i++)
    {
        if(a[i] != a[j])
        {
            j++;
            a[j]=a[i];
        }
    }
    for(i=0;i<=j;i++)
    {
        System.out.printf("%d",a[i]);
    }
    return a;
}
static public void main(String[]args){
    int[]x={1,5,4,5,2,6,7,1,6,4};
    int l=x.length;
    uni(x,l);

}
}
