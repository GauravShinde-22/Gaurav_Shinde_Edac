import java.util.Scanner;
class example7_2
{
 public static void main(String args[])
  {
    int n,temp,j,i;
    Scanner x=new Scanner(System.in);
    System.out.print("Enter size of array= ");
    n=x.nextInt();
    int a[]=new int[n];
    for(i=0 ; i<n ; i++)
    {
     System.out.print("\n Enter the element = ");
     a[i]=x.nextInt();
    }
   for(i=0 ; i<n ; i++)
    {
     for(j=i+1 ; j<n ; j++)
     {
       if(a[i]<a[j])
       {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
       }
    
     }
    }
   System.out.println("-------Decending order---------");
   for(i=0 ; i<n-1 ; i++)
   {
    System.out.print(a[i]+",");
   }
   System.out.print(a[n-1]);
     //System.out.print("\b");
  }
}