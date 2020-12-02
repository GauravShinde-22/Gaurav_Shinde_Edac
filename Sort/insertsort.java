package DataStructure.Sort;
import java.util.Scanner;
class insertsort
{ 
    void sort(int a[],int n)
    {
        int temp,j,i;
        for(i=0;i<n;i++)
        {
            temp=a[i];
            j=i-1;
            while(j>=0 && a[j]>temp)
            {
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=temp;
        }
        System.out.println("Sorted Array");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String args[])
    {
        insertsort is=new insertsort();
        Scanner x=new Scanner(System.in);
        int n;
        System.out.println("Enter the Size of array");
        n=x.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array element");
        for(int i=0;i<n;i++)
        {
            a[i]=x.nextInt();            
        }
        is.sort(a, n);
        
    }
}