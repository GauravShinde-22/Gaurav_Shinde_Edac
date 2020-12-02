package DataStructure.Sort;
import java.util.Scanner;
class bubblesort
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n,i,j,temp;
        bubblesort bs=new bubblesort();
        System.out.println("Enter the Size of Array");
        n=x.nextInt();
        int a[]=new int[n];
        System.out.println(" Enter the Array Element ");
        for(i=0;i<n;i++)
        {
            a[i]=x.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}