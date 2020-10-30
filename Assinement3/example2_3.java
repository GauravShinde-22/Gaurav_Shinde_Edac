//Array Average of 3 array element 
import java.util.Scanner;
class example2_3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array you want to take:");
        int sizeArray=sc.nextInt();
        int a[]=new int[sizeArray];
        for(int k=0;k<a.length;k++)
        {
            int array=sc.nextInt();
            a[k]=array;            
        }
        int i=0;
        int j=0;
        while(i<a.length-1)
        { 
            int c=i;
            int sum=0;
            if(i+2<=a.length-1)
            {
              while(c<=i+2)
                      {
                         sum= sum+a[c];
                         c++;
                      }
              System.out.print((sum/3)+" ");
            }
            else
            {
                break;
            }
            i++;
        }
    }
}
