package DataStructure.Sort;
import java.util.Scanner;
class meargsot
{
    public void sort(int a[],int low,int high)
    {
        int mid;
         //meargsot m=new  meargsot();
        if(low<high)
        {
            mid=(low+high)/2;
            sort(a,low,mid);
            sort(a,mid+1,high);
            combine(a,low,high,mid);
            
        }
    }
    public void combine(int a[],int low,int high,int mid)
    {
        int i,j,k,n;
        n=high;
        int temp[]=new int[n+2];
        k=low;
        i=low;
        j=mid+1;
        while(i<=mid && j<=high)
        {
            if(a[i]<=a[j])
            {
                temp[k]=a[i];
                i++;
                k++;
            }
            else
            {
                temp[k]=a[j];
                j++;
                k++;
            }
        }
        while(i<mid)
        {
            temp[k]=a[i];
            i++;
            k++;
        }
        while(j<high)
        {
            temp[k]=a[j];
            j++;
            k++;
        }
      //  System.out.println("After sort temp");
        for(k=low;k<n;k++)
        {
            a[k]=temp[k];
            //System.out.println(temp[k]);
        }
    }
    public void display(int a[],int n)
    {
       // int d=n+2;
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String args[])
    {
        meargsot ms=new meargsot();
        Scanner x=new Scanner(System.in);
        int i,high,low,n;
        System.out.println("Enter the size of array");
        n=x.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elemrnt");
        for(i=0;i<n;i++)
        {
            a[i]=x.nextInt();
        }
        System.out.println("Befor sort");
        ms.display(a,n);
        low=0;
        high=n-1;
        ms.sort(a,low,high);
        System.out.println("After sort");
        ms.display(a,n);
    }
}