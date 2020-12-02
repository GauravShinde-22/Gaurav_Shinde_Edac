package DataStructure.Sort;
import java.util.Scanner;
class quicksort
{
    public static void main(String args[])
    {
        int i;
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=x.nextInt();
        int a[]=new int[n];
        
        System.out.println("Enter the array elemrnt");
        for(i=0;i<n;i++)
        {
            a[i]=x.nextInt();
        }
        quicksort qs=new quicksort();
        qs.sort(a,0,n-1);
        System.out.println("Sorted Array");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public void sort(int a[],int low,int high)
    {
        int pi=pivot(a,low,high);
        if(low<pi-1)
        {
            sort(a,low,pi-1);
        }
        if(pi<high)
        {
            sort(a,pi,high);
        }
    }
    int pivot(int a[],int low,int high)
    {
        int pio=a[low];
        while(low<=high)
        {
            while(a[low]<pio)
            {
                low++;
            }
            while(a[high]>pio)
            {
                high--;
            }
            if(low <= high)
            {
                int temp=a[low];
                a[low]=a[high];
                a[high]=temp;
                low++;
                high--;
            }
        }
        return low;
    }
}