import java.util.Scanner;
class example4_3
{
 public static void main(String args[])
 {
   int n,i,count=0;
   Scanner x=new Scanner(System.in);
   System.out.print("\n Enter the Size of array = ");
   n=x.nextInt();
   int a[]=new int[n];
   System.out.println("Enter the Array Element");
   for(i=0;i<n;i++)
   {
     a[i]=x.nextInt();
   }
    int b=0;
    int c=0;
   for(i=0;i<(n-1);i++)
   {
     if(a[i]<=a[i+1])
      {
       b++;
      }
     else if(a[i]>=a[i+1])
     {
      c++;
     }
   }
    if(b==(n-1))
    {
     System.out.println("Acending Order");
    }
    else if(c==(n-1))
    {
     System.out.println("Decending Order");
    }
    else
    {
     System.out.println("Random Order");
    }
 } 
}